package com.mbit.inventorytracker.fragments.positions_list.empty_list

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.mbit.inventorytracker.fragments.abstraction.FragmentBase
import com.mbit.inventorytracker.R
import com.mbit.inventorytracker.cache.LocationCache.locationName
import com.mbit.inventorytracker.database.DBContext
import com.mbit.inventorytracker.database.dto.Item_Table
import com.mbit.inventorytracker.fragments.FragmentType
import com.mbit.inventorytracker.fragments.adapter.ItemAdapter
import com.mbit.inventorytracker.fragments.adapter.SearchEngine
import com.mbit.inventorytracker.fragments.adapter.TypesFactoryImpl
import com.mbit.inventorytracker.fragments.adapter.viewmodel.ItemViewModel
import com.mbit.inventorytracker.fragments.adapter.viewmodel.ViewModel
import io.reactivex.Observable
import io.reactivex.ObservableOnSubscribe
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.fragment_empty_list.*
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class EmptyListFragment : FragmentBase() {

    private lateinit var searchEngine: SearchEngine
    private lateinit var disposable: Disposable
    private lateinit var _adapter: ItemAdapter

    @Inject
    lateinit var databaseContext: DBContext

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        setHasOptionsMenu(true)
        return inflater.inflate(R.layout.fragment_empty_list, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        val viewModels = databaseContext.items.where(Item_Table.oldLocation.eq(locationName)).queryList().map { ItemViewModel(it, activity.baseContext) }
        rv_items.layoutManager = LinearLayoutManager(activity.baseContext)
        _adapter = ItemAdapter(viewModels.toMutableList(), TypesFactoryImpl(), FragmentType.EmptyListFragment)
        rv_items.adapter = _adapter
        searchEngine = SearchEngine(viewModels)
    }

    override fun onResume() {
        super.onResume()

        val textSearchObservable = createTextChangeObseravable()
        if (userVisibleHint) {
            etSearch.getText().clear()
            disposable = textSearchObservable.observeOn(AndroidSchedulers.mainThread())
                    .doOnNext { showProgressBar() }.observeOn(Schedulers.io())
                    .map<MutableList<ViewModel>> { s -> searchEngine.search(s) }.observeOn(AndroidSchedulers.mainThread())
                    .subscribe { supleList ->
                        hideProgressBar()
                        showResult(supleList)
                    }
        }
    }

    private fun createTextChangeObseravable(): Observable<String> {
        return Observable.create(ObservableOnSubscribe<String> { emitter ->
            val textWatcher = object : TextWatcher {

                override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}

                override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                    emitter.onNext(s.toString())
                }

                override fun afterTextChanged(s: Editable) {}
            }
            etSearch.addTextChangedListener(textWatcher)
            emitter.setCancellable { etSearch.removeTextChangedListener(textWatcher) }
        }).filter { s -> s.length >= 2 }.debounce(500, TimeUnit.MILLISECONDS)
    }

    override fun onPause() {
        super.onPause()
        if (userVisibleHint)
            if (!disposable.isDisposed)
                disposable.dispose()
    }

    private fun showProgressBar() {
        progress_bar.visibility = View.VISIBLE
    }

    private fun hideProgressBar() {
        progress_bar.visibility = View.GONE
    }

    private fun showResult(result: MutableList<ViewModel>) {
        if (result.isEmpty()) {
            Toast.makeText(activity, getString(R.string.not_match), Toast.LENGTH_SHORT).show()
            _adapter.setListItem(emptyList<ViewModel>().toMutableList())
        } else {
            _adapter.setListItem(result)
        }
    }
}
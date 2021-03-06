package com.mbit.inventorytracker.fragments.abstraction

import android.content.Context
import android.widget.Toast
import com.zhuinden.simplestack.Backstack
import com.mbit.inventorytracker.backstack.BackstackService
import com.mbit.inventorytracker.backstack.BaseRoute
import com.mbit.inventorytracker.fragments.abstraction.FragmentBase

//TODO: after deleting current fragment general base, delete these extension methods
fun FragmentBase.getBackStack(): Backstack = BackstackService.get(activity)

fun FragmentBase.showError(ctx:Context, message: String, length: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(ctx, message, length).show()
}

@Deprecated("Use route instead", ReplaceWith("route"))
val FragmentBase.key: Any?
    get() = arguments.get("KEY")

val FragmentBase.route: BaseRoute? get() = arguments.get("KEY") as? BaseRoute

fun FragmentBase.toast(message: CharSequence, duration: Int =  Toast.LENGTH_SHORT) = Toast.makeText(activity, message, duration).show()
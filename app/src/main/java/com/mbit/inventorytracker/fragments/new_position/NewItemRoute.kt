package com.mbit.inventorytracker.fragments.new_position

import android.os.Bundle
import android.os.Parcel
import com.mbit.inventorytracker.backstack.BaseRoute
import paperparcel.PaperParcel

const val NEW_ITEM_CODE = "item_code"
const val NEW_ITEM_LOCATION = "new_item_location"

@PaperParcel
data class NewItemRoute(val locationName: String? = null, val code: String? = null, val tag: String = NewItemRoute::javaClass.name) : BaseRoute() {

    override fun createFragment() = NewItemFragment().apply {
        arguments = (arguments ?: Bundle()).apply {
            putString(NEW_ITEM_CODE, code)
            putString(NEW_ITEM_LOCATION, locationName)
        }
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        PaperParcelNewItemRoute.writeToParcel(this, parcel, flags)
    }

    companion object {
        @JvmField
        val CREATOR = PaperParcelNewItemRoute.CREATOR
    }
}
package com.mbit.inventorytracker.fragments.scan_positions

import android.annotation.SuppressLint
import android.app.Dialog
import android.app.DialogFragment
import android.os.Bundle
import android.support.v7.app.AlertDialog
import com.mbit.inventorytracker.R

@SuppressLint("ValidFragment")
class NewPositionDialogFragment(val block: () -> Unit) : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val alertDialog = AlertDialog.Builder(activity)
        val alert = alertDialog.create()
        alert.setCanceledOnTouchOutside(false)
        val inflater = activity.layoutInflater
        val v = inflater.inflate(R.layout.dialog_new_position, null)
        v.findViewById(R.id.bNo).setOnClickListener { dismiss() }
        v.findViewById(R.id.bYes).setOnClickListener {
            block.invoke()
            dismiss () }
        alert.setView(v)
        alertDialog.create()
        return alert
    }
}
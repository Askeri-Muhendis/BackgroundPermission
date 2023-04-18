package com.ibrahimethemsen.backgroundpermission

import android.app.Activity
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.Window
import android.widget.Button

class ViewDialog {
    fun showResetPasswordDialog(activity: Activity?,next : () -> Unit,cancel : () -> Unit) {
        val dialog = Dialog(activity!!).apply {
            requestWindowFeature(Window.FEATURE_NO_TITLE)
            setCancelable(false)
            setContentView(R.layout.alert_dialog)
            window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            findViewById<Button>(R.id.next_btn).apply {
                setOnClickListener {
                    next()
                    dismiss()
                }
            }
            findViewById<Button>(R.id.cancel_btn).apply {
                setOnClickListener {
                    cancel()
                    dismiss()
                }
            }
        }.show()
    }
}
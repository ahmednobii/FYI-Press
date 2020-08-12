package me.ahmednobi.fiypress.utilities

import android.content.Context
import android.view.KeyEvent
import android.view.MotionEvent
import android.view.View
import android.webkit.WebView

fun WebView.init(context:Context) {
   this.visibility = View.INVISIBLE
   this.settings.domStorageEnabled = true
   this.settings.javaScriptEnabled = true
   this.addJavascriptInterface(JSInterface(context) ,"Android")
   this.canGoBack()
   this.webViewClient = CustomWebViewClient()
this.setOnKeyListener { v, keyCode, event ->

    when (keyCode ==KeyEvent.KEYCODE_BACK
         && event.action == MotionEvent.ACTION_UP
         && this.canGoBack())
      {
        true ->{
         this.goBack()
       true
      }
      else-> {
         false
      }
   }

}
}
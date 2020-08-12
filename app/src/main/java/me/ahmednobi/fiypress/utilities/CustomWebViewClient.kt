package me.ahmednobi.fiypress.utilities

import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient

class CustomWebViewClient  : WebViewClient() {
    override fun onPageFinished(view: WebView?, url: String?) {
        super.onPageFinished(view, url)
        view?.loadUrl("javascript:(function() {document.getElementsByTagName('header')[0].style.display = 'none'; })()")
        view?.visibility= View.VISIBLE
    }

    override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
        view?.webViewClient=CustomWebViewClient()
        return false
    }

}
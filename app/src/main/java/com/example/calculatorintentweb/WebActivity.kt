package com.example.calculatorintentweb

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class WebActivity : AppCompatActivity() {
    lateinit var wb_view:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        wb_view=findViewById(R.id.webView)
        webview()
    }
    private fun webview(){
        wb_view.webViewClient= WebViewClient()
        wb_view.apply {
            loadUrl("https://www.google.com/search?q=youtube&ei=KoPWYpWyI_CFxc8Pk5SloAE&ved=0ahUKEwiV78GX24T5AhXwQvEDHRNKCRQQ4dUDCA4&uact=5&oq=youtube&gs_lcp=Cgdnd3Mtd2l6EAMyEQguEIAEELEDEIMBEMcBENEDMggIABCABBCxAzIECAAQQzIICAAQgAQQsQMyBAgAEEMyBQgAEIAEMgUIABCABDIECAAQQzILCAAQgAQQsQMQgwEyBQgAEIAEOgcIABBHELADOgoIABDkAhCwAxgBOgYIABAeEBY6FAgAEOoCELQCEIoDELcDENQDEOUCOggIABCxAxCDAToECAAQAzoQCC4QsQMQgwEQxwEQ0QMQQ0oECEEYAEoECEYYAVC8UViwbmDxdWgEcAF4BIAB4wKIAdIbkgEFMi01LjeYAQCgAQGwAQrIAQ3AAQHaAQYIARABGAk&sclient=gws-wiz")
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
        }

    }

    override fun onBackPressed() {
        if (wb_view.canGoBack())wb_view.goBack() else
        super.onBackPressed()
    }
}
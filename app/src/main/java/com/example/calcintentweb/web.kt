package com.example.calcintentweb

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class web : AppCompatActivity() {
    lateinit var mywebview:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        mywebview=findViewById(R.id.webView)
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webview(){
        mywebview.webViewClient= WebViewClient()
        mywebview.apply {
            loadUrl("https://www.instagram.com/")
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
        }
    }
}
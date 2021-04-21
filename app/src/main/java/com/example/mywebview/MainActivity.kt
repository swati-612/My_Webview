package com.example.mywebview


import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.EditText
import android.widget.SearchView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*




class MainActivity : AppCompatActivity() {

    var instagram = "https://www.instagram.com/"
    var facebook = "https://www.facebook.com/"
    var youtube = "https://www.youtube.com/"
    var twitter = "https://twitter.com/"
    var gmail = "https://www.gmail.com/"

   // private var Webview : WebView? = null
   // private var searchView : SearchView? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //    Webview = findViewById(R.id.webview) as WebView
        //    Webview!!.webViewClient = WebViewClient()
        //    searchView = findViewById(R.id.searchview) as SearchView
        //    searchView!!.setOnQueryTextListener(object SearchView.OnQueryTextListener {

        //fun onQueryTextSubmit(query : String?) : Boolean {
        //    Webview?.run { loadUrl("https://www.google.com/search?q=" + searchView!!.query) }
        //    return false
        //}
        //    fun onQueryTextChange(newText : String?) : Boolean {
        //  return false
        // }
    //})



        webview.loadUrl("https://www.google.com/")

        webview.settings.builtInZoomControls=true
        webview.settings.javaScriptEnabled=true
        
        webview.webViewClient= object : WebViewClient() {
            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                super.onPageStarted(view, url, favicon)
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
            }

            override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
                return super.shouldOverrideUrlLoading(view, request)
            }
        }
    }


    fun load (view: View){
        webview.loadUrl("url")


  when(view.id){

      R.id.btn_instagram->webview.loadUrl(instagram)
      R.id.btn_facebook->webview.loadUrl(facebook)
      R.id.btn_youtube->webview.loadUrl(youtube)
      R.id.btn_twitter->webview.loadUrl(twitter)
      R.id.btn_gmail->webview.loadUrl(gmail)
      R.id.searchview->
      {
           webview.loadUrl("https://www.google.com/")
      }

     }
    }
}

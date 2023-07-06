package com.jeffersondantas.amongzap;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
  private WebView webView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    setContentView(R.layout.activity_main);

    webView = (WebView) findViewById(R.id.webview);
    webView.setWebViewClient(new WebViewClient());
    webView.setBackgroundColor(Color.TRANSPARENT);
    webView.loadUrl("https://amongzap.jeffersondantas.repl.co/chat");

    WebSettings webSettings = webView.getSettings();
    webSettings.setJavaScriptEnabled(true);
    webSettings.setDomStorageEnabled(true);
  }

  @Override
  public void onBackPressed() {
    if (webView.canGoBack()) {
      webView.goBack();
    } else {
      super.onBackPressed();
    }
  }
}

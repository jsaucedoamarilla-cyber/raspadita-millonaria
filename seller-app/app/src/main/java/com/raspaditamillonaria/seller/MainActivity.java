package com.raspaditamillonaria.seller;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
  @Override public void onCreate(Bundle b) {
    super.onCreate(b);
    WebView w = new WebView(this);
    WebSettings s = w.getSettings();
    s.setJavaScriptEnabled(true);
    s.setDomStorageEnabled(true);
    s.setLoadsImagesAutomatically(true);
    w.setWebViewClient(new WebViewClient() {
      @Override public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        Uri uri = request.getUrl();
        String scheme = uri.getScheme();
        if ("https".equalsIgnoreCase(scheme) && uri.getHost() != null &&
            (uri.getHost().equalsIgnoreCase("wa.me") || uri.getHost().endsWith(".whatsapp.com"))) {
          try { startActivity(new Intent(Intent.ACTION_VIEW, uri)); } catch (Exception ignored) {}
          return true;
        }
        return false;
      }
    });
    w.setWebChromeClient(new WebChromeClient());
    setContentView(w);
    w.loadUrl("file:///android_asset/seller.html");
  }
  @Override public void onBackPressed() { super.onBackPressed(); }
}

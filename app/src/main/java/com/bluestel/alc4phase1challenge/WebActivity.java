package com.bluestel.alc4phase1challenge;

import android.app.ActionBar;
import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        assert getSupportActionBar() != null;   //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);   //show back button

        WebView web = findViewById(R.id.alc_webView);
        web.loadUrl("https://andela.com/alc/");
        web.getSettings().setDomStorageEnabled(true);
        web.setWebViewClient(new WebViewClient());

    }
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

}

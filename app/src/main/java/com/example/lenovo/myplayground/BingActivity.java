package com.example.lenovo.myplayground;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class BingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bing);

        WebView bingView = (WebView) findViewById(R.id.webViewBing);
        bingView.loadUrl("https://www.bing.com/");
    }
}

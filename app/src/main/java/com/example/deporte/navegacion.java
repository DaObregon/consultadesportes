package com.example.deporte;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class navegacion extends AppCompatActivity {

    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navegacion);

        webView=findViewById(R.id.WBdeporte);
        String nombre=getIntent().getStringExtra("nombre");
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.footballdatabase.eu/es/search_result&q="+nombre);

    }
}
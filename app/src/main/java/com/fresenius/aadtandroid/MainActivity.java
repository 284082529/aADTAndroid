package com.fresenius.aadtandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;

import io.flutter.embedding.android.FlutterActivity;

public class MainActivity extends AppCompatActivity {

    Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        init();
    }

    private void init(){
        startActivity(
                FlutterActivity.createDefaultIntent(mContext)
        );
    }

}

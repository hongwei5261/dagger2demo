package com.dagger2.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t = null;
        t.setOnClickListener(__ -> getClass());

        t.setOnClickListener( __ -> {});

        new Thread(() -> {
            Log.d("", "");
        }).start();
    }
    //20977993 宣伟
}

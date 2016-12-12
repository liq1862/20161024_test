package com.example.user.a20161024_test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RecActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rec);

        TextView tv = (TextView) findViewById(R.id.textView2);
        Intent it = new Intent();
        String data = it.getStringExtra(Intent.EXTRA_TEXT); //接收
        tv.setText(data);
    }
}

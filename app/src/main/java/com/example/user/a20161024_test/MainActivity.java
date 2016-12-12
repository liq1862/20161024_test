package com.example.user.a20161024_test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);     //由activity_main.xml來設定activity_main的內容
    }

    public void Click1(View v)      //傳送文字
    {
        EditText et = (EditText) findViewById(R.id.editText);
        String str = et.getText().toString();

        Intent it = new Intent();
        it.setAction(Intent.ACTION_SEND);       //設定為傳送
        it.setType("text/plain");                    //設定為文字
        it.putExtra(Intent.EXTRA_TEXT,str);
        startActivity(it);
    }
}

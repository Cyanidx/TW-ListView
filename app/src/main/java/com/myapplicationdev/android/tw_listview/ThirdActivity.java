package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.myapplicationdev.android.tw_listview.R.id.tvYear;

public class ThirdActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tv = (TextView)findViewById(R.id.textView);

        Intent i = getIntent();
        String year = i.getStringExtra("code");
        tv.setText(year);
    }
}

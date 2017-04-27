package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FirstActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<String> al;
    ArrayAdapter<String> aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView)findViewById(R.id.lvText);

        al = new ArrayList<String>();
        al.add("Year 1");
        al.add("Year 2");
        al.add("Year 3");

        aa = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,al);

        lv.setAdapter(aa);
        aa.notifyDataSetChanged();

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0){

                    Intent i = new Intent(FirstActivity.this, SecondActivity.class);
                    i.putExtra("year", "Year 1");
                    startActivity(i);
                } else if (position == 1){
                    Intent i = new Intent(FirstActivity.this, SecondActivity.class);
                    i.putExtra("year", "Year 2");
                    startActivity(i);
                } else {
                    Intent i = new Intent(FirstActivity.this, SecondActivity.class);
                    i.putExtra("year", "Year 3");
                    startActivity(i);
                }

            }
        });



    }
}

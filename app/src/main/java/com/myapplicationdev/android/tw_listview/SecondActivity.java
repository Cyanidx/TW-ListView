package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvYear;
    ArrayAdapter aa;
    ArrayList<Modules> modules;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //lv = (ListView) this.findViewById(R.id.lvModules);
        tvYear = (TextView) findViewById(R.id.tvYear);

        Intent i = getIntent();
        String year = i.getStringExtra("year");
        tvYear.setText(year);

        lv = (ListView) findViewById(R.id.lvText);
        modules = new ArrayList<Modules>();
        modules.add(new Modules("C208", true));
        modules.add(new Modules("C200", false));
        modules.add(new Modules("C346", true));

        aa = new ModuleAdapter(this, R.layout.row, modules);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0){

                    Intent i = new Intent(SecondActivity.this, ThirdActivity.class);
                    i.putExtra("code", "C208 is fun");
                    startActivity(i);
                } else if (position == 1){
                    Intent i = new Intent(SecondActivity.this, ThirdActivity.class);
                    i.putExtra("code", "C200 is fun");
                    startActivity(i);
                } else {
                    Intent i = new Intent(SecondActivity.this, ThirdActivity.class);
                    i.putExtra("code", "C346 is fun");
                    startActivity(i);
                }

            }
        });



    }



}

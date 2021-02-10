package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class  item1 extends AppCompatActivity {

    ListView listView1;
    String[] subjects ={"Hindi","English","Mathematics","Social Science","Science"}; ;
     String[] urls = {"https://drive.google.com/file/d/1y01opMMY9gOzHCmBuUipG2pXRcZHiSQL/view?usp=sharing",
                      "https://drive.google.com/file/d/1Xx6xI2zohSOEX-GdiWsFCZmKj2kpuWsr/view?usp=sharing",
                      "https://drive.google.com/file/d/11FxEuh6H1h6om9E74UpM1P4xvJTgBhRR/view?usp=sharing ",
                      "https://drive.google.com/file/d/1_nZjz1j9rWWs-T0-LP7l3FHnjyL4qWzw/view?usp=sharing",
                      "https://drive.google.com/file/d/1EOt5rHAv7tRVlLEVhwPsglciGp2b99NI/view?usp=sharing"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item1);
        getSupportActionBar().setTitle("10th Class UP Board");
        getSupportActionBar().setSubtitle("Subjects");

         getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView1 = (ListView) findViewById(R.id.lists);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(item1.this , android.R.layout.simple_dropdown_item_1line, subjects);
        listView1.setAdapter(adapter);
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,long id) {


                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(urls[position]));
                    startActivity(i);

                }
        });

    }
}
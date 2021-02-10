package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class item3 extends AppCompatActivity {

    ListView listView3;
    String[] subjects = {"Hindi","English","Mathematics","Chemistry","Physics"};
    String[] urls ={"https://upmsp.edu.in/Downloads/MODEL_PAPER_2018_19_Inter/101-HINDI.pdf",
                   "https://upmsp.edu.in/Downloads/MODEL_PAPER_2018_19_Inter/117-ENGLISH.pdf",
                   "https://drive.google.com/file/d/18Rjt3VwZgvrWt4MzIajmGBcLDnC2KNHr/view?usp=sharing",
                   "https://drive.google.com/file/d/18TBu36bpXiio0d9FdLqrrohn1VJ8ewHZ/view?usp=sharing",
                   "https://drive.google.com/file/d/18Fvk0dqJRw-r5BWk4UO893urpilUF8zO/view?usp=sharing"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item3);
        getSupportActionBar().setTitle("12th Class UP Board");
        getSupportActionBar().setSubtitle("Subjects");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        listView3 = (ListView) findViewById(R.id.listsss);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(item3.this , android.R.layout.simple_dropdown_item_1line, subjects);
        listView3.setAdapter(adapter);
        listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,long id) {


                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(urls[position]));
                startActivity(i);

            }
        });

    }
}
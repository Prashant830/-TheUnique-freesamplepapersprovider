package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class pulice extends AppCompatActivity {
    ListView listView6;
    String[] papers = {"Sample Paper 1","Sample Paper 2","Sample Paper 3"};
    String[] urls = {"https://drive.google.com/file/d/17L-D8WRrEntT9lF5s2aVV7rhKfrEGOMq/view?usp=sharing",
                    "https://drive.google.com/file/d/17NRCWV8tqdj7GoRG4eaX41IUeDSvEUB0/view?usp=sharing",
                     "https://drive.google.com/file/d/1Npnf3Cae0XC-Sw4r1IO-5ocJaCw_oN1a/view?usp=sharing"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pulice);
        getSupportActionBar().setTitle("UP Police Constable");
        getSupportActionBar().setSubtitle("Sample papers");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        listView6 = (ListView) findViewById(R.id.listaa);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(pulice.this , android.R.layout.simple_dropdown_item_1line, papers);
        listView6.setAdapter(adapter);
        listView6.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(urls[position]));
                startActivity(i);

            }
        });


    }
}
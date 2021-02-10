package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class indiannavy extends AppCompatActivity {

    ListView listView5;
    String[] papers = {"Sample Paper 1","Sample Paper 2","Sample Paper 3","Sample Paper 4","Sample Paper 5"};
    String[] urls = {"https://drive.google.com/file/d/185NYTzwnTvjIodpAlKNGfeWowcxn9Hs3/view?usp=sharing",
                    "https://drive.google.com/file/d/1KEoDJ8I3sq-sLZMQ-FAbvO6j0evqCq-1/view?usp=sharing",
                    "https://drive.google.com/file/d/1d78VpJIaLKj3262uXved0glV98QtC73i/view?usp=sharing",
                    "https://drive.google.com/file/d/1G7-74MXHqEqNVndimia9ne0W3W4sdIFo/view?usp=sharing",
                    "https://drive.google.com/file/d/1OF8XgvNuwTTOKBUm647LJ3eU-7H8V98f/view?usp=sharing"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indiannavy);
        getSupportActionBar().setTitle("Indian Navy SSR");
        getSupportActionBar().setSubtitle("Sample papers");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        listView5 = (ListView) findViewById(R.id.lista);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(indiannavy.this , android.R.layout.simple_dropdown_item_1line, papers);
        listView5.setAdapter(adapter);
        listView5.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(urls[position]));
                startActivity(i);

            }
        });
    }
}
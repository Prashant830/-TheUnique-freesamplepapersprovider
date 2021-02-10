package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class item4 extends AppCompatActivity {

    ListView listView4;
    String[] subjects = {"Hindi","English","Mathematics","Chemistry","Physics"};
    String[] urls ={"https://www.careerindia.com/cbse-class-12-hindi-core-question-papers-sq71.html",
            "https://www.learncbse.in/cbse-previous-year-question-papers-class-12-english/",
                   "https://www.learncbse.in/cbse-previous-year-question-papers-class-12-maths/",
                   "https://www.learncbse.in/cbse-previous-year-question-papers-class-12-chemistry/",
                   "https://www.learncbse.in/cbse-previous-year-question-papers-class-12-physics/"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item4);
        getSupportActionBar().setTitle("12th Class CBSE Board");
        getSupportActionBar().setSubtitle("Subjects");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        listView4 = (ListView) findViewById(R.id.listssss);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(item4.this, android.R.layout.simple_dropdown_item_1line, subjects);
        listView4.setAdapter(adapter);
        listView4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,long id) {


                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(urls[position]));
                startActivity(i);

            }
        });


    }
}
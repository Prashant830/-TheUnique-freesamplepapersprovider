package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class item2 extends AppCompatActivity {

    ListView listView2;
    String[] subjects = {"Hindi","English","Mathematics","Social Science","Science"};
    String[] urls ={"https://drive.google.com/file/d/1vWkXhLvN40QytGDYg-jFXujrVTMUbJem/view?usp=sharing",
                    "https://drive.google.com/file/d/1SsSIjflltgxKajnA2V43CCoC6WXcckR-/view?usp=sharing",
                    "https://drive.google.com/file/d/1nG2xAuTF7i5QqFENNpNO5ZQjyLy31ujC/view?usp=sharing",
                    "https://drive.google.com/file/d/1uBUcoGAXMSkc3Bqgf9WBDDP_BGqr7k9H/view?usp=sharing",
                    "https://drive.google.com/file/d/1VScIVg2jYbwGwbRXQqau8nyTEXaVg6HX/view?usp=sharing"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item2);
        getSupportActionBar().setTitle("10th Class CBSE Board");
        getSupportActionBar().setSubtitle("Subjects");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        listView2 = (ListView) findViewById(R.id.listss);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(item2.this , android.R.layout.simple_dropdown_item_1line, subjects);
        listView2.setAdapter(adapter);
        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,long id) {


                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(urls[position]));
                startActivity(i);

            }
        });


    }
}
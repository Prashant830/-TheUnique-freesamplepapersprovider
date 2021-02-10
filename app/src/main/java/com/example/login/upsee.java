package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class upsee extends AppCompatActivity {

    ListView listView7;
    String[] papers = {"Sample Paper 1","Sample Paper 2","Sample Paper 3"};
    String[] urls = {"https://drive.google.com/file/d/1888j4UnfzzGa13bUagusNx4OvSV9vEu4/view?usp=sharing",
                     "https://drive.google.com/file/d/189O_oOZdKXXnmomXPorUesHPrmpbO5IL/view?usp=sharing",
                     "https://drive.google.com/file/d/18CYcKaZp5pbc-SD1X_DRrvL7LTYuI5Kk/view?usp=sharing"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upsee);
        getSupportActionBar().setTitle("UPSEE");
        getSupportActionBar().setSubtitle("Sample papers");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        listView7 = (ListView) findViewById(R.id.listaaa);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(upsee.this , android.R.layout.simple_dropdown_item_1line, papers);
        listView7.setAdapter(adapter);
        listView7.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(urls[position]));
                startActivity(i);

            }
        });

    }
}
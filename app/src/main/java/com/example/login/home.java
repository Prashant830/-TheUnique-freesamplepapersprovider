package com.example.login;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class  home extends AppCompatActivity {

    ListView listView;
    private FirebaseAuth mAuth;

    String[] courses = {"10th class UP board sample papers","10th class CBSE board sample papers","12th class UP board sample papers",
            "12th class CBSE board sample papers", "UP Police Constable sample paper","Indian Navy SSR sample paper", "UPSEE sample paper"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().setTitle("Home");



        mAuth = FirebaseAuth.getInstance();
       // FirebaseUser user = mAuth.getCurrentUser();


        listView = (ListView) findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(home.this , android.R.layout.simple_dropdown_item_1line, courses);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                 if (position == 0){
                     Intent i = new Intent(view.getContext(), item1.class);
                     startActivity(i);

                 }
                if (position == 1){
                    Intent i = new Intent(view.getContext(), item2.class);
                    startActivity(i);

                }
                if (position == 2){
                    Intent i = new Intent(view.getContext(), item3.class);
                    startActivity(i);

                }
                if (position == 3){
                    Intent i = new Intent(view.getContext(), item4.class);
                    startActivity(i);

                }
                if (position == 4){
                    Intent i = new Intent(view.getContext(), pulice.class);
                    startActivity(i);

                }
                if (position == 5){
                    Intent i = new Intent(view.getContext(), indiannavy.class);
                    startActivity(i);

                }
                if (position == 6){
                    Intent i = new Intent(view.getContext(), upsee.class);
                    startActivity(i);

                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){

          case R.id.share_button:
              Intent sharingIntent = new Intent(Intent.ACTION_SEND);
              sharingIntent.setType("text/plain");
              String shareBody="https://github.com/Prashant830/-TheUnique-freesamplepapersprovider.git";
              String shareSubject="Clone this useful application it hare:-";

              sharingIntent.putExtra(Intent.EXTRA_TEXT,shareBody);
              sharingIntent.putExtra(Intent.EXTRA_SUBJECT,shareSubject);

              startActivity(Intent.createChooser(sharingIntent,"share Using"));

               break;
            case R.id.log_out:
                Toast.makeText(this,"logout successfully",Toast.LENGTH_SHORT).show();
                mAuth.signOut();
                Intent i = new Intent(home.this, MainActivity.class);
                startActivity(i);
                break;
            case R.id.about_button:
                Intent m = new Intent(home.this, About.class);
                startActivity(m);

                break;
            case R.id.contact_button:

                Intent n = new Intent(home.this, contact.class);
                startActivity(n);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
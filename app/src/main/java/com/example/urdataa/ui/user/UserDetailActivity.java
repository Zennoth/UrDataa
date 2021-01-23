package com.example.urdataa.ui.user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.urdataa.R;
import com.example.urdataa.model.Event;

public class UserDetailActivity extends AppCompatActivity {
    TextView ednamatitle, ednameevent, edlecturer, edlecturenirp, edeventdate, edeventlocation, edeventdesc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_user_detail);
        Intent intent = getIntent();
        Event event = intent.getParcelableExtra("data");

        Log.e("datanya", event.getEventname());

        ednamatitle = findViewById(R.id.ed_eventname);
        ednameevent = findViewById(R.id.ed_event_name);
        edlecturer = findViewById(R.id.ed_lecturer);
        edlecturenirp = findViewById(R.id.ed_lecturer_nip);
        edeventdate = findViewById(R.id.ed_event_date);
        edeventlocation = findViewById(R.id.ed_event_location);
        edeventdesc = findViewById(R.id.ed_event_desc);

        ednamatitle.setText(event.getEventname());
        ednameevent.setText(event.getEventname());
        edlecturer.setText(event.getLecturer());
        edlecturenirp.setText(event.getNip());
        edeventdate.setText(event.getDate());
        edeventlocation.setText(event.getLocation());
        edeventdesc.setText(event.getDesc());

    }


}
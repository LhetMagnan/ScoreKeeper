package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FootballTeam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_football_team);
    }

    public void goFootball(View view) {
        Intent i = new Intent(this, FootballScore.class);
        startActivity(i);
    }
}

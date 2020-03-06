package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BasketballTeam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basketball_team);
    }

    public void go(View view) {
        Intent i = new Intent(this, BasketballScore.class);
        startActivity(i);
    }
}

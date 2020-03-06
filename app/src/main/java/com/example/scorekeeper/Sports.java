package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Sports extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);
    }

    public void football(View view) {
        Intent i = new Intent(this, FootballTeam.class);
        startActivity(i);
    }

    public void basketball(View view) {
        Intent i = new Intent(this, BasketballTeam.class);
        startActivity(i);
    }
}

package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getStarted(View view) {
        Intent i = new Intent(this, Sports.class);
        startActivity(i);
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

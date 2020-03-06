package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FootballScore extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int redCardTeamA = 0;
    int redCardTeamB = 0;
    int yellowCardTeamA = 0;
    int yellowCardTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_football_score);
    }

    public void displayScoreA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayRedA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_red_card);
        scoreView.setText(String.valueOf(score));
    }

    public void displayYellowA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellow_card);
        scoreView.setText(String.valueOf(score));
    }

    public void displayScoreB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayRedB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_red_card);
        scoreView.setText(String.valueOf(score));
    }

    public void displayYellowB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellow_card);
        scoreView.setText(String.valueOf(score));
    }
    public void addScoreB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayScoreB(scoreTeamB);
    }


    public void addRedCardB(View view) {
        redCardTeamB = redCardTeamB + 1;
        displayRedB(redCardTeamB);
    }


    public void addYellowCardB(View view) {
        yellowCardTeamB = yellowCardTeamB + 1;
        displayYellowB(yellowCardTeamB);
    }

    public void addScoreA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayScoreA(scoreTeamA);
    }

    public void addRedCardA(View view) {
        redCardTeamA = redCardTeamA + 1;
        displayRedA(redCardTeamA);
    }

    public void addYellowCardA(View view) {
        yellowCardTeamA = yellowCardTeamA + 1;
        displayYellowA(yellowCardTeamA);
    }

    public void resetButton(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        redCardTeamA = 0;
        redCardTeamB = 0;
        yellowCardTeamA = 0;
        yellowCardTeamB = 0;

        displayScoreA(scoreTeamA);
        displayScoreB(scoreTeamB);
        displayRedA(redCardTeamA);
        displayRedB(redCardTeamB);
        displayYellowA(yellowCardTeamA);
        displayYellowB(yellowCardTeamB);
    }
}

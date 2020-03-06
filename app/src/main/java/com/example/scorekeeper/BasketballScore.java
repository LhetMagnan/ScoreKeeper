package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BasketballScore extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basketball_score);

        displayForTeamA(0);
        displayForTeamB(0);
//        displayTeam1b();
//        displayTeam2b();
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

//    public void displayTeam1b(){
//        TextView team1b = (TextView) findViewById(R.id.team1b);
//        TextView edit1b = (TextView) findViewById(R.id.team1_choose_b);
//        team1b.setText(edit1b.getText());
//    }
//
//    public void displayTeam2b(){
//        TextView team2b = (TextView) findViewById(R.id.team2b);
//        TextView edit2b = (TextView) findViewById(R.id.team2_choose_b);
//        team2b.setText(edit2b.getText());
//    }

    public void addThreeForTeamA(View view) {
        scoreTeamA = scoreTeamA +3;
        displayForTeamA(scoreTeamA);
    }

    public void addTwoForTeamA(View view) {
        scoreTeamA =  scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    public void addOneForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }


    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addOneForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoForTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    public void addThreeForTeamB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    public void resetButton(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}

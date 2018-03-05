package com.example.android.courtcounter;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;
    int foulA = 0;
    int foulB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given fouls for Team A.
     */
    public void displayFoulsTeamA(int fouls) {
        TextView scoreView = findViewById(R.id.team_a_fouls);
        if(fouls>=5) {
            scoreView.setTextColor(Color.RED);
        }
        else {
            scoreView.setTextColor(Color.BLACK);
        }
        scoreView.setText(String.valueOf(fouls));
    }
    /**
     * Displays the given fouls for Team B.
     */
    public void displayFoulsTeamB(int fouls) {
        TextView scoreView = findViewById(R.id.team_b_fouls);
        if(fouls>=5) {
            scoreView.setTextColor(Color.RED);
        }
        else {
            scoreView.setTextColor(Color.BLACK);
        }
        scoreView.setText(String.valueOf(fouls));
    }
    /**
     * Add one foul to Team A
     */
    public void addFoulA(View view) {
        if (foulA<5) {
            foulA = foulA + 1;
        }

        displayFoulsTeamA(foulA);
    }
    /**
     * Add one foul to Team B
     */
    public void addFoulB(View view) {
        if (foulB<5) {
            foulB = foulB + 1;
        }

        displayFoulsTeamB(foulB);
    }
    /**
     * Add one point to Team A
     */
    public void onePointA(View view) {
        scoreA = scoreA + 1;

        displayForTeamA(scoreA);
    }
    /**
     * Add two points to Team A
     */
    public void twoPointsA(View view) {
        scoreA = scoreA + 2;

        displayForTeamA(scoreA);
    }
    /**
     * Add three points to Team A
     */
    public void threePointsA(View view) {
        scoreA = scoreA + 3;
        displayForTeamA(scoreA);
    }
    /**
     * Add one point to Team B
     */
    public void onePointB(View view) {
        scoreB = scoreB + 1;

        displayForTeamB(scoreB);
    }
    /**
     * Add two points to Team B
     */
    public void twoPointsB(View view) {
        scoreB = scoreB + 2;

        displayForTeamB(scoreB);
    }
    /**
     * Add three points to Team B
     */
    public void threePointsB(View view) {
        scoreB = scoreB + 3;
        displayForTeamB(scoreB);
    }

    /**
     * Reset fouls at zero for both teams
     */
    public void resetFouls(View view) {
        foulA = 0;
        foulB = 0;
        displayFoulsTeamA(foulA);
        displayFoulsTeamB(foulB);
    }
    /**
     * Reset scores at zero for both teams
     */
    public void resetScoreFouls(View view) {
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
        resetFouls(view);
    }
}
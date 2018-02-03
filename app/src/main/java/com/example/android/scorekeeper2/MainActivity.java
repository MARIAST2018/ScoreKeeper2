package com.example.android.scorekeeper2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int goalsOlympiakos = 0;
    int foulsOlympiakos = 0;
    int penaltyOlympiakos = 0;
    int goalsPanathinaikos = 0;
    int foulsPanathinaikos = 0;
    int penaltyPanathinaikos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForOlympiakosGoals(0);
        displayForOlympiakosFouls(0);
        displayForOlympiakosPenalties(0);
        displayForPanathinaikosGoals(0);
        displayForPanathinaikosFouls(0);
        displayForPanathinaikosPenalties(0);
    }

    private void displayPenaltyForPanathinaikos(int i) {
    }

    /**
     * Increase the goals for Olympiakos by one point.
     */
    public void addOneGoalForOlympiakosGoals(View v) {
        goalsOlympiakos = goalsOlympiakos + 1;
        displayForOlympiakosGoals(goalsOlympiakos);
    }

    /**
     * Increase the fouls for Olympiakos by one point.
     */
    public void addOneFoulForOlympiakosFouls(View v) {
        foulsOlympiakos = foulsOlympiakos + 1;
        displayForOlympiakosFouls(foulsOlympiakos);
    }

    /**
     * Increase the penalties for Olympiakos by one points.
     */
    public void addOnePenaltyForOlympiakosPenalties(View v) {
        penaltyOlympiakos = penaltyOlympiakos + 1;
        displayForOlympiakosPenalties(penaltyOlympiakos);
    }

    /**
     * Increase the goals for Panathinaikos by one point.
     */
    public void addOneGoalForPanathinaikosGoals(View v) {
        goalsPanathinaikos = goalsPanathinaikos + 1;
        displayForPanathinaikosGoals(goalsPanathinaikos);
    }

    /**
     * Increase the fouls for Panathinaikos by one point.
     */
    public void addOneFoulForPanathinaikosFouls(View v) {
        foulsPanathinaikos = foulsPanathinaikos + 1;
        displayForPanathinaikosFouls(foulsPanathinaikos);
    }

    /**
     * Increase the penalties for Panathinaikos by one point.
     */
    public void addOnePenaltyForPanathinaikosPenalties(View v) {
        penaltyPanathinaikos = penaltyPanathinaikos + 1;
        displayForPanathinaikosPenalties(penaltyPanathinaikos);
    }

    /**
     * Resets the goals penalties fouls for both teams back to 0.
     */
    public void resetScore(View v) {
        goalsOlympiakos = 0;
        foulsOlympiakos = 0;
        penaltyOlympiakos = 0;
        goalsPanathinaikos = 0;
        foulsPanathinaikos = 0;
        penaltyPanathinaikos = 0;
        displayForOlympiakosGoals(goalsOlympiakos);
        displayForOlympiakosFouls(foulsOlympiakos);
        displayForOlympiakosPenalties(penaltyOlympiakos);
        displayForPanathinaikosGoals(goalsPanathinaikos);
        displayForPanathinaikosFouls(foulsPanathinaikos);
        displayForPanathinaikosPenalties(penaltyPanathinaikos);
    }

    /**
     * Displays the given Goals for Olympiakos.
     */
    public void displayForOlympiakosGoals(int goalsOlympiakos) {
        TextView scoreView = (TextView) findViewById(R.id.olympiakos_goals);
        scoreView.setText(String.valueOf(goalsOlympiakos));
    }

    /**
     * Displays the given Goals for Panathinaikos.
     */
    public void displayForPanathinaikosGoals(int goalsPanathinaikos) {
        TextView scoreView = (TextView) findViewById(R.id.panathinaikos_goals);
        scoreView.setText(String.valueOf(goalsPanathinaikos));
    }

    /**
     * Displays the given Fouls for Olympiakos.
     */
    public void displayForOlympiakosFouls(int foulsOlympiakos) {
        TextView scoreView = (TextView) findViewById(R.id.olympiakos_fouls);
        scoreView.setText(String.valueOf(foulsOlympiakos));
    }

    /**
     * Displays the given Penalties for Olympiakos.
     */
    public void displayForOlympiakosPenalties(int penaltyOlympiakos) {
        TextView scoreView = (TextView) findViewById(R.id.olympiakos_penalty);
        scoreView.setText(String.valueOf(penaltyOlympiakos));
    }

    /**
     * Displays the given Fouls for Panathinaikos.
     */
    public void displayForPanathinaikosFouls(int foulsPanathinaikos) {
        TextView scoreView = (TextView) findViewById(R.id.panathinaikos_foul);
        scoreView.setText(String.valueOf(foulsPanathinaikos));
    }

    /**
     * Displays the given Penalties for Panathinaikos.
     */
    public void displayForPanathinaikosPenalties(int penaltyPanathinaikos) {
        TextView scoreView = (TextView) findViewById(R.id.panathinaikos_penalty);
        scoreView.setText(String.valueOf(penaltyPanathinaikos));
    }

}


package android.example.com.hockeyscoreandpenaltytracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Declare Global Variables
     */
    int homeScore=0;
    int awayScore=0;
    int homeShots=0;
    int awayShots=0;
    int homePenaltyMinutes=0;
    int awayPenaltyMinutes=0;
    /**
     * Increase the score for Home Team by 1 point.
     */
    public void add1PointHomeTeam(View v) {
        homeScore = homeScore + 1;
        displayForHomeTeamPoints(homeScore);
    }
    /**
     * Increase the shots for Home Team by 1.
     */
    public void add1ShotHomeTeam(View v) {
        homeShots = homeShots + 1;
        displayForHomeTeamShots(homeShots);
    }
    /**
     * Increase the penalty minutes for Home Team by 2 minutes.
     */
    public void Add2minutehome(View v) {
        homePenaltyMinutes = homePenaltyMinutes + 2;
        String penaltyTime = homePenaltyMinutes + ":00";
        displayForHomeTeamPenalty(penaltyTime);
    }
    /**
     * Increase the penalty minutes for Home Team by 4 minutes.
     */
    public void Add4minutehome(View v) {
        homePenaltyMinutes = homePenaltyMinutes + 4;
        String penaltyTime = homePenaltyMinutes + ":00";
        displayForHomeTeamPenalty(penaltyTime);
    }
    /**
     * Increase the penalty minutes for Home Team by 5 minutes.
     */
    public void Add5minutehome(View v) {
        homePenaltyMinutes = homePenaltyMinutes + 5;
        String penaltyTime = homePenaltyMinutes + ":00";
        displayForHomeTeamPenalty(penaltyTime);
    }
    /**
     * Increase the score for Away Team by 1 point.
     */
    public void add1PointAwayTeam(View v) {
        awayScore = awayScore + 1;
        displayForAwayTeamPoints(awayScore);
        /**
         * Increase the shots for Away Team by 1.
         */
    }
    public void add1ShotAwayTeam(View v) {
        awayShots = awayShots + 1;
        displayForAwayTeamShots(awayShots);
    }
    /**
     * Increase the penalty minutes for Away Team by 2.
     */
    public void Add2minuteaway(View v) {
        awayPenaltyMinutes = awayPenaltyMinutes + 2;
        String penaltyTime = awayPenaltyMinutes + ":00";
        displayForAwayTeamPenalty(penaltyTime);
    }
    /**
     * Increase the penalty minutes for Away Team by 4.
     */
    public void Add4minuteaway(View v) {
        awayPenaltyMinutes = awayPenaltyMinutes + 4;
        String penaltyTime = awayPenaltyMinutes + ":00";
        displayForAwayTeamPenalty(penaltyTime);
    }
    /**
     * Increase the penalty minutes for Away Team by 5.
     */
    public void Add5minuteaway(View v) {
        awayPenaltyMinutes = awayPenaltyMinutes + 5;
        String penaltyTime = awayPenaltyMinutes + ":00";
        displayForAwayTeamPenalty(penaltyTime);
    }
    /**
     * Resets the score, shots and penalty minutes for both teams back to 0. Then displays the reset scores.
     */
    public void resetScoreAndPenalty(View v) {
        homeScore=0;
        awayScore=0;
        homeShots=0;
        awayShots=0;
        homePenaltyMinutes=0;
        awayPenaltyMinutes=0;
        displayForHomeTeamPoints(homeScore);
        displayForAwayTeamPoints(awayScore);
        displayForHomeTeamShots(homeScore);
        displayForAwayTeamShots(awayScore);
        displayForHomeTeamPenalty("0:00");
        displayForAwayTeamPenalty("0:00");

    }
    /**
     * Displays the given score for Home Team.
     */
    public void displayForHomeTeamPoints(int score) {
        TextView scoreView = (TextView) findViewById(R.id.homeTeamScore);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Away Team.
     */
    public void displayForAwayTeamPoints(int score) {
        TextView scoreView = (TextView) findViewById(R.id.awayTeamScore);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given shot count for Home Team.
     */
    public void displayForHomeTeamShots(int score) {
        TextView scoreView = (TextView) findViewById(R.id.homeTeamShots);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given shot for Away Team.
     */
    public void displayForAwayTeamShots(int score) {
        TextView scoreView = (TextView) findViewById(R.id.awayTeamShots);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given Penalty Minutes for Home Team.
     */
    public void displayForHomeTeamPenalty(String score) {
        TextView scoreView = (TextView) findViewById(R.id.homeTeamPenalty);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given Penalty Minutes for Away Team.
     */
    public void displayForAwayTeamPenalty(String score) {
        TextView scoreView = (TextView) findViewById(R.id.awayTeamPenalty);
        scoreView.setText(String.valueOf(score));
    }
}
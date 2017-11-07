package io.github.cyb3rn4u7.basketballscoretracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView teamATextView,teamBTextView;
    private int teamAScore,teamBScore;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teamAScore = 0;
        teamBScore = 0;
    }


    public void displayScores(View view){
        teamATextView = findViewById(R.id.teamAScoreView);
        teamBTextView = findViewById(R.id.teamBScoreView);

        teamATextView.setText(""+teamAScore);
        teamBTextView.setText(""+teamBScore);
    }

    public void resetScores(View view){
        teamAScore = 0;
        teamBScore = 0;
        displayScores(view);
    }

    public void threePointA(View view){
        teamAScore += 3;
        displayScores(view);
    }
    public void twoPointA(View view){
        teamAScore += 2;
        displayScores(view);
    }
    public void freeThrowA(View view){
        teamAScore += 1;
        displayScores(view);
    }

    public void threePointB(View view){
        teamBScore += 3;
        displayScores(view);
    }
    public void twoPointB(View view){
        teamBScore += 2;
        displayScores(view);
    }
    public void freeThrowB(View view){
        teamBScore += 1;
        displayScores(view);
    }
}

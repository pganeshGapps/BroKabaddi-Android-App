package com.gpbit.navactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        /**/
        //String teamA=intent.getStringExtra(MainActivity.TEAM_A);
        String teamB=intent.getStringExtra(MainActivity.TEAM_B);
        String roundTime=intent.getStringExtra(MainActivity.ROUND_TIME);
        String riderLife=intent.getStringExtra(MainActivity.RIDER_LIFE);
        /**/
       /* TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);*/

        //get the textViews
        TextView teamAname=(TextView) findViewById(R.id.teamAname);
        TextView teamBname=(TextView) findViewById(R.id.teamBname);
        TextView roundTimeText=(TextView) findViewById(R.id.roundTime);
        TextView riderLifeText=(TextView) findViewById(R.id.riderLife);

        teamAname.setText(message);
        teamBname.setText(teamB);
        roundTimeText.setText(roundTime);
        riderLifeText.setText(riderLife);

        /*ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);
        layout.addView(textView);*/
    }
}

package com.gpbit.navactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.gpbit.navactivity.MESSAGE";
    //public final static String TEAM_A = "com.gpbit.navactivity.TEAM_A";
    public final static String TEAM_B = "com.gpbit.navactivity.TEAM_B";
    public final static String ROUND_TIME = "com.gpbit.navactivity.ROUND_TIME";
    public final static String RIDER_LIFE = "com.gpbit.navactivity.RIDER_LIFE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);

        /** Custom(for teamA get above line */
        EditText edit_teamB = (EditText) findViewById(R.id.edit_teamB);
        EditText edit_roundTime = (EditText) findViewById(R.id.edit_roundTime);
        EditText edit_rideLife = (EditText) findViewById(R.id.edit_riderLife);
        /**/
        String message = editText.getText().toString();
        /**/
        //String teamAname=edit_teamA.getText().toString();
        String teamBname=edit_teamB.getText().toString();
        String roundTime=edit_roundTime.getText().toString();
        String riderLife=edit_rideLife.getText().toString();
        /***/
        intent.putExtra(EXTRA_MESSAGE, message);
        /***/
        //intent.putExtra(TEAM_A,teamAname);
        intent.putExtra(TEAM_B,teamBname);
        intent.putExtra(ROUND_TIME,roundTime);
        intent.putExtra(RIDER_LIFE,riderLife);
        /**/
        startActivity(intent);
    }

}

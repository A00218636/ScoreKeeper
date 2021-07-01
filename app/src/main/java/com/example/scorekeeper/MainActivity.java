package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            TextView tv = (TextView)findViewById(R.id.teamA);
            tv.setEnabled(false);

            TextView tv2 = (TextView)findViewById(R.id.teamB);
            tv2.setEnabled(false);

//            TextView tv3 = (TextView)findViewById(R.id.switchInfo);
//            tv3.setEnabled(false);


        }

        int countA =0;
        int countB=0;
        public void onClickTeamA(View view) {
            countA = countA +1;
            TextView tv = (TextView)findViewById(R.id.teamA);
            tv.setText(String.valueOf(countA));

        }

        public void onClickTeamB(View view) {
            countB = countB + 1;

            TextView tv = (TextView)findViewById(R.id.teamB);
            tv.setText(String.valueOf(countB));
        }
    }
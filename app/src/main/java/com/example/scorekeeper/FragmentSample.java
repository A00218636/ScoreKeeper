package com.example.scorekeeper;

import android.content.res.Configuration;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class FragmentSample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // The following code takes care of the layout selection based on the smallest width of the screen
        //landscape layout is for bigger devices like iPad
        //fragment sample is the default sample for smaller devices.
        //Fragment sample constitutes of two different fragments i.e. fragment_first and fragment_second.
        Configuration config = getResources().getConfiguration();
        if (config.smallestScreenWidthDp >= 600) {
            setContentView(R.layout.landscapelayout);
        } else {
            setContentView(R.layout.fragmentsample);
        }
        //setContentView(R.layout.fragmentsample);
    }

}

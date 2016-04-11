package com.example.shashank.learningapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by shashank on 4/10/16.
 */
public class SettingsActivity extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.merge_finish);
    }

    public void onClickFinish(View view){
        finish();
    }
}


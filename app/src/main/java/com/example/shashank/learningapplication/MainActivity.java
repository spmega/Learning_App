package com.example.shashank.learningapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button alphabetButton = null;
    private Button numbersButton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.background_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);


        alphabetButton = (Button) findViewById(R.id.alphabet_button);
        numbersButton = (Button) findViewById(R.id.number_button);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.actionbar_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId() == R.id.settings){
            Intent intent = new Intent(this, SettingsActivity.class);
            startActivity(intent);
        }

        return false;
    }

    public void onClickAlphabet(View view){
        Intent intent = new Intent(this, AlphabetActivity.class);
        startActivity(intent);
    }

    public void onClickNumbers(View view){
        Intent intent = new Intent(this, NumberActivity.class);
        startActivity(intent);
    }
}

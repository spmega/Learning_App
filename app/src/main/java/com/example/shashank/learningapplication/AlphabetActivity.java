package com.example.shashank.learningapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * Created by shashank on 4/10/16.
 */
public class AlphabetActivity extends Activity{
    private Button finishButton, nextLetter, prevLetter = null;
    private TextView letters = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alphabet_main);

        letters = (TextView) findViewById(R.id.letter);
        finishButton = (Button) findViewById(R.id.finish);
        nextLetter = (Button) findViewById(R.id.next_letter);
        prevLetter = (Button) findViewById(R.id.prev_letter);

    }

    public void onClickPrevLetter(View view){
        CharSequence text = letters.getText();
        if(letters.getText().equals("A")){
            Toast toast = Toast.makeText(this, "A is the first letter", Toast.LENGTH_SHORT);
            toast.show();
        }else {
            char letter = text.charAt(0);
            char prevLetterToLoad= (char) (letter-1);
            letters.setText(String.valueOf(prevLetterToLoad));
        }
    }

    public void onClickNextLetter(View view){
        CharSequence text = letters.getText();
        if(letters.getText().equals("Z")){
            Toast toast = Toast.makeText(this, "Z is the last letter", Toast.LENGTH_SHORT);
            toast.show();
        }else {
            char letter = text.charAt(0);
            char nextLettertoLoad= (char) (letter+1);
            letters.setText(String.valueOf(nextLettertoLoad));
        }
    }

    public void onClickFinish(View view){
        finish();
    }
}

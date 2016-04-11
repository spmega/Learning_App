package com.example.shashank.learningapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by shashank on 4/10/16.
 */
public class NumberActivity extends Activity{
    private Button finishButton, nextNum, prevNum = null;
    private TextView numbers = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.number_main);

        numbers = (TextView) findViewById(R.id.number);
        finishButton = (Button) findViewById(R.id.finish);
        nextNum = (Button) findViewById(R.id.next_num);
        prevNum = (Button) findViewById(R.id.prev_num);

    }

    public void onClickPrevNumber(View view){
        CharSequence text = numbers.getText();
        if(numbers.getText().equals("1")){
            Toast toast = Toast.makeText(this, "1 is the first number", Toast.LENGTH_SHORT);
            toast.show();
        }else {
            char number = text.charAt(0);
            char prevNumtoLoad= (char) (number-1);
            numbers.setText(String.valueOf(prevNumtoLoad));
        }
    }

    public void onClickNextNumber(View view){
        CharSequence text = numbers.getText();
        if(numbers.getText().equals("9")){
            Toast toast = Toast.makeText(this, "10 is the last number", Toast.LENGTH_SHORT);
            toast.show();
        }else {
            char number = text.charAt(0);
            char nextNumToLoad= (char) (number+1);
            numbers.setText(String.valueOf(nextNumToLoad));
        }
    }

    public void onClickFinish(View view){
        finish();
    }
}

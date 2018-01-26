package com.androidtutors.textviewandroidexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //TODO 6 : Add TextView variable with name helloTextView
    private TextView helloTextView;

    //TODO 7 : Add TextView variable with name learnTextView
    private TextView learnTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO 8 Use findViewById to link helloTextView to TextView textview-hello
        helloTextView = findViewById(R.id.textview_hello);

        //TODO 9 Use findViewById to link learnTextView to TextView textview-learn
        learnTextView = findViewById(R.id.textview_learn);

        //TODO 10 set text of helloTextView to "Hello **your name**"
        helloTextView.setText("Hello Android Tutors!");

        //TODO 11 set text of learnTextView to "Let's learn Android"
        learnTextView.setText("Let's learn Android");



    }
}

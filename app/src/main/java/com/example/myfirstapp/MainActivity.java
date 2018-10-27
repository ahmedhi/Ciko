package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    int X = 0; // default Door Locked = 0 , Door Unlocked = 1
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /* 3 etats :
    Open : Door is open
    Unlocked : Door is closed unlocked
    Locked : Door is closed locked
    */
    public void Unlocked_button(View view) {
        TextView chaine = (TextView) findViewById(R.id.textView3);
        if (M == 0 && X == 0) {
                chaine.setText("Closed and Unlocked");
                X++;

        }
        // if(M==1 && X==0) pop up the Door is Open
        // if(M==0 && X==1) pop up the door is already Unlocked
    }
    public void Locked_button(View view) {
        TextView chaine = (TextView) findViewById(R.id.textView3);
        if (M == 0 && X == 1) {
                chaine.setText("Closed and Locked");
                X--;

        }
        // if(M==1) pop up the Door is Open
        // if(M==0 && X==0) pop up the door is already Unlocked
    }

    int M = 0; // default Door Closed = 0 , Door Open = 1
    public void E_Cap(View view){
        TextView Button = (TextView) findViewById(R.id.button2);
        TextView chaine = (TextView) findViewById(R.id.textView3);
        if(M ==0){
            Button.setText("Press to Close");
            chaine.setText("Opened");
            M ++;
            X = 1;
        }
        else{
            Button.setText("Press to Open");
            M = 0;
            chaine.setText("Closed and Unlocked");
            X=1;
        }
    }
}

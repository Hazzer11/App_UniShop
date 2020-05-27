package com.example.assignment_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    public EditText usernameText,passwordText;
    public static final String EXTRA_MESSAGE = "com.example.assignment2.MESSAGE";
    public static final String EXTRA_MESSAGE2 = "com.example.assignment2.MESSAGE2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usernameText= (EditText) (findViewById(R.id.editText4));
        passwordText= (EditText) (findViewById(R.id.editText5));
    }

    public void sendMessage(View view){
        Intent i=new Intent(this , Main2Activity.class);
        i.putExtra(EXTRA_MESSAGE,usernameText.getText());
        i.putExtra(EXTRA_MESSAGE2,passwordText.getText());
        startActivityForResult(i,0);
    }
}

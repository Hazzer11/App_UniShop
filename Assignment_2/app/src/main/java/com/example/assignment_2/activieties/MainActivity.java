package com.example.assignment_2.activieties;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.assignment_2.R;
import com.example.assignment_2.activieties.Main2Activity;

public class MainActivity extends AppCompatActivity {

    public EditText usernameText,passwordText;
    public static final String EXTRA_MESSAGE = "com.example.assignment2.MESSAGE";
    public static final String EXTRA_MESSAGE2 = "com.example.assignment2.MESSAGE2";
    public int REQUEST_LOCATION_PERMISSION;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usernameText= (EditText) (findViewById(R.id.editText4));
        passwordText= (EditText) (findViewById(R.id.editText5));
        getLocation();
    }

    public void sendMessage(View view){
        Intent i=new Intent(this , Main2Activity.class);
        i.putExtra(EXTRA_MESSAGE,usernameText.getText());
        i.putExtra(EXTRA_MESSAGE2,passwordText.getText());
        startActivityForResult(i,0);
    }

    private void getLocation() {
        if (ActivityCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]
                            {Manifest.permission.ACCESS_FINE_LOCATION},
                    REQUEST_LOCATION_PERMISSION);
        } else {

        }
    }


}

package com.example.assignment_2.activieties;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.assignment_2.R;


public class PoliciesActivity extends AppCompatActivity {

    public String policies= "List of information that i'm using to make it seem like i've";
    public View view;

    public ScrollView scrollView;

    public PoliciesActivity() {
        // Required empty public constructor
    }



    Context context = this;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_policies);

        ImageView HomeButton=findViewById(R.id.imageView12);
        HomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x=new Intent(context, Main2Activity.class);
                startActivityForResult(x,0);
            }
        });
    }


}

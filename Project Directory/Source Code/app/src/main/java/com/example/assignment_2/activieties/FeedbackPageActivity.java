package com.example.assignment_2.activieties;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


import androidx.appcompat.app.AppCompatActivity;

import com.example.assignment_2.R;


public class FeedbackPageActivity extends AppCompatActivity {

    public FeedbackPageActivity() {
        // Required empty public constructor
    }

    Context context=this;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback_page);

        ImageView HomeButton=findViewById(R.id.imageView14);
        HomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x=new Intent(context, Main2Activity.class);
                startActivityForResult(x,0);
            }
        });
    }


}

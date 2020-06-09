package com.example.assignment_2.activieties;

import android.content.Intent;
import android.os.Bundle;


import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignment_2.classes.Item;
import com.example.assignment_2.R;

import java.util.List;


public class ItemDisplayActivity extends AppCompatActivity {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static List<Item> item;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ItemDisplayActivity(List<Item> item) {
        this.item=item;
    }
    String name;
    double value;
    int image;
    ImageView view1;
    RecyclerView view2;
    Spinner view3;
    TextView view4;
    Button view5;

    public static ItemDisplayActivity newInstance(String param1, String param2) {
        ItemDisplayActivity fragment = new ItemDisplayActivity(item);
        Bundle args = new Bundle();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_display);
        Intent intent = getIntent();

        name = intent.getStringExtra("name");
        value = intent.getDoubleExtra("values",0.0);
        image = intent.getIntExtra("image",0);

        view1=findViewById(R.id.imageView);
        view2=findViewById(R.id.recyclerView2);
        view3=findViewById(R.id.spinner2);
        view4=findViewById(R.id.textView10);
        view5=findViewById(R.id.button7);

        view1.setImageResource(image);
        view4.setText(Double.toString(value*view3.getSelectedItemPosition()));
    }


}

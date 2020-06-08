package com.example.assignment_2;

import android.os.Bundle;

import android.app.Fragment;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.app.AppCompatActivity;

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


    public static ItemDisplayActivity newInstance(String param1, String param2) {
        ItemDisplayActivity fragment = new ItemDisplayActivity(item);
        Bundle args = new Bundle();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_display);

    }


}

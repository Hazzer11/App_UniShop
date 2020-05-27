package com.example.assignment_2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Fragment tempFrag= new HomePage();

        FragmentManager fm= getFragmentManager();
        FragmentTransaction ft =fm.beginTransaction();
        ft.replace(R.id.fragmentMain,tempFrag);
        ft.addToBackStack(null);
        ft.commit();
    }



    public void oneClicked(View view){
        Fragment tempFrag= new ShoppingList();

        FragmentManager fm= getFragmentManager();
        FragmentTransaction ft =fm.beginTransaction();
        ft.replace(R.id.fragmentMain,tempFrag);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void twoClicked(View view){
        Fragment tempFrag= new ItemSearch();

        FragmentManager fm= getFragmentManager();
        FragmentTransaction ft =fm.beginTransaction();
        ft.replace(R.id.fragmentMain,tempFrag);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void threeClicked(View view){
        Fragment tempFrag= new CouponList();

        FragmentManager fm= getFragmentManager();
        FragmentTransaction ft =fm.beginTransaction();
        ft.replace(R.id.fragmentMain,tempFrag);
        ft.addToBackStack(null);
        ft.commit();
    }
}

package com.example.assignment_2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;


import android.app.FragmentManager;
import android.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import com.example.assignment_2.Item;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
    List<com.example.assignment_2.Item > itemDatabase = new ArrayList<>();
    Integer[] imageList = { R.drawable.cola, R.drawable.milk,R.drawable.chicken_drumstick, R.drawable.orange_drink, R.drawable.strawberry_milkshake};
    String[] nameList = {"Cola", "Milk", "Chicken", "Fanta", "Strawberry Milk"};
    String[] descriptionList={"Brown sweet drink","liquid cow","Delicious chicken","orange drink that i hate","Pink liquid cow"};





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        swapToHomePage();
        swapToSettingsButton();

        com.example.assignment_2.Item item;
        for (int i= 0; i< imageList.length; i++ )
        { int image = imageList[i];
            String name = nameList[i];
            String description = descriptionList[i];

            item = new com.example.assignment_2.Item (i, image, name, description);
            itemDatabase.add(item);

        }
    }

    public void swapToHomePage(){
        Fragment tempFrag= new HomePage();

        FragmentManager fm= getFragmentManager();
        FragmentTransaction ft =fm.beginTransaction();
        ft.replace(R.id.fragmentMain,tempFrag);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void swapToShoppingList(View view){
        Fragment tempFrag= new ShoppingList();

        FragmentManager fm= getFragmentManager();
        FragmentTransaction ft =fm.beginTransaction();
        ft.replace(R.id.fragmentMain,tempFrag);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void swapToItemSearch(View view){
        Fragment tempFrag= new ItemSearch();

        FragmentManager fm= getFragmentManager();
        FragmentTransaction ft =fm.beginTransaction();
        ft.replace(R.id.fragmentMain,tempFrag);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void swapToCouponList(View view){
        Fragment tempFrag= new CouponList();

        FragmentManager fm= getFragmentManager();
        FragmentTransaction ft =fm.beginTransaction();
        ft.replace(R.id.fragmentMain,tempFrag);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void swapToPolicies(View view){
        Fragment tempFrag= new Policies();

        FragmentManager fm= getFragmentManager();
        FragmentTransaction ft =fm.beginTransaction();
        ft.replace(R.id.fragmentMain,tempFrag);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void swapToSettingsPage(View view){
        Fragment tempFrag= new SettingsPage();

        FragmentManager fm= getFragmentManager();
        FragmentTransaction ft =fm.beginTransaction();
        ft.replace(R.id.fragmentMain,tempFrag);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void swapToShoppingListView(View view){
        Fragment tempFrag= new ShoppingListView();

        FragmentManager fm= getFragmentManager();
        FragmentTransaction ft =fm.beginTransaction();
        ft.replace(R.id.fragmentMain,tempFrag);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void swapToCouponInfo(View view){
        Fragment tempFrag= new CouponInfo();

        FragmentManager fm= getFragmentManager();
        FragmentTransaction ft =fm.beginTransaction();
        ft.replace(R.id.fragmentMain,tempFrag);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void swapToFeedbackPage(View view){
        Fragment tempFrag= new FeedbackPage();

        FragmentManager fm= getFragmentManager();
        FragmentTransaction ft =fm.beginTransaction();
        ft.replace(R.id.fragmentMain,tempFrag);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void swapToItemDisplay(View view){
        Fragment tempFrag= new ItemDisplay();

        FragmentManager fm= getFragmentManager();
        FragmentTransaction ft =fm.beginTransaction();
        ft.replace(R.id.fragmentMain,tempFrag);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void swapToLocationInformationPage(View view){
        Fragment tempFrag= new LocationInformationPage();

        FragmentManager fm= getFragmentManager();
        FragmentTransaction ft =fm.beginTransaction();
        ft.replace(R.id.fragmentMain,tempFrag);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void swapToLocationSelectionPage(View view){
        Fragment tempFrag= new LocationSelectionPage();

        FragmentManager fm= getFragmentManager();
        FragmentTransaction ft =fm.beginTransaction();
        ft.replace(R.id.fragmentMain,tempFrag);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void swapTodropdown(){
        Fragment tempFrag= new dropdown();

        FragmentManager fm= getFragmentManager();
        FragmentTransaction ft =fm.beginTransaction();
        ft.replace(R.id.fragmentDropDown,tempFrag);
        ft.addToBackStack(null);
        ft.commit();
    }
    public void swapToSettingsButton(){
        Fragment tempFrag= new SettingsButton();

        FragmentManager fm= getFragmentManager();
        FragmentTransaction ft =fm.beginTransaction();
        ft.replace(R.id.fragmentDropDown,tempFrag);
        ft.addToBackStack(null);
        ft.commit();
    }
}

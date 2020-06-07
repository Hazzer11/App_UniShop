package com.example.assignment_2;


import androidx.appcompat.app.AppCompatActivity;


import android.app.Fragment;


import android.app.FragmentManager;
import android.app.FragmentTransaction;

import android.content.Intent;

import android.os.Bundle;

import android.view.View;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
    List<com.example.assignment_2.Item > itemDatabase = new ArrayList<>();
    Integer[] imageList = { R.drawable.cola, R.drawable.milk,R.drawable.chicken_drumstick, R.drawable.orange_drink, R.drawable.strawberry_milkshake};
    String[] nameList = {"Cola", "Milk", "Chicken", "Fanta", "Strawberry Milk"};
    String[] descriptionList={"Brown sweet drink","liquid cow","Delicious chicken","orange drink that i hate","Pink liquid cow"};
    String UserName;
    Integer REQUEST_LOCATION_PERMISSION;
    FragmentManager fm= getFragmentManager();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        swapToHomePage();
        //swapToDropdown();
        swapToSettingsButton();
        //swapToListSelect();
        //AIzaSyAxmInoSgVtxnrcOeh4SXcVMFMrXAzNrD4
        com.example.assignment_2.Item item;
        for (int i= 0; i< imageList.length; i++ )
        { int image = imageList[i];
            String name = nameList[i];
            String description = descriptionList[i];

            item = new com.example.assignment_2.Item (i, image, name, description);
            itemDatabase.add(item);

        }

        Gson gson = new Gson();
        String temp = gson.toJson(databaseList());

    }


    public void swapToHomePage(){
        Fragment tempFrag= new HomePage();

        FragmentTransaction ft =fm.beginTransaction();
        ft.replace(R.id.fragmentMain,tempFrag);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void swapToShoppingList(View view){
        Fragment tempFrag= new ShoppingList();

        FragmentTransaction ft =fm.beginTransaction();
        ft.replace(R.id.fragmentMain,tempFrag);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void swapToItemSearch(View view){
        Fragment tempFrag= new ItemSearch();

        FragmentTransaction ft =fm.beginTransaction();
        ft.replace(R.id.fragmentMain,tempFrag);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void swapToCouponList(View view){
        Fragment tempFrag= new CouponList();


        FragmentTransaction ft =fm.beginTransaction();
        ft.replace(R.id.fragmentMain,tempFrag);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void swapToPolicies(View view){
        Fragment tempFrag= new Policies();


        FragmentTransaction ft =fm.beginTransaction();
        ft.replace(R.id.fragmentMain,tempFrag);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void swapToSettingsPage(View view){
        Fragment tempFrag= new SettingsPage();


        FragmentTransaction ft =fm.beginTransaction();
        ft.replace(R.id.fragmentMain,tempFrag);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void swapToShoppingListView(View view){
        Fragment tempFrag= new ShoppingListView();


        FragmentTransaction ft =fm.beginTransaction();
        ft.replace(R.id.fragmentMain,tempFrag);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void swapToCouponInfo(View view){
        Fragment tempFrag= new CouponInfo();


        FragmentTransaction ft =fm.beginTransaction();
        ft.replace(R.id.fragmentMain,tempFrag);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void swapToHomePage(View view){
        Fragment tempFrag= new HomePage();


        FragmentTransaction ft =fm.beginTransaction();
        ft.replace(R.id.fragmentMain,tempFrag);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void swapToFeedbackPage(View view){
        Fragment tempFrag= new FeedbackPage();


        FragmentTransaction ft =fm.beginTransaction();
        ft.replace(R.id.fragmentMain,tempFrag);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void swapToItemDisplay(View view){
        Fragment tempFrag= new ItemDisplay();


        FragmentTransaction ft =fm.beginTransaction();
        ft.replace(R.id.fragmentMain,tempFrag);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void swapToLocationInformationPage(View view){
        Fragment tempFrag= new LocationInformationPage();


        FragmentTransaction ft =fm.beginTransaction();
        ft.replace(R.id.fragmentMain,tempFrag);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void swapToLocationSelectionPage(View view){
        Fragment tempFrag= new LocationSelectionPage();


        FragmentTransaction ft =fm.beginTransaction();
        ft.replace(R.id.fragmentMain,tempFrag);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void swapToDropdown(){
        Fragment tempFrag= new dropdown();


        FragmentTransaction ft =fm.beginTransaction();
        ft.replace(R.id.fragmentDropDown,tempFrag);
        ft.addToBackStack(null);
        ft.commit();
    }
    public void swapToSettingsButton(){
        Fragment tempFrag= new SettingsButton();

        FragmentTransaction ft =fm.beginTransaction();
        ft.replace(R.id.fragmentDropDown,tempFrag);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void swapToDeleteListAlert(){
        Fragment tempFrag= new DeleteListAlert();


        FragmentTransaction ft =fm.beginTransaction();
        ft.replace(R.id.fragmentAlert,tempFrag);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void swapToNewList(){
        Fragment tempFrag= new NewList();


        FragmentTransaction ft =fm.beginTransaction();
        ft.replace(R.id.fragmentAlert,tempFrag);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void swapToListSelect(){
        Fragment tempFrag= new ListSelect();


        FragmentTransaction ft =fm.beginTransaction();
        ft.replace(R.id.fragmentAlert,tempFrag);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void Logout(){
        Intent i=new Intent(this , Main2Activity.class);
        try{
            finish();
        }
        catch (Exception e){

        };
    }
}

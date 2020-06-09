package com.example.assignment_2.activieties;

import android.app.Fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignment_2.database_helpers.DatabaseHelperShoppingLists;
import com.example.assignment_2.display_adaptors.ItemListAdaptor;
import com.example.assignment_2.display_adaptors.ShoppingListDisplayAdaptor;
import com.example.assignment_2.fragments.NewList;
import com.example.assignment_2.R;

import java.util.ArrayList;
import java.util.List;


public class ShoppingListActivity extends AppCompatActivity {
    RecyclerView rectView;
    Button button;
    View view;
    FragmentManager fm = getFragmentManager();
    DatabaseHelperShoppingLists  shoppingLists;
    public ShoppingListDisplayAdaptor itemAdaptor;

    public ShoppingListActivity() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_list);
        shoppingLists = new DatabaseHelperShoppingLists(this,null,null,1);
        shoppingLists.onAdd("List 1","ShoppingListContents1");
        shoppingLists.onAdd("List 2","ShoppingListContents2");
        rectView=findViewById(R.id.recyclerView4);
        button=findViewById(R.id.button19);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddList();
            }
        });

        Cursor searchList =shoppingLists.getData();//set array adaptor
        List<String> data= new ArrayList<>();
        while(searchList.moveToNext()){
            data.add(searchList.getString(1));}
        itemAdaptor = new ShoppingListDisplayAdaptor(this,data);
        rectView.setAdapter(itemAdaptor);
        rectView.setLayoutManager(new LinearLayoutManager(this));
    }



    public void AddList(){
        Fragment tempFrag= new NewList();

        FragmentTransaction ft =fm.beginTransaction();
        ft.replace(R.id.fragmentAlert1,tempFrag);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void AddToList(String name){
        shoppingLists.onAdd(name,"SLC"+shoppingLists.getData().getCount()+1);
    }
    public void removeAlert(){
        fm.popBackStack();
    }
}

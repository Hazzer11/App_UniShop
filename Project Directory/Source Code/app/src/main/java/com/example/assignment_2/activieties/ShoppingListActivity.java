package com.example.assignment_2.activieties;

import android.app.Fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

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
    ImageView HomeButton;
    View view;
    Context context;
    FragmentManager fm = getFragmentManager();
    DatabaseHelperShoppingLists  shoppingLists;
    public ShoppingListDisplayAdaptor itemAdaptor;
    List<Integer> data2;
    public Integer LastClicked=0;
    public ShoppingListActivity() {
        context=this;
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
        HomeButton=findViewById(R.id.imageView6);
        HomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x=new Intent(context, Main2Activity.class);
                startActivityForResult(x,0);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddList();
            }
        });

        updateDisplay();
    }


    public void updateDisplay(){
        Cursor searchList =shoppingLists.getData();//set array adaptor
        List<String> data= new ArrayList<>();
        data2= new ArrayList<>();
        while(searchList.moveToNext()){
            data.add(searchList.getString(1));
            data2.add(searchList.getInt(0));

        }

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
        updateDisplay();
    }
    public void removeAlert(){
        fm.popBackStack();
    }
    public void yesRemove(Integer id){


        shoppingLists.delete(data2.get(id));
        updateDisplay();
        fm.popBackStack();
    }
    public void listClicked(Integer id){
        Intent h=new Intent(this , ShoppingListActivity.class);
        h.putExtra("listID",data2.get(id));
        startActivityForResult(h,0);
    }
}

package com.example.assignment_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.widgets.Rectangle;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.assignment_2.database_helpers.DatabaseHelperShoppingListContents;

import java.util.ArrayList;
import java.util.List;

public class ShoppingListContentsActivity extends AppCompatActivity {
    TextView title,amount,cost;
    RecyclerView itemsList;
    Button button;
    Integer id;
    DatabaseHelperShoppingListContents contents;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_list_contents);
        id = getIntent().getIntExtra("listID",0);
        contents = new DatabaseHelperShoppingListContents(null,"SLC"+id.toString(),null,1);

        Cursor searchList =contents.getData();//set array adaptor
        List<String> data= new ArrayList<>();
        double val=0;
        while(searchList.moveToNext()){
            val+=(searchList.getInt(4));
        }

    }
}

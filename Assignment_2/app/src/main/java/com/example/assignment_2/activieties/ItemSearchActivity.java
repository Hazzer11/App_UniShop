package com.example.assignment_2.activieties;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignment_2.classes.Item;
import com.example.assignment_2.R;
import com.example.assignment_2.display_adaptors.ItemListAdaptor;

import java.util.ArrayList;
import java.util.List;


public class ItemSearchActivity extends AppCompatActivity {
    List<Item> itemDatabase= new ArrayList<>();
    List<Item> searchList = new ArrayList<>();
    Integer[] imageList = { R.drawable.cola, R.drawable.milk,R.drawable.chicken_drumstick, R.drawable.orange_drink, R.drawable.strawberry_milkshake};
    String[] nameList = {"Cola", "Milk", "Chicken", "Fanta", "Strawberry Milk"};
    String[] descriptionList={"Brown sweet drink","liquid cow","Delicious chicken","orange drink that i hate","Pink liquid cow"};
    Button searchButton;
    TextView filterBox;
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public ItemSearchActivity() {
        // Required empty public constructor
    }
    public RecyclerView rectView;
    public ItemListAdaptor itemAdaptor;
    public View view;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_search);

        for (int i= 0; i< imageList.length; i++ )
        { int image = imageList[i];
            String name = nameList[i];
            String description = descriptionList[i];

            Item item = new Item (i, image, name, description,Math.random()*10);
            itemDatabase.add(item);
        }
        searchList.addAll(itemDatabase);

        searchButton=findViewById(R.id.button2);
        rectView= findViewById(R.id.RectView);
        itemAdaptor = new ItemListAdaptor(this,searchList);
        rectView.setAdapter(itemAdaptor);
        rectView.setLayoutManager(new LinearLayoutManager(this));
        filterBox=findViewById(R.id.editText);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filterItems();
            }
        });

    }



    public void filterItems()
    {
        searchList=new ArrayList<>();

        for (int i= 0; i< imageList.length; i++ )
        {
            if(itemDatabase.get(i).getName().contains(filterBox.getText()))
            {
                searchList.add(itemDatabase.get(i));
            }
        }

        itemAdaptor = new ItemListAdaptor(this,searchList);
        rectView.setAdapter(itemAdaptor);
        rectView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void viewClicked(View view,int position){
        Intent i=new Intent(this , Main2Activity.class);
        i.putExtra("values",searchList.get(position).getValue());
        i.putExtra("name",searchList.get(position).getName());
        i.putExtra("image",searchList.get(position).getImage());
        startActivityForResult(i,0);
    }
}

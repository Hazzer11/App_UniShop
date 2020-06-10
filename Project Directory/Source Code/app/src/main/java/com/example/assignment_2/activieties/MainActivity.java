package com.example.assignment_2.activieties;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.assignment_2.R;
import com.example.assignment_2.activieties.Main2Activity;
import com.example.assignment_2.database_helpers.DatabaseHelperItems;
import com.example.assignment_2.database_helpers.DatabaseHelperShoppingLists;
import com.example.assignment_2.database_helpers.DatabaseHelperStores;
import com.example.assignment_2.database_helpers.DatabaseHelperStoresContents;

public class MainActivity extends AppCompatActivity {

    public EditText usernameText,passwordText;
    public static final String EXTRA_MESSAGE = "com.example.assignment2.MESSAGE";
    public static final String EXTRA_MESSAGE2 = "com.example.assignment2.MESSAGE2";
    public int REQUEST_LOCATION_PERMISSION;
    DatabaseHelperShoppingLists shoppingLists;
    DatabaseHelperItems items;
    DatabaseHelperStores stores;
    DatabaseHelperStoresContents storesContents;
    double[] lon={-37.543385,-37.555529,-37.592191,-37.599699,-37.584737,-37.586296};
    double[] lat={143.785951,143.816774,143.804050,143.840445,143.840223,143.840223};
    String[] localNames={"WoolWorths Lucas","ALDI Alfredton","WoolWorths Delacombe","Coles Sebastopol","ALDI Sebastopol","WoolWorths Sebastopol"};
    String[] open={"7:00","8:30","7:00","7:00","8:30","7:00"};
    String[] close={"22:00","20:00","22:00","22:00","20:00","22:00"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usernameText= (EditText) (findViewById(R.id.editText4));
        passwordText= (EditText) (findViewById(R.id.editText5));
        getLocation();

        shoppingLists = new DatabaseHelperShoppingLists(this,null,null,1);
        shoppingLists.onAdd("List 1","ShoppingListContents1");
        shoppingLists.onAdd("List 2","ShoppingListContents2");

        items = new DatabaseHelperItems(this,null,null,1);

        stores = new DatabaseHelperStores(this,null,null,1);
        for (int k=0;k< lon.length;k++){
            int id = k;
            String names = localNames[k];
            double lons = lon[k];
            double lats = lat[k];
            String openTime = open[k];
            String  closeTime= close[k];


            stores.onAdd(names,openTime,closeTime,lons,lats,k);
        }
    }

    public void sendMessage(View view){
        Intent i=new Intent(this , Main2Activity.class);
        i.putExtra(EXTRA_MESSAGE,usernameText.getText());
        i.putExtra(EXTRA_MESSAGE2,passwordText.getText());
        startActivityForResult(i,0);
    }

    private void getLocation() {
        if (ActivityCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]
                            {Manifest.permission.ACCESS_FINE_LOCATION},
                    REQUEST_LOCATION_PERMISSION);
        } else {

        }
    }


}

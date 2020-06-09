package com.example.assignment_2.activieties;


import androidx.appcompat.app.AppCompatActivity;


import android.app.FragmentManager;

import android.content.Intent;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.assignment_2.classes.Item;
import com.example.assignment_2.R;
import com.example.assignment_2.classes.StoreLocation;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.gson.Gson;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity implements OnMapReadyCallback {
    List<Item> itemDatabase = new ArrayList<>();
    List<ShoppingListActivity> personalLists;
    List<StoreLocation> storeLocations;

    Integer[] imageList = { R.drawable.cola, R.drawable.milk,R.drawable.chicken_drumstick, R.drawable.orange_drink, R.drawable.strawberry_milkshake};
    String[] nameList = {"Cola", "Milk", "Chicken", "Fanta", "Strawberry Milk"};
    String[] descriptionList={"Brown sweet drink","liquid cow","Delicious chicken","orange drink that i hate","Pink liquid cow"};
    double[] lon={-37.543385,-37.555529,-37.592191,-37.599699,-37.584737,-37.586296};
    double[] lat={143.785951,143.816774,143.804050,143.840445,143.840223,143.840223};
    String[] localNames={"WoolWorths Lucas","ALDI Alfredton","WoolWorths Delacombe","Coles Sebastopol","ALDI Sebastopol","WoolWorths Sebastopol"};
    String[] open={"7:00","8:30","7:00","7:00","8:30","7:00"};
    String[] close={"22:00","20:00","22:00","22:00","20:00","22:00"};




    String UserName;
    Integer REQUEST_LOCATION_PERMISSION;

    public GoogleMap mMap;
    public MapView mMapView;
    public static final String MAPVIEW_BUNDLE_KEY = "MapViewBundleKey";

    FragmentManager fm= getFragmentManager();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);




        Gson gson = new Gson();
        String temp = gson.toJson(databaseList());
        File tempFile = new File("storage");

        Bundle mapViewBundle = null;
        if (savedInstanceState != null) {
            mapViewBundle = savedInstanceState.getBundle(MAPVIEW_BUNDLE_KEY);
        }
        mMapView = findViewById(R.id.mapView);
        mMapView.onCreate(mapViewBundle);
        mMapView.getMapAsync(this);
        remakeList();
        for (int k=0;k< lon.length;k++){
            int id = k;
            String names = localNames[k];
            double lons = lon[k];
            double lats = lat[k];
            String openTime = open[k];
            String  closeTime= close[k];
            remakeList();

            //storeLocations.add(new StoreLocation(id,lons,lats,names,openTime,closeTime,itemDatabase));
        }
    }



    public void remakeList()
    {
        itemDatabase =new ArrayList<>();
        Item item;
        for (int i= 0; i< imageList.length; i++ )
        { int image = imageList[i];
            String name = nameList[i];
            String description = descriptionList[i];

            item = new Item(i, image, name, description,Math.random()*10);
            Log.i("yo",name);
            itemDatabase.add(item);

        }
    }
    public void swapToShoppingList(View view){
        Intent b=new Intent(this , ShoppingListActivity.class);
        startActivityForResult(b,0);
    }
    public void swapToItemSearch(View view){
        Intent c=new Intent(this , ItemSearchActivity.class);
        startActivityForResult(c,0);
    }
    public void swapToCouponList(View view){
        Intent d=new Intent(this , CouponListActivity.class);
        startActivityForResult(d,0);
    }
    public void swapToLocationSelectionPage(View view){
        Intent e=new Intent(this , LocationSelectionPageActivity.class);
        startActivityForResult(e,0);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap=googleMap;
        mMap.setMyLocationEnabled(true);
        GoogleMap.OnMapClickListener listener= new GoogleMap.OnMapClickListener() {
            @Override
            public void onMapClick(LatLng latLng) {
                swapToLocationSelectionPage(mMapView);
            }
        };
        mMap.setOnMapClickListener(listener);

    }

    @Override
    public void onResume() {
        super.onResume();
        mMapView.onResume();
    }


    @Override
    public void onStart() {
        super.onStart();
        mMapView.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
        mMapView.onStop();
    }



    @Override
    public void onPause() {
        mMapView.onPause();
        super.onPause();
    }

    @Override
    public void onDestroy() {
        mMapView.onDestroy();
        super.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mMapView.onLowMemory();
    }


    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}

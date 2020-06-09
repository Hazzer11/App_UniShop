package com.example.assignment_2.activieties;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.assignment_2.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;


public class LocationSelectionPageActivity extends AppCompatActivity implements OnMapReadyCallback {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    public GoogleMap mMap;
    public MapView mMapView;
    public static final String MAPVIEW_BUNDLE_KEY = "MapViewBundleKey";


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public LocationSelectionPageActivity() {
        // Required empty public constructor
    }


    public static LocationSelectionPageActivity newInstance(String param1, String param2) {
        LocationSelectionPageActivity fragment = new LocationSelectionPageActivity();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_selection_page);

        Bundle mapViewBundle = null;
        if (savedInstanceState != null) {
            mapViewBundle = savedInstanceState.getBundle(MAPVIEW_BUNDLE_KEY);
        }

        mMapView = this.findViewById(R.id.mapView2);
        mMapView.onCreate(mapViewBundle);
        mMapView.getMapAsync(this);
    }



    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap=googleMap;
        mMap.setMyLocationEnabled(true);
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
}

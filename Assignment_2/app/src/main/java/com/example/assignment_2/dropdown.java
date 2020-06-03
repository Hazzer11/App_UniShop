package com.example.assignment_2;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

import android.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class dropdown extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public dropdown() {
        // Required empty public constructor
    }


    public static dropdown newInstance(String param1, String param2) {
        dropdown fragment = new dropdown();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_settings_button, container, false);
    }

    public void swapToSettingsPage(View view){
        Fragment tempFrag= new SettingsPage();

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

    public void swapToFeedbackPage(View view){
        Fragment tempFrag= new FeedbackPage();

        FragmentManager fm= getFragmentManager();
        FragmentTransaction ft =fm.beginTransaction();
        ft.replace(R.id.fragmentMain,tempFrag);
        ft.addToBackStack(null);
        ft.commit();
    }
}

package com.example.assignment_2;

import android.app.FragmentManager;
import android.app.FragmentTransaction;

import android.os.Bundle;

import android.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;



public class SettingsButton extends Fragment {
    ImageView iview;
    View view;
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    public SettingsButton() {
        // Required empty public constructor
    }


    public static SettingsButton newInstance() {
        SettingsButton fragment = new SettingsButton();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_settings_button, container, false);
        ImageButton but = (ImageButton) view.findViewById(R.id.imageButton4);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swapToDropdown();
            }
        });
        return view;
    }

    public void swapToDropdown() {
        Fragment tempFrag = new dropdown();

        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        ft.replace(R.id.fragmentDropDown, tempFrag);
        ft.addToBackStack(null);
        ft.commit();
    }

}

package com.example.assignment_2.fragments;

import android.content.Intent;
import android.os.Bundle;

import android.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.FragmentManager;

import com.example.assignment_2.activieties.FeedbackPageActivity;
import com.example.assignment_2.R;
import com.example.assignment_2.activieties.SettingsPageActivity;
import com.example.assignment_2.activieties.PoliciesActivity;
import com.example.assignment_2.activieties.ShoppingListActivity;

public class dropdown extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;
    Button button1,button2,button3,button4;
    View view;
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
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_dropdown, container, false);

        button1=view.findViewById(R.id.button10);
        button2=view.findViewById(R.id.button11);
        button3=view.findViewById(R.id.button12);
        button4=view.findViewById(R.id.button13);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Logout();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swapToSettings();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swapToPolicies();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swapToFeedback();
            }
        });
        return view;
    }


    public void swapToSettings(){
        Intent b=new Intent(getContext(), SettingsPageActivity.class);
        getFragmentManager().popBackStack();
        startActivityForResult(b,0);
    }
    public void swapToPolicies(){
        Intent b=new Intent(getContext(), PoliciesActivity.class);
        getFragmentManager().popBackStack();
        startActivityForResult(b,0);
    }
    public void swapToFeedback(){
        Intent b=new Intent(getContext(), FeedbackPageActivity.class);
        getFragmentManager().popBackStack();
        startActivityForResult(b,0);
    }
    public void Logout(){
        // fill with logout method
    }


}

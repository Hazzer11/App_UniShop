package com.example.assignment_2.fragments;

import android.os.Bundle;

import android.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.assignment_2.R;
import com.example.assignment_2.activieties.ShoppingListActivity;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DeleteListAlert#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DeleteListAlert extends Fragment {
    Button button1,button2;
    View view;
    int val;
    public DeleteListAlert() {
        // Required empty public constructor
    }


    public static DeleteListAlert newInstance() {
        DeleteListAlert fragment = new DeleteListAlert();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_delete_list_alert, container, false);
        button1 = view.findViewById(R.id.button14);
        button2 = view.findViewById(R.id.button15);
        val=getArguments().getInt("value");
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                yesClicked();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                noClicked();
            }
        });
        return view;
    }

    public void noClicked()
    {
        ((ShoppingListActivity)getActivity()).removeAlert();
    }
    public void yesClicked()
    {
        ((ShoppingListActivity)getActivity()).yesRemove(val);
    }
}

package com.example.assignment_2.fragments;

import android.os.Bundle;

import android.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.assignment_2.R;
import com.example.assignment_2.activieties.ShoppingListActivity;
import com.example.assignment_2.database_helpers.DatabaseHelperShoppingLists;
import com.google.gson.Gson;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NewList#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NewList extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    DatabaseHelperShoppingLists shoppingLists;
    Button button;
    EditText editText;
    View view;
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public NewList() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment NewList.
     */
    // TODO: Rename and change types and number of parameters
    public static NewList newInstance(String param1, String param2) {
        NewList fragment = new NewList();
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
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_new_list, container, false);
        button = view.findViewById(R.id.button16);
        editText = view.findViewById(R.id.editText6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddNewList();
            }
        });

        return view;
    }

    public void AddNewList()
    {
        ((ShoppingListActivity)getActivity()).AddToList(editText.getText().toString());
        ((ShoppingListActivity)getActivity()).removeAlert();
    }
}

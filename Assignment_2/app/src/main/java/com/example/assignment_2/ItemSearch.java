package com.example.assignment_2;

import android.os.Bundle;

import android.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class ItemSearch extends Fragment {
    List<Item > itemDatabase = new ArrayList<>();
    Integer[] imageList = { R.drawable.cola, R.drawable.milk,R.drawable.chicken_drumstick, R.drawable.orange_drink, R.drawable.strawberry_milkshake};
    String[] nameList = {"Cola", "Milk", "Chicken", "Fanta", "Strawberry Milk"};
    String[] descriptionList={"Brown sweet drink","liquid cow","Delicious chicken","orange drink that i hate","Pink liquid cow"};

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ItemSearch() {
        // Required empty public constructor
    }
    public RecyclerView tempView;
    public ItemListAdaptor itemAdaptor;
    public View view;

    public static ItemSearch newInstance(String param1, String param2) {
        ItemSearch fragment = new ItemSearch();
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

        for (int i= 0; i< imageList.length; i++ )
        { int image = imageList[i];
            String name = nameList[i];
            String description = descriptionList[i];

            com.example.assignment_2.Item item = new com.example.assignment_2.Item (i, image, name, description);
            itemDatabase.add(item);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_item_search, container, false);
        tempView= view.findViewById(R.id.RectView);
        itemAdaptor = new ItemListAdaptor(itemDatabase);
        tempView.setAdapter(itemAdaptor);

        return view;
    }
}

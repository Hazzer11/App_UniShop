package com.example.assignment_2.activieties;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import android.app.Fragment;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


import androidx.appcompat.app.AppCompatActivity;

import com.example.assignment_2.R;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CouponListActivity#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CouponListActivity extends AppCompatActivity {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    Context context=this;
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CouponListActivity() {
        // Required empty public constructor
    }


    public static CouponListActivity newInstance(String param1, String param2) {
        CouponListActivity fragment = new CouponListActivity();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coupon_list);

        ImageView HomeButton=findViewById(R.id.imageView7);
        HomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x=new Intent(context, Main2Activity.class);
                startActivityForResult(x,0);
            }
        });
    }


}

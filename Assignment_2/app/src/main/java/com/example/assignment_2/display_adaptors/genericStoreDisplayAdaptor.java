package com.example.assignment_2.display_adaptors;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignment_2.classes.Item;
import com.example.assignment_2.R;

import java.util.List;

public class genericStoreDisplayAdaptor extends RecyclerView.Adapter<genericStoreDisplayAdaptor.genericStoreDisplayAdaptor_ViewHolder>{

    List<Item> itemList;
    Context context;

    public genericStoreDisplayAdaptor(List<Item> itemlist) {
        this.itemList=itemlist;

    }

    @NonNull
    @Override
    public genericStoreDisplayAdaptor_ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View storeView = LayoutInflater.from(context).inflate(R.layout.generic_store_display,parent,false);
        return new genericStoreDisplayAdaptor.genericStoreDisplayAdaptor_ViewHolder(storeView);
    }

    @Override
    public void onBindViewHolder(@NonNull genericStoreDisplayAdaptor_ViewHolder holder, int position) {
        holder.NameTextView.setText(itemList.get(position).getName());
        holder.NameTextView2.setText(itemList.get(position).getId());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class genericStoreDisplayAdaptor_ViewHolder extends RecyclerView.ViewHolder{

        public TextView NameTextView;
        public TextView NameTextView2;

        public genericStoreDisplayAdaptor_ViewHolder(@NonNull View itemView) {
            super(itemView);

            NameTextView =itemView.findViewById(R.id.textView21);
            NameTextView2 =itemView.findViewById(R.id.textView22);
        }

    }
}

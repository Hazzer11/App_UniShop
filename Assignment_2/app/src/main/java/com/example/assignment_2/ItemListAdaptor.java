package com.example.assignment_2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemListAdaptor extends RecyclerView.Adapter<ItemListAdaptor.ItemListAdaptor_ViewHolder>{

    List<Item> itemList;
    Context context;
    public ItemListAdaptor(List<Item> itemlist) {
        this.itemList=itemlist;

    }

    public class ItemListAdaptor_ViewHolder extends RecyclerView.ViewHolder{


        public ImageView ItemImageView;
        public TextView NameTextView;
        public TextView NameTextView2;

        public ItemListAdaptor_ViewHolder(@NonNull View itemView) {
            super(itemView);
            ItemImageView = itemView.findViewById(R.id.imageView4);
            NameTextView =itemView.findViewById(R.id.textView21);
            NameTextView2 =itemView.findViewById(R.id.textView22);
        }

    }

    @NonNull
    @Override
    public ItemListAdaptor_ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.item_list_button,parent,false);
        return new ItemListAdaptor.ItemListAdaptor_ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemListAdaptor_ViewHolder holder, int position) {
        holder.ItemImageView.setImageResource(itemList.get(position).getImage());
        holder.NameTextView.setText(itemList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }




}

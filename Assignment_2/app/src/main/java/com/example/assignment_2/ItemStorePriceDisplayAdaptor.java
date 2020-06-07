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

public class ItemStorePriceDisplayAdaptor extends RecyclerView.Adapter<ItemStorePriceDisplayAdaptor.ItemStorePriceDisplayAdaptor_ViewHolder>{

    List<Item> itemList;
    Context context;

    public ItemStorePriceDisplayAdaptor(List<Item> itemlist) {
        this.itemList=itemlist;

    }

    @NonNull
    @Override
    public ItemStorePriceDisplayAdaptor_ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View storeView = LayoutInflater.from(context).inflate(R.layout.item_store_price,parent,false);
        return new ItemStorePriceDisplayAdaptor.ItemStorePriceDisplayAdaptor_ViewHolder(storeView);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemStorePriceDisplayAdaptor_ViewHolder holder, int position) {
        holder.NameTextView.setText(itemList.get(position).getName());
        holder.NameTextView2.setText(itemList.get(position).getId());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class ItemStorePriceDisplayAdaptor_ViewHolder extends RecyclerView.ViewHolder{

        public TextView NameTextView;
        public TextView NameTextView2;

        public ItemStorePriceDisplayAdaptor_ViewHolder(@NonNull View itemView) {
            super(itemView);

            NameTextView =itemView.findViewById(R.id.textView21);
            NameTextView2 =itemView.findViewById(R.id.textView22);
        }

    }
}

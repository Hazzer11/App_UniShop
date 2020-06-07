
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

public class ShoppingListItemDisplayAdaptor extends RecyclerView.Adapter<ShoppingListItemDisplayAdaptor.ShoppingListItemDisplayAdaptor_ViewHolder>{

    List<Item> itemList;
    Context context;

    public ShoppingListItemDisplayAdaptor(List<Item> itemlist) {
        this.itemList=itemlist;

    }

    @NonNull
    @Override
    public ShoppingListItemDisplayAdaptor_ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View storeView = LayoutInflater.from(context).inflate(R.layout.shopping_list_item_display,parent,false);
        return new ShoppingListItemDisplayAdaptor.ShoppingListItemDisplayAdaptor_ViewHolder(storeView);
    }

    @Override
    public void onBindViewHolder(@NonNull ShoppingListItemDisplayAdaptor_ViewHolder holder, int position) {
        holder.NameTextView.setText(itemList.get(position).getName());
        holder.NameTextView2.setText(itemList.get(position).getId());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class ShoppingListItemDisplayAdaptor_ViewHolder extends RecyclerView.ViewHolder{

        public TextView NameTextView;
        public TextView NameTextView2;

        public ShoppingListItemDisplayAdaptor_ViewHolder(@NonNull View itemView) {
            super(itemView);

            NameTextView =itemView.findViewById(R.id.textView21);
            NameTextView2 =itemView.findViewById(R.id.textView22);
        }

    }
}

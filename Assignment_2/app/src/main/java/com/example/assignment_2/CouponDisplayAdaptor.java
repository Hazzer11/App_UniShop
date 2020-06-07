
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

public class CouponDisplayAdaptor extends RecyclerView.Adapter<CouponDisplayAdaptor.CouponDisplayAdaptor_ViewHolder>{

    List<Item> itemList;
    Context context;

    public CouponDisplayAdaptor(List<Item> itemlist) {
        this.itemList=itemlist;

    }

    @NonNull
    @Override
    public CouponDisplayAdaptor_ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View storeView = LayoutInflater.from(context).inflate(R.layout.coupons_display,parent,false);
        return new CouponDisplayAdaptor.CouponDisplayAdaptor_ViewHolder(storeView);
    }

    @Override
    public void onBindViewHolder(@NonNull CouponDisplayAdaptor_ViewHolder holder, int position) {
        holder.NameTextView.setText(itemList.get(position).getName());
        holder.NameTextView2.setText(itemList.get(position).getId());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class CouponDisplayAdaptor_ViewHolder extends RecyclerView.ViewHolder{

        public TextView NameTextView;
        public TextView NameTextView2;

        public CouponDisplayAdaptor_ViewHolder(@NonNull View itemView) {
            super(itemView);

            NameTextView =itemView.findViewById(R.id.textView24);
            NameTextView2 =itemView.findViewById(R.id.textView25);
        }

    }
}

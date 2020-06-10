package com.example.assignment_2;
        import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.TextView;
        import androidx.annotation.NonNull;
        import androidx.recyclerview.widget.RecyclerView;

        import com.example.assignment_2.classes.Item;

        import java.util.List;

public class SettingsOptions extends RecyclerView.Adapter<SettingsOptions.SettingsOptions_ViewHolder>{

    List<Item> itemList;
    Context context;

    public SettingsOptions(List<Item> itemlist) {
        this.itemList=itemlist;

    }

    @NonNull
    @Override
    public SettingsOptions_ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View storeView = LayoutInflater.from(context).inflate(R.layout.settings_options,parent,false);
        return new SettingsOptions.SettingsOptions_ViewHolder(storeView);
    }

    @Override
    public void onBindViewHolder(@NonNull SettingsOptions_ViewHolder holder, int position) {
        holder.NameTextView.setText(itemList.get(position).getName());
        holder.NameTextView2.setText(itemList.get(position).getId());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class SettingsOptions_ViewHolder extends RecyclerView.ViewHolder{

        public TextView NameTextView;
        public TextView NameTextView2;

        public SettingsOptions_ViewHolder(@NonNull View itemView) {
            super(itemView);

            NameTextView =itemView.findViewById(R.id.textView21);
            NameTextView2 =itemView.findViewById(R.id.textView22);
        }

    }
}

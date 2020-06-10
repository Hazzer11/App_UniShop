
package com.example.assignment_2.display_adaptors;
import android.app.Fragment;
        import android.app.FragmentManager;
        import android.app.FragmentTransaction;
        import android.content.Context;
import android.os.Bundle;
import android.util.Log;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.Button;
        import android.widget.TextView;
        import androidx.annotation.NonNull;
        import androidx.appcompat.app.AppCompatActivity;
        import androidx.recyclerview.widget.RecyclerView;

        import com.example.assignment_2.activieties.ShoppingListActivity;
        import com.example.assignment_2.classes.Item;
        import com.example.assignment_2.R;
        import com.example.assignment_2.fragments.DeleteListAlert;
        import com.example.assignment_2.fragments.NewList;
        import com.example.assignment_2.fragments.dropdown;

        import java.util.List;

import static android.app.PendingIntent.getActivity;

public class ShoppingListDisplayAdaptor extends RecyclerView.Adapter<ShoppingListDisplayAdaptor.shoppingListDisplayAdaptor_ViewHolder>{

    List<String> itemList;
    Context context;

    public ShoppingListDisplayAdaptor(Context context,List<String> itemList) {
        this.itemList=itemList;
        this.context=context;
    }

    public class shoppingListDisplayAdaptor_ViewHolder extends RecyclerView.ViewHolder{

        public TextView NameTextView;

        public Button NameTextView2;

        public shoppingListDisplayAdaptor_ViewHolder(@NonNull View itemView) {
            super(itemView);

            NameTextView =itemView.findViewById(R.id.textView32);
            NameTextView2 =itemView.findViewById(R.id.button);
        }

    }

    @NonNull
    @Override
    public shoppingListDisplayAdaptor_ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View storeView = LayoutInflater.from(context).inflate(R.layout.fragment_shopping_list_display_adaptor,parent,false);

        return new ShoppingListDisplayAdaptor.shoppingListDisplayAdaptor_ViewHolder(storeView);
    }

    @Override
    public void onBindViewHolder(@NonNull shoppingListDisplayAdaptor_ViewHolder holder, final int position) {

        holder.NameTextView.setText(itemList.get(position).toString());
        holder.NameTextView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeList(position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }



    public void removeList(Integer id){
        Bundle bundle= new Bundle();
        bundle.putInt("value",id);
        Fragment tempFrag = new DeleteListAlert();
        tempFrag.setArguments(bundle);
        FragmentManager fm = ((ShoppingListActivity)context).getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        ft.replace(R.id.fragmentAlert1, tempFrag);

        ft.addToBackStack(null);
        ft.commit();
    }

    public void listSelected(Integer id){
        ((ShoppingListActivity)context).listClicked(id);
    }
}

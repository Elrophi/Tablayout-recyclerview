package com.example.root.lta;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class recyclerviewAdapter extends RecyclerView.Adapter<recyclerviewAdapter.Myviewer> {



   Context context;
    List<Food> data;

    public recyclerviewAdapter(Context context, List<Food> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public Myviewer onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        view = LayoutInflater.from(context).inflate(R.layout.drink_item,viewGroup, false);


        Myviewer myviewer = new Myviewer(view);

        return myviewer;
    }

    @Override
    public void onBindViewHolder(@NonNull Myviewer myviewer, int i) {

        myviewer.txtname.setText(data.get(i).getName());
        myviewer.txtitem.setText(data.get(i).getItem());
        myviewer.txtprice.setText(data.get(i).getPrice());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class Myviewer extends RecyclerView.ViewHolder{

        private TextView txtitem;
        private TextView txtname;
        private TextView txtprice;

        public Myviewer(@NonNull View itemView) {
            super(itemView);

            txtitem = (TextView) itemView.findViewById(R.id.ch_item);
            txtname = (TextView) itemView.findViewById(R.id.nameitem);
            txtprice = (TextView) itemView.findViewById(R.id.price);



        }
    }
}

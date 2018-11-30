package com.example.root.lta;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Fragmentfood extends Fragment {
    View view;

    private RecyclerView myrecyclerview;
    private List<Food> istFood;

    public Fragmentfood() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.food_fragment, container, false);
        myrecyclerview = (RecyclerView) view.findViewById(R.id.food_recycle);

        recyclerviewAdapter rva = new recyclerviewAdapter(getContext(),istFood);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(rva);
        return view;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        istFood = new ArrayList<>();

        istFood.add(new Food("Chapati",  "white/brown", R.drawable.chapati));
        istFood.add(new Food("Meat",  "white/brown", R.drawable.meat));
        istFood.add(new Food("Rice",  "white/brown", R.drawable.rice));
        istFood.add(new Food("Beans",  "white/brown", R.drawable.beans));
        istFood.add(new Food("Ugali",  "white/brown", R.drawable.ugali));
        istFood.add(new Food("Chapati",  "white/brown", R.drawable.chapati));
        istFood.add(new Food("Meat",  "white/brown", R.drawable.meat));
        istFood.add(new Food("Rice",  "white/brown", R.drawable.rice));
        istFood.add(new Food("Beans",  "white/brown", R.drawable.beans));
        istFood.add(new Food("Ugali",  "white/brown", R.drawable.ugali));
        istFood.add(new Food("Chapati",  "white/brown", R.drawable.chapati));
        istFood.add(new Food("Meat",  "white/brown", R.drawable.meat));

    }
}

package com.example.recyclestuggedridlay;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {

    private ArrayList<MovieExample> list;

    private MyHolder.OnClick onClick = new MyHolder.OnClick() {
        @Override
        public void onDeleteClicked(int position) {
            list.remove(position);
            notifyItemRemoved(position);
        }
    };

    public MyAdapter(ArrayList<MovieExample> list){
        this.list = list;
    }


    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_view_example,
                viewGroup, false);
        MyHolder myHolder = new MyHolder(view);
        myHolder.setOnClick(onClick);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int i) {
        MovieExample movieExample = list.get(i);
        myHolder.getImageView().setImageResource(movieExample.getImageId());
        myHolder.getTextView().setText(movieExample.getImageName());
    }

    public void addElement(MovieExample movieExample){
//        list.add(movieExample);
//        notifyItemInserted(list.size());

        list.add(0, movieExample);

        notifyItemInserted(0);
    }


    @Override
    public int getItemCount() {
        return list.size();
    }
}

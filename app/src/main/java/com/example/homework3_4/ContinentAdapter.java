package com.example.homework3_4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentAdapter.ContinentViewHolder> {

    private ArrayList<Continent> continentList;
    private OnClick onItemClickListener;

    public ContinentAdapter(ArrayList<Continent> continentList, OnClick onItemClickListener) {
        this.continentList = continentList;
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public ContinentAdapter.ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_continent, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentAdapter.ContinentViewHolder holder, int position) {
    holder.bind(continentList.get(position));
    }

    @Override
    public int getItemCount() {
        return continentList.size();
    }

    public class ContinentViewHolder extends RecyclerView.ViewHolder {

        private TextView tvName;


        public ContinentViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_continent);

        }

        public void bind(Continent continent){
            tvName.setText(continent.getName());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onItemClickListener.onItemClick(getAdapterPosition());
                }
            });

        }
    }
}
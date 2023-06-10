package com.hrgroup.retrofit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<MyViewHolder> {


    private Context context;
    private List<Model> movies;

    public Adapter(Context context, List<Model> movies) {
        this.context = context;
        this.movies = movies;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.retrofit_layout,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Glide.with(context).load(movies.get(position).getPoster()).into(holder.image);
        holder.title.setText(movies.get(position).getTitle());
        holder.runtime.setText(movies.get(position).getRuntime());

    }

    @Override
    public int getItemCount() {
        return movies.size();
    }
}

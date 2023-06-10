package com.hrgroup.nestedjesonwithretrofit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context context;
    private List<Product> products;

    public MyAdapter(Context context, List<Product> products) {
        this.context = context;
        this.products = products;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.design_component,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Product product = products.get(position);
        Glide.with(context).load(products.get(position).getImage()).into(holder.product_image);
        holder.product_title.setText(products.get(position).getTitle());
        holder.product_description.setText(products.get(position).getDescription());
        holder.product_rating.setText(products.get(position).getRating().getRate());
        holder.product_quantity.setText(products.get(position).getRating().getCount());

    }

    @Override
    public int getItemCount() {
        return products.size();
    }
}

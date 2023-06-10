package com.hrgroup.nestedjesonwithretrofit;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView product_image;
    TextView product_title, product_description, product_rating, product_quantity, product_price;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        product_image = itemView.findViewById(R.id.product_image);
        product_title = itemView.findViewById(R.id.product_title);
        product_description = itemView.findViewById(R.id.product_description);
        product_rating = itemView.findViewById(R.id.product_rating);
        product_quantity = itemView.findViewById(R.id.product_quantity);
        product_price = itemView.findViewById(R.id.product_price);
    }
}

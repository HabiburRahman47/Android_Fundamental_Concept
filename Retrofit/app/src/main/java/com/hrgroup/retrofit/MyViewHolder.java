package com.hrgroup.retrofit;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
     ImageView image;
     TextView title,runtime;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        image = itemView.findViewById(R.id.imageView);
        title = itemView.findViewById(R.id.titleTV);
        runtime = itemView.findViewById(R.id.runtimeTV);

    }
}

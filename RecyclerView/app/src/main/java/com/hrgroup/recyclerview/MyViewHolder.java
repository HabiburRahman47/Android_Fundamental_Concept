package com.hrgroup.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView nameText;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        nameText = itemView.findViewById(R.id.nameTV);
    }
}

package com.feisel.fendisha.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.feisel.fendisha.R;
import com.feisel.fendisha.models.CartModel;

import java.util.List;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.ViewHolder> {

    List<CartModel> list;

    public CartAdapter(List<CartModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public CartAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CartAdapter.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.mycart_item, parent, false));    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());
        holder.price.setText(list.get(position).getPrice());
        holder.rating.setText(list.get(position).getRating());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name;
        TextView rating;
        TextView price;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.detailed_imgc);
            name = itemView.findViewById(R.id.detailed_namec);
            price = itemView.findViewById(R.id.textView12c);
            rating = itemView.findViewById(R.id.detailed_ratingc);
        }
    }
}

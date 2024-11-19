package com.feisel.fendisha.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.feisel.fendisha.R;
import com.feisel.fendisha.models.HomeHorModel;
import com.feisel.fendisha.models.HomeVerModel;

import java.util.ArrayList;

public class HomeHorAdapter  extends RecyclerView.Adapter<HomeHorAdapter.ViewHolder> {

    UpdateVerRec updateVerRec;
    Activity activity;
    ArrayList<HomeHorModel> list;

    boolean check = true;
    boolean select = true;
    int row_index = -1;

    public HomeHorAdapter(UpdateVerRec updateVerRec, Activity activity, ArrayList<HomeHorModel> list) {
        this.updateVerRec = updateVerRec;
        this.activity = activity;
        this.list = list;
    }

    @NonNull
    @Override
    public HomeHorAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_slider, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());

        if (check) {
            ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
            homeVerModels.add(new HomeVerModel(R.drawable.pizza1, "Pizza 1", "11:10-23:10", "4.9", "Min - $35"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza2, "Pizza 2", "11:10-23:10", "4.9", "Min - $35"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza3, "Pizza 3", "11:10-23:10", "4.9", "Min - $35"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza4, "Pizza 4", "11:10-23:10", "4.9", "Min - $35"));

            updateVerRec.callBack(position, homeVerModels);
            check = false;

        }
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                row_index = position;
                notifyDataSetChanged();

                if (position == 0) {
                    ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                    homeVerModels.add(new HomeVerModel(R.drawable.pizza1, "Pizza 1", "11:10-23:10", "4.9", "Min - $35"));
                    homeVerModels.add(new HomeVerModel(R.drawable.pizza2, "Pizza 2", "11:10-23:10", "4.9", "Min - $35"));
                    homeVerModels.add(new HomeVerModel(R.drawable.pizza3, "Pizza 3", "11:10-23:10", "4.9", "Min - $35"));
                    homeVerModels.add(new HomeVerModel(R.drawable.pizza4, "Pizza 4", "11:10-23:10", "4.9", "Min - $35"));

                    updateVerRec.callBack(position, homeVerModels);
                } else if (position == 1) {
                    ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                    homeVerModels.add(new HomeVerModel(R.drawable.burger1, "burger 1", "11:10-23:10", "4.9", "Min - $35"));
                    homeVerModels.add(new HomeVerModel(R.drawable.burger2, "burger 2", "11:10-23:10", "4.9", "Min - $35"));
                    homeVerModels.add(new HomeVerModel(R.drawable.burger4, "burger 3", "11:10-23:10", "4.9", "Min - $35"));

                    updateVerRec.callBack(position, homeVerModels);
                } else if (position == 2) {
                    ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                    homeVerModels.add(new HomeVerModel(R.drawable.fries1, "fries 1", "11:10-23:10", "4.9", "Min - $35"));
                    homeVerModels.add(new HomeVerModel(R.drawable.fries2, "fries 2", "11:10-23:10", "4.9", "Min - $35"));
                    homeVerModels.add(new HomeVerModel(R.drawable.fries3, "fries 3", "11:10-23:10", "4.9", "Min - $35"));

                    updateVerRec.callBack(position, homeVerModels);
                } else if (position == 3) {
                    ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                    homeVerModels.add(new HomeVerModel(R.drawable.icecream1, "Ice Cream 1", "11:10-23:10", "4.9", "Min - $35"));
                    homeVerModels.add(new HomeVerModel(R.drawable.icecream2, "Ice Cream 2", "11:10-23:10", "4.9", "Min - $35"));
                    homeVerModels.add(new HomeVerModel(R.drawable.icecream3, "Ice Cream 3", "11:10-23:10", "4.9", "Min - $35"));

                    updateVerRec.callBack(position, homeVerModels);
                } else if (position == 4) {
                    ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                    homeVerModels.add(new HomeVerModel(R.drawable.sandwich1, "Sandwich 1", "11:10-23:10", "4.9", "Min - $35"));
                    homeVerModels.add(new HomeVerModel(R.drawable.sandwich2, "Sandwich 2", "11:10-23:10", "4.9", "Min - $35"));
                    homeVerModels.add(new HomeVerModel(R.drawable.sandwich3, "Sandwich 3", "11:10-23:10", "4.9", "Min - $35"));
                    homeVerModels.add(new HomeVerModel(R.drawable.sandwich4, "Sandwich 4", "11:10-23:10", "4.9", "Min - $35"));

                    updateVerRec.callBack(position, homeVerModels);
                }
            }
        });

        if (select) {
            if (position == 0) {
                holder.cardView.setBackgroundResource(R.drawable.change_bg);
                select = false;
            }
        } else {
            if (row_index == position) {
                holder.cardView.setBackgroundResource(R.drawable.change_bg);
            } else {
                holder.cardView.setBackgroundResource(R.drawable.default_bg);
            }
        }
    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name;
        CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.home_piz);
            name = itemView.findViewById(R.id.home_pizza_text);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}

package com.feisel.fendisha.activities;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.feisel.fendisha.R;
import com.feisel.fendisha.adapters.DetailedDailyMAdapter;
import com.feisel.fendisha.models.DetailedDailyMModel;

import java.util.ArrayList;
import java.util.List;

public class DetailedDailyMealActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<DetailedDailyMModel> detailedDailyMModelList;
    DetailedDailyMAdapter dailyMAdapter;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_daily_meal);

        String type = getIntent().getStringExtra("type");

        recyclerView = findViewById(R.id.detailed_rec);
        imageView = findViewById(R.id.detailed_img);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        detailedDailyMModelList = new ArrayList<>();
        dailyMAdapter = new DetailedDailyMAdapter(detailedDailyMModelList);
        recyclerView.setAdapter(dailyMAdapter);

        if (type != null && type.equalsIgnoreCase("breakfast")) {
            detailedDailyMModelList.add(new DetailedDailyMModel("10am to 9pm", "$40", "4.4", "Description", "Breakfast", R.drawable.fav1));
            detailedDailyMModelList.add(new DetailedDailyMModel("10am to 9pm", "$40", "4.4", "Description", "Breakfast", R.drawable.fav2));
            detailedDailyMModelList.add(new DetailedDailyMModel("10am to 9pm", "$40", "4.4", "Description", "Breakfast", R.drawable.fav3));
            dailyMAdapter.notifyDataSetChanged();
        }
        if (type != null && type.equalsIgnoreCase("sweets")) {
            imageView.setImageResource(R.drawable.sweets);
            detailedDailyMModelList.add(new DetailedDailyMModel("10am to 9pm", "$40", "4.4", "Description", "Sweets", R.drawable.s1));
            detailedDailyMModelList.add(new DetailedDailyMModel("10am to 9pm", "$40", "4.4", "Description", "Sweets", R.drawable.s2));
            detailedDailyMModelList.add(new DetailedDailyMModel("10am to 9pm", "$40", "4.4", "Description", "Sweets", R.drawable.s3));
            dailyMAdapter.notifyDataSetChanged();
        }

    }
}
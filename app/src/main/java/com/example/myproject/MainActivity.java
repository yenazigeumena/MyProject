package com.example.myproject;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.gridRecyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        List<Items> itemsList = new ArrayList<>();
        itemsList.add(new Items("헬스", R.drawable.gym));
        itemsList.add(new Items("필라테스",R.drawable.pila));
        itemsList.add(new Items("수영", R.drawable.swim));
        itemsList.add(new Items("테니스", R.drawable.tennis));
        ItemAdapter adapter = new ItemAdapter(this, itemsList);
        recyclerView.setAdapter(adapter);


        ViewPager2 viewPager = findViewById(R.id.viewPager2);
        List<BannerItem> bannerItems = new ArrayList<>();
        bannerItems.add(new BannerItem(R.drawable.first));
        bannerItems.add(new BannerItem(R.drawable.second));
        bannerItems.add(new BannerItem(R.drawable.third));
        bannerItems.add(new BannerItem(R.drawable.fourth));
        bannerItems.add(new BannerItem(R.drawable.fifth));

        // Adapter 설정
        BannerAdapter bannerAdapter = new BannerAdapter(this, bannerItems);
        viewPager.setAdapter(bannerAdapter);

        ImageView PerB = findViewById(R.id.personal);

        PerB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Personal.class);
                startActivity(intent);
            }
        });


    }

}

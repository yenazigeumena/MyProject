package com.example.myproject;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Tennis extends MainActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tennis);
        TextView tvAddress = findViewById(R.id.tv_address);
        tvAddress.setText("테니스");

        ArrayList<Store> stores = new ArrayList<>();
        stores.add(new Store("천안테니스", "★ 4.5 (100+)", R.drawable.tennis));
        stores.add(new Store("오랑우탄테니스", "★ 4.5 (100+)", R.drawable.tennis));

        StoreAdapter adapter = new StoreAdapter(this, stores);

        // ListView와 어댑터 연결
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}

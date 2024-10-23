package com.example.myproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class Gym extends BaseActivity{
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gym);
        TextView tvAddress = findViewById(R.id.tv_address);
        tvAddress.setText("헬스장");
        setPersonalButtonClickListener(R.id.imageView);

        ArrayList<Store> stores = new ArrayList<>();
        stores.add(new Store("고릴라짐", "★ 4.5 (100+)", R.drawable.gym));
        stores.add(new Store("피트니스넘버원", "★ 4.5 (100+)", R.drawable.gym));

        StoreAdapter adapter = new StoreAdapter(this, stores);

        // ListView와 어댑터 연결
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);

    }

}

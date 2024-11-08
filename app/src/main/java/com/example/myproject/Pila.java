package com.example.myproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Pila extends BaseActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.common_list_layout);
        TextView tvAddress = findViewById(R.id.tv_address);
        tvAddress.setText("필라테스");
        setPersonalButtonClickListener(R.id.imageView);

        ArrayList<Store> stores = new ArrayList<>();
        stores.add(new Store("백석필라테스", "★ 4.5 (100+)", R.drawable.pila));
        stores.add(new Store("짱짱필라테스", "★ 4.5 (100+)", R.drawable.pila));

        StoreAdapter adapter = new StoreAdapter(this, stores);

        // ListView와 어댑터 연결
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}

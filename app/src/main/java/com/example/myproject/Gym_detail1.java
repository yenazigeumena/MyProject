package com.example.myproject;

import android.os.Bundle;
import android.widget.TextView;

public class Gym_detail1 extends Gym{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.common_detail_layout);
        TextView tvDetail1 = findViewById(R.id.detailTv1);
        TextView tvDetail2 = findViewById(R.id.detailTv2);
        tvDetail1.setText("고릴라짐");
        tvDetail2.setText("고릴라짐");


    }
}

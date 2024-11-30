package com.example.myproject;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SearchResults extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_results);
        RecyclerView recyclerView = findViewById(R.id.searchResultsRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // 더미 데이터 예제
        List<String> storeList = new ArrayList<>();
        storeList.add("고릴라짐");
        storeList.add("필라테스 스튜디오");
        storeList.add("수영장");
        storeList.add("테니스 클럽");

        // 검색어 가져오기
        String query = getIntent().getStringExtra("query");
        if (query != null && !query.isEmpty()) {
            // 검색어로 데이터 필터링
            List<String> filteredList = storeList.stream()
                    .filter(store -> store.contains(query))
                    .collect(Collectors.toList());

            if (!filteredList.isEmpty()) {
                // RecyclerView 어댑터 설정
                SearchResultsAdapter adapter = new SearchResultsAdapter(filteredList);
                recyclerView.setAdapter(adapter);
            } else {
                Toast.makeText(this, "검색 결과가 없습니다.", Toast.LENGTH_SHORT).show();
            }
        }

    }
}

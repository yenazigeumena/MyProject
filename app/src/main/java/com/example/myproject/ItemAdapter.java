package com.example.myproject;
// MyAdapter.java
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {
    private List<Items> itemList; // 데이터 소스
    private Context context;

    public ItemAdapter(Context context, List<Items> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // item_layout.xml 레이아웃을 인플레이트
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout_grid, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // 현재 아이템에 대한 텍스트와 이미지 설정
        Items item = itemList.get(position);
        holder.textView.setText(item.getText());
        holder.imageView.setImageResource(item.getImage()); // Glide 또는 Picasso 라이브러리 사용 가능
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;

        ViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_grid_title);
            imageView = itemView.findViewById(R.id.iv_grid_image);
        }
    }
}

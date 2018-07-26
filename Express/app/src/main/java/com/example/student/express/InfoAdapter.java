package com.example.student.express;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;


public class InfoAdapter extends RecyclerView.Adapter<InfoAdapter.InfoViewHolder> {
    final   Context context;
    final int [] imageArray;

    public InfoAdapter(Context context, int[] imageArray, int position) {
        this.context = context;
        this.imageArray = imageArray;
        this.position = position;

    }

    final int position;



    @Override
    public InfoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.layout_info_item, parent, false);
        return  new InfoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(InfoViewHolder holder, int position) {
        holder.infoImage.setImageResource(imageArray[position]);

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class InfoViewHolder extends RecyclerView.ViewHolder {

        ImageView infoImage;
        InfoViewHolder(View itemView) {
            super(itemView);

            infoImage= itemView.findViewById(R.id.image_info_item);
        }
    }


}

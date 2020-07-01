package com.example.camilafaiza;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class adapterlist extends RecyclerView.Adapter<adapterlist.ListViewHolder> {
    private ArrayList<wisata> listwisata;
    private OnClickListener mOnClickListener;
    Context context;
    public adapterlist(ArrayList<wisata> list,OnClickListener onClickListener) {
        this.listwisata = list;
        this.mOnClickListener = onClickListener;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_rwisata, viewGroup, false);
        return new ListViewHolder(view, mOnClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        wisata w = listwisata.get(position);
        Glide.with(holder.itemView.getContext())
                .load(w.getFoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgFoto);
        holder.tvNama.setText(w.getNama());
        holder.tvDetail.setText(w.getDetail());
        holder.tvRating.setRating(w.getRating());
    }

    @Override
    public int getItemCount() {
        return listwisata.size();
    }

    public static class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgFoto;
        TextView tvNama, tvDetail;
        RatingBar tvRating;
        OnClickListener onClickListener;

        public ListViewHolder(@NonNull View itemView, OnClickListener onClickListener) {
            super(itemView);
            imgFoto = itemView.findViewById(R.id.img_item_photo);
            tvNama = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            tvRating = itemView.findViewById(R.id.rating_bar);
            this.onClickListener = onClickListener;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            onClickListener.onClickListener(getAdapterPosition());

        }
    }
    public interface OnClickListener {
        void onClickListener(int position);
    }
}

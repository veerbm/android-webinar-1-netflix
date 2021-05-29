package com.sunit.myfirstapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.MovieViewHolder> {
    private ArrayList<Integer> posterImages;

    public static class MovieViewHolder extends RecyclerView.ViewHolder{

        private ImageView posterImage;
        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);

            posterImage = itemView.findViewById(R.id.image_poster);
        }
    }

    public Adapter(ArrayList<Integer> posterImages) {
        this.posterImages = posterImages;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_movie, parent, false);

        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        Integer currentPoster = posterImages.get(position);

        holder.posterImage.setImageResource(currentPoster);

    }

    @Override
    public int getItemCount() {
        return posterImages.size();
    }


}

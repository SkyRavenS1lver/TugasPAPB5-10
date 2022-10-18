package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

public class GameAdapter extends RecyclerView.Adapter<GameAdapter.ViewHolder> {

    private final ArrayList<Games> values;
    private final LayoutInflater inflater;


    public GameAdapter(Context context, ArrayList<Games> values) {
        this.values = values;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public GameAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_game, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final GameAdapter.ViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        final Games games = values.get(position);
        holder.judul.setText(games.name);
        holder.category.setText("Genre: " + games.category);
        holder.image.setImageResource(games.pic);
        Drawable bg = ContextCompat.getDrawable(inflater.getContext(), R.drawable.bgrv);
        Drawable bg2 = ContextCompat.getDrawable(inflater.getContext(), R.drawable.bgrv2);
        Drawable bg3 = ContextCompat.getDrawable(inflater.getContext(), R.drawable.bgrv3);
        Drawable bg4 = ContextCompat.getDrawable(inflater.getContext(), R.drawable.bgrv4);
        Drawable bg5 = ContextCompat.getDrawable(inflater.getContext(), R.drawable.bgrv5);
        switch (games.category) {
            case "MOBA":
                holder.itemView.setBackground(bg);
                break;
            case "Visual Novel":
                holder.itemView.setBackground(bg5);
                break;
            case "FPS":
                holder.itemView.setBackground(bg2);
                break;
            case "RPG":
                holder.itemView.setBackground(bg3);
                break;
            case "Racing":
                holder.itemView.setBackground(bg4);
                break;
        }

        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(), DetailGameActivity.class);
                String name = games.name;
                int image =  games.pic;
                String desc = games.desc;

                intent.putExtra("judul", name);
                intent.putExtra("gambar", image);
                intent.putExtra("desc", desc);

                v.getContext().startActivity(intent);
                //String message = txt.getText().toString();

            }

        });

    }

    @Override
    public int getItemCount() {
        return values.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView judul;
        TextView category;
        ImageView image;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            judul = itemView.findViewById(R.id.judul);
            category = itemView.findViewById(R.id.category);
            image = itemView.findViewById(R.id.gambar);
        }
    }
}

package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import androidx.annotation.NonNull;
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
        holder.txtName.setText(games.name);
        holder.txtColor.setText("Warna: "+ games.color);
        holder.txtDesc.setText("Desc: "+ games.desc);

        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), String.valueOf(position), Toast.LENGTH_LONG).show();
                Intent intent = new Intent(holder.itemView.getContext(), DetailGameActivity.class);

                String name = games.name;
                int image =  games.pic;
                String desc = games.desc;
                String category = games.category;

                intent.putExtra("judul", name);
                intent.putExtra("gambar", image);
                intent.putExtra("desc", desc);
                intent.putExtra("category", category);

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

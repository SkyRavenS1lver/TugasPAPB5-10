package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.ViewHolder> {

    private final ArrayList<Animal> values;
    private final LayoutInflater inflater;
    public static final String MESSAGE_EXTRA = "MESSAGE_KEY";
    public static final String MESSAGE_EXTRA2 = "MESSAGE_KEY2";
    public static final String MESSAGE_EXTRA3 = "MESSAGE_KEY3";


    public AnimalAdapter(Context context, ArrayList<Animal> values) {
        this.values = values;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public AnimalAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_animal, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final AnimalAdapter.ViewHolder holder, final int position) {
        Animal animal = values.get(position);
        holder.txtName.setText(animal.name);
        holder.txtColor.setText("Warna: "+animal.color);
        holder.txtDesc.setText("Desc: "+animal.desc);

        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), String.valueOf(position), Toast.LENGTH_LONG).show();
                Intent intent = new Intent(holder.itemView.getContext(), DetailAnimalActivity.class);

                String name = holder.txtName.getText().toString();
                String color =  holder.txtColor.getText().toString();
                String desc = holder.txtDesc.getText().toString();

                intent.putExtra(MESSAGE_EXTRA, name);
                intent.putExtra(MESSAGE_EXTRA2, color);
                intent.putExtra(MESSAGE_EXTRA3, desc);

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
        public TextView txtName;
        TextView txtColor;
        TextView txtDesc;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            txtName = itemView.findViewById(R.id.txt_name);
            txtColor = itemView.findViewById(R.id.txt_color);
            txtDesc = itemView.findViewById(R.id.txt_desc);
        }
    }
}

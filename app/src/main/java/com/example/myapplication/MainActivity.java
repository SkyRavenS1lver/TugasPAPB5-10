package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Animal> animals = new ArrayList<>();
    private AnimalAdapter animalAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        addData();
        animalAdapter = new AnimalAdapter(this, animals);
        recyclerView = findViewById(R.id.rv_animal);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(animalAdapter);
    }

    private void addData() {
        animals.add(new Animal("Babi", "Pink", "Badannya gendut, larinya lambat, suka ngorok, suka main dilumpur"));
        animals.add(new Animal("Anjing", "Sangat Hitam", "Sangat berbahaya jika mengejar, dan jika menggigit juga akan terasa sakit"));
        animals.add(new Animal("Monyet", "Agak Coklat", "Bisa manjat-manjat di pohon, suka makan pisang, ga pernah mandi, berbahaya bisa mencopet dompet dan hp"));
        animals.add(new Animal("Kucing", "Emas Mengkilap", "Sangat lucu sekali, dan bisa dielus elus"));
        animals.add(new Animal("Babi", "Pink", "Badannya gendut"));
        animals.add(new Animal("Anjing", "Sangat Hitam", "Sangat berbahaya jika mengejar"));
        animals.add(new Animal("Monyet", "Agak Coklat", "Bisa manjat-manjat di pohon"));
        animals.add(new Animal("Kucing", "Emas", "Sangat lucu sekali"));
        animals.add(new Animal("Babi", "Pink", "Badannya gendut"));
        animals.add(new Animal("Anjing", "Sangat Hitam", "Sangat berbahaya jika mengejar"));
        animals.add(new Animal("Monyet", "Agak Coklat", "Bisa manjat-manjat di pohon"));
        animals.add(new Animal("Kucing", "Emas", "Sangat lucu sekali"));
        animals.add(new Animal("Babi", "Pink", "Badannya gendut"));
        animals.add(new Animal("Anjing", "Sangat Hitam", "Sangat berbahaya jika mengejar"));
        animals.add(new Animal("Monyet", "Agak Coklat", "Bisa manjat-manjat di pohon"));
        animals.add(new Animal("Kucing", "Emas", "Sangat lucu sekali"));
        animals.add(new Animal("Babi", "Pink", "Badannya gendut"));
        animals.add(new Animal("Anjing", "Sangat Hitam", "Sangat berbahaya jika mengejar"));
        animals.add(new Animal("Monyet", "Agak Coklat", "Bisa manjat-manjat di pohon"));
        animals.add(new Animal("Kucing", "Emas", "Sangat lucu sekali"));
    }
}

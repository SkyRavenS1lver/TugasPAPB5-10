package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Games> games = new ArrayList<>();
    private GameAdapter gameAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        addData();
        gameAdapter = new GameAdapter(this, games);
        recyclerView = findViewById(R.id.rv_animal);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(gameAdapter);
    }

    private void addData() {
        games.add(new Games("DoTA 2", R.drawable.dota, "MOBA", getString(R.string.dota)));
        games.add(new Games("Mobile Legend", R.drawable.ml, "MOBA", getString(R.string.ML)));
        games.add(new Games("League of Legends", R.drawable.lol, "MOBA", getString(R.string.LOL)));

        games.add(new Games("Rewrite", R.drawable.rewrite, "Visual Novel", getString(R.string.rewrite)));
        games.add(new Games("Danganronpa", R.drawable.danganronpa, "Visual Novel", getString(R.string.danganronpa)));
        games.add(new Games("Clannad After Story", R.drawable.clannad, "Visual Novel", getString(R.string.clannad)));

        games.add(new Games("Tales of Vesperia", R.drawable.tov, "RPG", getString(R.string.TOV)));
        games.add(new Games("Final Fantasy X", R.drawable.ffx, "RPG", getString(R.string.ffx)));
        games.add(new Games("Rogue Galaxy", R.drawable.rogue, "RPG", getString(R.string.rogue)));

        games.add(new Games("CoD: Modern Warfare", R.drawable.cod, "FPS", getString(R.string.cod)));
        games.add(new Games("CSGO", R.drawable.csgo, "FPS", getString(R.string.csgo)));
        games.add(new Games("Black", R.drawable.black, "FPS", getString(R.string.black)));

        games.add(new Games("NFS Most Wanted", R.drawable.mw, "Racing", getString(R.string.mw)));
        games.add(new Games("Midnight Club 3", R.drawable.mclub, "Racing", getString(R.string.mclub)));
        games.add(new Games("Forza Horizon 5", R.drawable.fh5, "Racing", getString(R.string.fh5)));
    }
}

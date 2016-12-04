package ru.irina.comicsfilms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ComicsFilms[] фильмы;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        фильмы = new ComicsFilms[3];
        фильмы[0] = new ComicsFilms("Человек-паук", "https://upload.wikimedia.org/wikipedia/ru/5/5f/Spiderman_movie.jpg", "Columbia Pictures", 2002, 139000000, 821708551, false );
        фильмы[1] = new ComicsFilms("Доктор Стрэндж", "https://upload.wikimedia.org/wikipedia/ru/c/c7/Doctor_Strange_poster.jpg", "Marvel Studios", 2016, 165000000 ,620069731 , true );
        фильмы[2] = new ComicsFilms("Дэдпул","https://upload.wikimedia.org/wikipedia/ru/b/b2/Deadpool_film.jpg", "20th Century Fox", 2016, 58000000, 782612155, true );

        ListView listView = (ListView) findViewById(R.id.ListView);
        int itemLayout = android.R.layout.simple_list_item_1;
        ArrayAdapter adapter = new ArrayAdapter<ComicsFilms>(this, itemLayout,фильмы);
        listView.setAdapter(adapter);




    }
}

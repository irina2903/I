package ru.irina.comicsfilms;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {
    ComicsFilms[] фильмы;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        фильмы = new ComicsFilms[13];
        фильмы[0] = new ComicsFilms("Человек-паук", "https://upload.wikimedia.org/wikipedia/ru/5/5f/Spiderman_movie.jpg", "Columbia Pictures", 2002, 139000000, 821708551, false);
        фильмы[1] = new ComicsFilms("Доктор Стрэндж", "https://upload.wikimedia.org/wikipedia/ru/c/c7/Doctor_Strange_poster.jpg", "Marvel Studios", 2016, 165000000, 620069731, true);
        фильмы[2] = new ComicsFilms("Дэдпул", "https://upload.wikimedia.org/wikipedia/ru/b/b2/Deadpool_film.jpg", "20th Century Fox", 2016, 58000000, 782612155, true);
        фильмы[3] = new ComicsFilms("Первый мститель: Противостояние", "https://upload.wikimedia.org/wikipedia/ru/thumb/b/b5/..", "Marvel Studios", 2016, 250000000, 1153304495, true);
        фильмы[4] = new ComicsFilms("Тор", "https://upload.wikimedia.org/wikipedia/ru/f/fc/Thor_p..", "Marvel Studios", 2011, 150000000, 449326618, false);
        фильмы[5] = new ComicsFilms("Тор 2: Царство тьмы", "https://upload.wikimedia.org/wikipedia/ru/0/04/Thor_T..", "Marvel Studios", 2013, 170000000, 644571402, false);
        фильмы[6] = new ComicsFilms("Мстители", "https://upload.wikimedia.org/wikipedia/ru/3/3c/The_Av..", "Marvel Studios", 2012, 220000000, 1518812988, false);
        фильмы[7] = new ComicsFilms("Мстители: Эра Альтрона", "https://upload.wikimedia.org/wikipedia/ru/0/04/The_Av..", "Marvel Studios", 2015, 250000000, 1405403694, false);
        фильмы[8] = new ComicsFilms("Бэтмен против Супермена: На заре справедливости", "https://upload.wikimedia.org/wikipedia/ru/thumb/f/f0/..",
                "DC Entertainment", 2016, 250000000, 873260194, true);
        фильмы[9] = new ComicsFilms("Отряд самоубийц", "https://upload.wikimedia.org/wikipedia/ru/4/4d/Suicid..", "Warner Bros", 2016, 175000000, 745600054, true);
        фильмы[10] = new ComicsFilms("Железный человек", "https://upload.wikimedia.org/wikipedia/ru/3/30/Iron_man_filmposter.jpg", "Marvel Studios", 2008, 140000000, 585174222, false);
        фильмы[11] = new ComicsFilms("Первый мститель", "https://upload.wikimedia.org/wikipedia/ru/4/44/CaptainAmerica.jpg", "Marvel Studios", 2011, 140000000, 370569774, false);
        фильмы[12] = new ComicsFilms("Человек-муравей", "https://upload.wikimedia.org/wikipedia/ru/7/75/Ant-Man_poster.jpg", "Marvel Studios", 2015, 130000000, 519311965, false);


        ListView listView = (ListView) findViewById(R.id.ListView);
        int itemLayout = android.R.layout.simple_list_item_1;
        ArrayAdapter adapter = new ComicsFilmsAdapter(this, itemLayout, фильмы);
        listView.setAdapter(adapter);


    }

}
package ru.irina.comicsfilms;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
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
        фильмы[0] = new ComicsFilms("Человек-паук", "http://www.phimhd24.net/resources/images/thumb/1469842406-nguoi-nhen.jpg", "Columbia Pictures", 2002, 139000000, 821708551, false);
        фильмы[1] = new ComicsFilms("Доктор Стрэндж", "https://upload.wikimedia.org/wikipedia/ru/c/c7/Doctor_Strange_poster.jpg", "Marvel Studios", 2016, 165000000, 620069731, true);
        фильмы[2] = new ComicsFilms("Дэдпул", "https://upload.wikimedia.org/wikipedia/ru/b/b2/Deadpool_film.jpg", "20th Century Fox", 2016, 58000000, 782612155, true);
        фильмы[3] = new ComicsFilms("Первый мститель: Противостояние", "http://fusion-freak.es/wp-content/uploads/2016/04/image-4.jpeg", "Marvel Studios", 2016, 250000000, 1153304495, true);
        фильмы[4] = new ComicsFilms("Тор", "https://upload.wikimedia.org/wikipedia/ru/thumb/f/fc/Thor_poster.jpg/210px-Thor_poster.jpg", "Marvel Studios", 2011, 150000000, 449326618, false);
        фильмы[5] = new ComicsFilms("Тор 2: Царство тьмы", "http://www.kinokadr.ru/filmzimg/t/thor2/thor2_poster7.jpg", "Marvel Studios", 2013, 170000000, 644571402, false);
        фильмы[6] = new ComicsFilms("Мстители", "http://cdn.movieweb.com/img.news/NEiF2c5DVD0clj_1_12.jpg", "Marvel Studios", 2012, 220000000, 1518812988, false);
        фильмы[7] = new ComicsFilms("Мстители: Эра Альтрона", "https://s-media-cache-ak0.pinimg.com/564x/f8/14/4a/f8144ac690acf9baa8faecdb37189f10.jpg", "Marvel Studios", 2015, 250000000, 1405403694, false);
        фильмы[8] = new ComicsFilms("Бэтмен против Супермена: На заре справедливости", "http://kinoripi.ru/uploads/posts/2016-07/thumbs/1467442517_770631.jpg",
                "DC Entertainment", 2016, 250000000, 873260194, true);
        фильмы[9] = new ComicsFilms("Отряд самоубийц", "http://androidhd.org/uploads/posts/2016-07/1469663085_otr0.jpg", "Warner Bros", 2016, 175000000, 745600054, true);
        фильмы[10] = new ComicsFilms("Железный человек", "https://upload.wikimedia.org/wikipedia/ru/3/30/Iron_man_filmposter.jpg", "Marvel Studios", 2008, 140000000, 585174222, false);
        фильмы[11] = new ComicsFilms("Первый мститель", "https://upload.wikimedia.org/wikipedia/ru/4/44/CaptainAmerica.jpg", "Marvel Studios", 2011, 140000000, 370569774, false);
        фильмы[12] = new ComicsFilms("Человек-муравей", "https://upload.wikimedia.org/wikipedia/ru/7/75/Ant-Man_poster.jpg", "Marvel Studios", 2015, 130000000, 519311965, false);


        ListView listView = (ListView) findViewById(R.id.ListView);
        int itemLayout = android.R.layout.simple_list_item_1;
        ArrayAdapter adapter = new ComicsFilmsAdapter(this, itemLayout, фильмы);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ComicsFilms choosedComicsFilm = фильмы[position];

                Intent intent = new Intent(MainActivity.this, ComicsFilmsActivity.class);
                intent.putExtra("КОМИКСЫ", choosedComicsFilm);
                startActivity(intent);


            }
        });



    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // создаём меню
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.sort_item:
               Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);

                return true;
            default:
                return true;
        }
    }

}
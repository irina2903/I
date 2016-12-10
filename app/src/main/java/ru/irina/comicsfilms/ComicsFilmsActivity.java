package ru.irina.comicsfilms;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.io.Serializable;

/**
 * Created by ГЭМ on 10.12.2016.
 */

public class ComicsFilmsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comics_films);

        ComicsFilms comicsFilms = (ComicsFilms) getIntent().getSerializableExtra("КОМИКСЫ");

        TextView titleTextView = (TextView) findViewById(R.id.textView2);
        titleTextView.setText(comicsFilms.title);

        ImageView photoImageView = (ImageView) findViewById(R.id.imageView2);
        Picasso.with(this).load(comicsFilms.photo).fit().centerCrop().into(photoImageView);





    }
}
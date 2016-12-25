package ru.irina.comicsfilms;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
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

        TextView titleTextView = (TextView) findViewById(R.id.title_text_view);
        titleTextView.setText(comicsFilms.title);

        ImageView photoImageView = (ImageView) findViewById(R.id.imageView2);
        Picasso.with(this).load(comicsFilms.photo).fit().centerCrop().into(photoImageView);

       TextView titleOfCompany = (TextView) findViewById(R.id.titleCompany);
       titleOfCompany.setText(comicsFilms.названииеКинокомпании);

        TextView yearOfRelease = (TextView) findViewById(R.id.year_of_release);
        yearOfRelease.setText(String.valueOf(comicsFilms.годРелиза));

        ImageView screenshot1ImageView = (ImageView) findViewById(R.id.screenshot_1_image_view);
        ImageView screenshot2ImageView = (ImageView) findViewById(R.id.screenshot_2_image_view);
        ImageView screenshot3ImageView = (ImageView) findViewById(R.id.screenshot_3_image_view);
        ViewGroup screenshotContainer = (ViewGroup) findViewById(R.id.screenshot_container);
        if (comicsFilms.displayScreenshots) {
            screenshotContainer.setVisibility(View.VISIBLE);
            Picasso.with(this).load(comicsFilms.screenshot1).fit().centerCrop().into(screenshot1ImageView);
            Picasso.with(this).load(comicsFilms.screenshot2).fit().centerCrop().into(screenshot2ImageView);
            Picasso.with(this).load(comicsFilms.screenshot3).fit().centerCrop().into(screenshot3ImageView);
        } else {
            screenshotContainer.setVisibility(View.GONE);
        }





    }
}
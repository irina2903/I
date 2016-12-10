package ru.irina.comicsfilms;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by ГЭМ on 10.12.2016.
 */

public class ComicsFilmsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comicsfilms);


        String photo = getIntent().getStringExtra("ФОТОГРАФИЯ");
        String названииеКинокомпании = getIntent().getStringExtra("НАЗВАНИЕ");

        TextView titleTextView = (TextView) findViewById(R.id.textView2);
        titleTextView.setText(названииеКинокомпании);

        ImageView photoImageView = (ImageView) findViewById(R.id.imageView2);
        Picasso.with(this).load(photo).fit().into(photoImageView);


    }
}
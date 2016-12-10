package ru.irina.comicsfilms;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by User on 12/7/2016.
 */

public class ComicsFilmsAdapter extends ArrayAdapter{

    public ComicsFilmsAdapter(Context context, int resource, Object[] objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // создаём элемент для машинки с фотографией и двумя полями
        View view = LayoutInflater.from(getContext()).inflate(R.layout.comicsfilms, parent, false);
        ComicsFilms comicsFilms = (ComicsFilms) getItem(position);



        TextView textView = (TextView) view.findViewById(R.id.textView);
        textView.setText(comicsFilms.title);

        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        Picasso.with(getContext()).load(comicsFilms.photo).fit().centerCrop().into(imageView);

        return view;



    }

}


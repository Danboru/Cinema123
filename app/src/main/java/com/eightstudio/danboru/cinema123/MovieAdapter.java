package com.eightstudio.danboru.cinema123;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MovieAdapter extends ArrayAdapter {


    List list = new ArrayList();

    public MovieAdapter(Context context, int resource) {
        super(context, resource);
    }


    static class Datahandler{

        ImageView cover;
        TextView title;
        TextView rating;

    }

    @Override
    public void add(Object object) {
        super.add(object);

        list.add(object);

    }

    @Override
    public int getCount() { //untuk mengambil ukukran list (di pergunakan untuk looping)

        return this.list.size();
    }

    @Override
    public Object getItem(int position) { //untuk mengambil data dari list

        return this.list.get(position);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row;
        row = convertView;

        Datahandler handler;

        if(convertView == null){

            LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.edited_list, parent, false);

            handler = new Datahandler();

            handler.cover = (ImageView) row.findViewById(R.id.cover_film);
            handler.title = (TextView) row.findViewById(R.id.judul_filem);
            handler.rating = (TextView) row.findViewById(R.id.rating_film);

            row.setTag(handler);
        }
        else {


            handler = (Datahandler) row.getTag();

        }
        MovieDataProvider dataprovider;
        dataprovider = (MovieDataProvider) this.getItem(position);

        handler.cover.setImageResource(dataprovider.getMovie_poster_resource());
        handler.title.setText(dataprovider.getMovie_title());
        handler.rating.setText(dataprovider.getMovie_rating());



        return row;
    }
}

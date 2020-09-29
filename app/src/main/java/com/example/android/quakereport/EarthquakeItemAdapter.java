package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class EarthquakeItemAdapter extends ArrayAdapter {

    public EarthquakeItemAdapter(@NonNull Context context, @NonNull List<Earthquake> Earthquake) {
        super(context, 0, Earthquake);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_list, parent, false);
        }
        Earthquake currentItem = (Earthquake) getItem(position);

        TextView magnitude = (TextView) listItemView.findViewById(R.id.magnitude);

        magnitude.setText(currentItem.getmMagnitude());

        TextView location = (TextView) listItemView.findViewById(R.id.location);
        location.setText(currentItem.getmLocation());

        TextView date = (TextView) listItemView.findViewById(R.id.date);
        date.setText(currentItem.getmDate());


        return listItemView;
    }
}

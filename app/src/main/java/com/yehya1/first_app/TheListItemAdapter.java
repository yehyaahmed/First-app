package com.yehya1.first_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TheListItemAdapter extends BaseAdapter {

    Context context;
    ArrayList<TheListItem> listItems;
    TheListItemAdapter(Context context , ArrayList<TheListItem> listItems){
        this.context = context;
        this.listItems = listItems;
    }
    @Override
    public int getCount() {
        return listItems.size();
    }

    @Override
    public Object getItem(int position) {
        return listItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).
                    inflate(R.layout.layout_item, parent, false);
        }

        TheListItem currentItem = (TheListItem) getItem(position);

        TextView item =convertView.findViewById(R.id.item_view);

        item.setText(currentItem.getItem());

        return convertView;
    }
}

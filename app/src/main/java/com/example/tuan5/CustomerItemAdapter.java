package com.example.tuan5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomerItemAdapter extends BaseAdapter {
    private Context ctx;
    private int layoutitem;
    private ArrayList<Item> arrayList;

    public CustomerItemAdapter(Context ctx, int layoutitem, ArrayList<Item> arrayList) {
        this.ctx = ctx;
        this.layoutitem = layoutitem;
        this.arrayList = arrayList;
    }


    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(ctx).inflate(layoutitem, parent, false);

        TextView tvAbove = convertView.findViewById(R.id.tvAbove);
        TextView tvBottom = convertView.findViewById(R.id.tvBelow);
        ImageView imgV_Ava = convertView.findViewById(R.id.imgA);

        tvAbove.setText(arrayList.get(position).getItemName());
        tvBottom.setText(arrayList.get(position).getShopName());
        imgV_Ava.setImageResource(arrayList.get(position).getImgItem());
        return convertView;
    }
}

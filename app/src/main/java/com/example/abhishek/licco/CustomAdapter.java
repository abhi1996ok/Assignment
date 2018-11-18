package com.example.abhishek.licco;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter {

    Activity activity;
    String[] name;

    public CustomAdapter(Activity activity, String name[])
    {
        super(activity,R.layout.custom_layout,name);
        this.activity=activity;
          this.name=name;
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=activity.getLayoutInflater();
        View v = inflater.inflate(R.layout.custom_layout,null);
        TextView textView = v.findViewById(R.id.text);
        textView.setText(name[position]);

        return v;
    }
}

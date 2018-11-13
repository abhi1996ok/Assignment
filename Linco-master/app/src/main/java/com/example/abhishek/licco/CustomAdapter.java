package com.example.abhishek.licco;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter {
    Context mContext;
    Activity activity;
    Integer images[];
    String name[];

    public CustomAdapter(Activity context, Integer images[], String name[])
    {
        super(context,R.layout.custom_layout,name);
        this.activity= context;
         this.images=images;
          this.name=name;

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=activity.getLayoutInflater();
         View v =inflater.inflate(R.layout.custom_layout,null);

          ImageView imageView = v.findViewById(R.id.logo);
        ImageView imageView1 = v.findViewById(R.id.dowload);
        ImageView imageView2 = v.findViewById(R.id.preview);
        ImageView imageView3 = v.findViewById(R.id.delete);

           TextView textView = v.findViewById(R.id.text);

            textView.setText(name[position]);

             imageView.setImageResource(images[position]);
             imageView1.setImageResource(images[position]);
                imageView2.setImageResource(images[position]);
                imageView3.setImageResource(images[position]);

        return v;
    }
}

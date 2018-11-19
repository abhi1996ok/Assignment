package com.example.abhishek.licco;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomAdapter2 extends ArrayAdapter {

    Activity activity;
    String[] name;
    String[] workHour;
    String[] designation;

    public CustomAdapter2(Activity activity, String[] name,String[] workHour,String[] designation)
    {
        super(activity,R.layout.custom_lay2,name);
        this.activity=activity;
          this.name=name;
          this.workHour=workHour;
          this.designation=designation;

    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=activity.getLayoutInflater();
        View v = inflater.inflate(R.layout.custom_lay2,null);
        TextView textView = v.findViewById(R.id.text0);
        TextView textView1 = v.findViewById(R.id.text1);
        TextView textView2 = v.findViewById(R.id.text2);
        textView.setText(name[position]);
        textView1.setText(workHour[position]);
        textView2.setText(designation[position]);

        return v;
    }
}

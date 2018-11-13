package com.example.abhishek.licco;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;


public class DashBoard extends Fragment  {
    ListView listView;
    ListView listView2;
    ScrollView Scrollparent,child1,child2;
    Integer image[]={
            R.drawable.nameo,
            R.drawable.nameo,
            R.drawable.nameo,
            R.drawable.nameo,
            R.drawable.nameo,
            R.drawable.nameo,
    };
    String names[]={
            "Law",
            "Law",
            "Literature",
            "Literature",
            "Entertainment",
            "Art",
    };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
           View view =inflater.inflate(R.layout.fragment_dashboard, container, false);
        listView=view.findViewById(R.id.listView);
        listView2 =view.findViewById(R.id.listView2);

        child1 =view.findViewById(R.id.child1Scroll);
        child2 =view.findViewById(R.id.child2Scroll);
        CustomAdapter adapter = new CustomAdapter(getActivity(),image,names);
        listView.setAdapter(adapter);
        listView2.setAdapter(adapter);






        return view;


    }

    
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

    }


}




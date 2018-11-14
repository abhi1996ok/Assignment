package com.example.abhishek.licco;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class DashBoard extends Fragment {
    ListView listView;
    ListView listView2;

    String names[]={
            "Law",
            "Law",
            "Literature",
            "Literature",
            "Entertainment",
            "Art",
            "Law",
            "Law",
            "Literature",
            "Literature",
            "Entertainment",
            "Art",
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
        listView2 = view.findViewById(R.id.listView2);

        CustomAdapter adapter = new CustomAdapter(getActivity(),names);
        listView.setAdapter(adapter);
        listView2.setAdapter(adapter);
        return view;
    }
}


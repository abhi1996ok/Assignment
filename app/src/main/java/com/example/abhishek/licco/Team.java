package com.example.abhishek.licco;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class Team extends Fragment {
    String names[]={
            "Abhishek",
            "Rajat",
            "Shubham",
            "Ranjeet",
            "Pravesh",
            "Shyama",
            "Ravi",
            "Rojit",
            "Laxman",
            "Umer",
            "Elliman",
            "Arjun",
    };
    String workHour[]={
            "40",
            "50",
            "60",
            "30",
            "20",
            "30",
            "45",
            "45",
            "45",
            "20",
            "43",
            "35",
    };
    String designation[]={
            "Developer",
            "Developer",
            "Developer",
            "Developer",
            "Developer",
            "Developer",
            "Developer",
            "Developer",
            "Developer",
            "Developer",
            "Developer",
            "Developer",
    };
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_team, container, false);
        ListView listView = v.findViewById(R.id.listView);
        CustomAdapter2 adapter = new CustomAdapter2(getActivity(),names,workHour,designation);
        listView.setAdapter(adapter);
        return v;
    }
}


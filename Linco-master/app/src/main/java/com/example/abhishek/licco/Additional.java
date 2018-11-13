package com.example.abhishek.licco;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class Additional extends Fragment {

    private Spinner proSpin;
    private String proVaules[];

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_additional, container, false);

        proSpin = v.findViewById(R.id.projectSpinner);
        proVaules = getResources().getStringArray(R.array.projectTitle);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_expandable_list_item_1, proVaules);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        adapter.setDropDownViewResource(R.layout.spinner_item);
        proSpin.setAdapter(adapter);
        return v;
    }
}


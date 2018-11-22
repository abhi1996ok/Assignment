package com.example.abhishek.licco;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Promnt extends Fragment {
    Spinner category,no_items;
    String[] cat_list,no_list;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_promnt, container, false);

        category =v.findViewById(R.id.goods_cat);
        no_items =v.findViewById(R.id.no_of_items);

        cat_list = getResources().getStringArray(R.array.goods_category);
        no_list = getResources().getStringArray(R.array.purchace_count);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), R.layout.spinner_text, cat_list);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this.getActivity(), R.layout.spinner_text, no_list);
        adapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        category.setAdapter(adapter);
        no_items.setAdapter(adapter1);

        return v;
    }
}


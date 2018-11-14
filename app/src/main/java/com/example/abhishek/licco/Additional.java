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

    Spinner proSpin, proSpin1, proSpin2;
    String[] proValues, proValues1, proValues2;

    Spinner Equipment_name, Equipment_count, Equipment_hrs;
    String[] equiName, equiCount, equiHrs;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_additional, container, false);

        proSpin = v.findViewById(R.id.projectSpinner);
        proSpin1 = v.findViewById(R.id.projectSpinner1);
        proSpin2 = v.findViewById(R.id.projectSpinner2);


        proValues = getResources().getStringArray(R.array.spinTest);
        proValues1 = getResources().getStringArray(R.array.spinTest1);
        proValues2 = getResources().getStringArray(R.array.spinTest2);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), R.layout.spinner_text, proValues);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this.getActivity(), R.layout.spinner_text, proValues1);
        adapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this.getActivity(), R.layout.spinner_text, proValues2);
        adapter2.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        proSpin.setAdapter(adapter);
        proSpin1.setAdapter(adapter1);
        proSpin2.setAdapter(adapter2);


        Equipment_name = v.findViewById(R.id.equipment_name_tab1);
        Equipment_count = v.findViewById(R.id.equipment_count_tab2);
        Equipment_hrs = v.findViewById(R.id.equipment_hrs_tab3);

        equiName = getResources().getStringArray(R.array.equip_name);
        equiCount = getResources().getStringArray(R.array.equip_count);
        equiHrs = getResources().getStringArray(R.array.equip_hrs);

        ArrayAdapter<String> adapterEqui1 = new ArrayAdapter<String>(this.getActivity(), R.layout.spinner_equi, equiName);
        adapterEqui1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        ArrayAdapter<String> adapterEqui2 = new ArrayAdapter<String>(this.getActivity(), R.layout.spinner_equi, equiCount);
        adapterEqui2.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        ArrayAdapter<String> adapterEqui3 = new ArrayAdapter<String>(this.getActivity(), R.layout.spinner_equi, equiHrs);
        adapterEqui3.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        Equipment_name.setAdapter(adapterEqui1);
        Equipment_count.setAdapter(adapterEqui2);
        Equipment_hrs.setAdapter(adapterEqui3);

        return v;
    }
}






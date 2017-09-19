package com.example.thriftbox;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.thriftbox.adapter.RecordsAdapter;
import com.example.thriftbox.model.Records;

import java.util.ArrayList;



public class RecordsFragment extends Fragment {
    ListView recordsView;
    String [] records_date, records_category, records_value;
    ArrayList<Records> recordsList;
    RecordsAdapter adapter;
    LinearLayoutManager lm;

    public RecordsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_records, container, false);
        final FragmentActivity fragmentActivity = getActivity();


        recordsList = new ArrayList<Records>();
        records_date = getResources().getStringArray(R.array.recordsDate);
        records_category = getResources().getStringArray(R.array.recordsCategory);
        records_value = getResources().getStringArray(R.array.recordsValue);

        for(int i = 0; i < records_date.length; i++){
            recordsList.add(new Records(records_date[i], records_category[i], records_value[i]));
        }

        adapter = new RecordsAdapter(recordsList);

//        recordsView =(ListView) view.findViewById(R.id.recordsView);
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                final RecordsAdapter adapter = new RecordsAdapter(fragmentActivity);
//                fragmentActivity.runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                        recordsView.setAdapter(adapter);
//                    }
//                });
//            }
//        }).start();

//        recordsView.setAdapter(adapter);
        // Inflate the layout for this fragment
        return view;
    }


}

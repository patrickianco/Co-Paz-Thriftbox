package com.example.thriftbox.adapter;

import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.thriftbox.R;
import com.example.thriftbox.model.Records;

import java.util.ArrayList;

/**
 * Created by Patrick Ian Co on 9/20/2017.
 */

public class RecordsAdapter extends RecyclerView.Adapter<RecordsAdapter.RecordsViewHolder> {
    ArrayList<Records> recordsArrayList;

    public RecordsAdapter(ArrayList<Records> recordsArrayList) {
        this.recordsArrayList = recordsArrayList;
    }

    @Override
    public RecordsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.records_row_layout, parent, false);

        RecordsViewHolder recordsViewHolder = new RecordsViewHolder(view);

        return recordsViewHolder;
    }

    @Override
    public void onBindViewHolder(RecordsViewHolder holder, int i) {
        final Records records = recordsArrayList.get(i);
        holder.records_date.setText(records.getRecordsDate());
        holder.records_category.setText(records.getRecordsCategory());
        holder.records_value.setText(records.getRecordsValue());
    }

    @Override
    public int getItemCount() {
        return recordsArrayList.size();
    }

    public static class RecordsViewHolder extends RecyclerView.ViewHolder{

        TextView records_date;
        TextView records_category;
        TextView records_value;


        public RecordsViewHolder(View itemView) {
            super(itemView);
            records_date = itemView.findViewById(R.id.expenseDate);
            records_category = itemView.findViewById(R.id.expenseCategory);
            records_value = itemView.findViewById(R.id.expenseValue);
        }

    }
}

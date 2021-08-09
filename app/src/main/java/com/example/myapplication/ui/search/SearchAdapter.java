package com.example.myapplication.ui.search;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.R;

import java.util.List;

public class SearchAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private List<String> itemList;

    SearchAdapter(Context context, List<String> itemList) {
        this.itemList = itemList;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public String getItem(int position) {
        return itemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.checkbox_layout, parent, false);
        }

        TextView textView = convertView.findViewById(R.id.textView);
        textView.setText(itemList.get(position));

        CheckBox checkBox = convertView.findViewById(R.id.checkbox);
//        checkBox.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(v.getContext(),"즐겨찾기 성공!", Toast.LENGTH_LONG).show();
//            }
//        });

        ListView listView = convertView.findViewById(R.id.list_item);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//            @Override
//            public void onItemClick(AdapterView parent, View v, int position, long id) {
//
//                // get TextView's Text.
////                String strText = (String) parent.getItemAtPosition(position);
//
//                Toast.makeText(v.getContext(), "즐겨찾기 성공!", Toast.LENGTH_LONG).show();
//            }
//        });

        return convertView;
    }
}
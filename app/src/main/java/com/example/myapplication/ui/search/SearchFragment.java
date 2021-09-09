package com.example.myapplication.ui.search;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class SearchFragment extends Fragment {
    private List<String> list;
    private BaseAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        ActionBar actionBar = ((MainActivity) getActivity()).getSupportActionBar();
//        actionBar.hide();

        View view = inflater.inflate(R.layout.fragment_search, container, false);

        ListView listView = view.findViewById(R.id.listView);
        ImageButton imageButton = view.findViewById(R.id.imageButton);

        list = new ArrayList<>();
        setList();

        adapter = new SearchAdapter(getActivity(), list);
        listView.setAdapter(adapter);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SearchFragment2.class);
                startActivity(intent);
            }
        });

        return view;
    }

    private void setList() {
        list.add("1. 당근");
        list.add("2. 상추");
        list.add("3. 고사리");
        list.add("4. 오이");
        list.add("5. 양파");
        list.add("6. 감자");
        list.add("7. 고등어");
        list.add("8. 광어");
        list.add("9. 연어");
        list.add("10. 청양고추");
    }
}
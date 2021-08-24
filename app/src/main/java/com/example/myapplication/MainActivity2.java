package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;

import com.example.myapplication.ui.search.SearchAdapter;

import java.util.ArrayList;
import java.util.List;


public class MainActivity2 extends AppCompatActivity {
    private List<String> list;
    private ArrayList<String> arrayList;
    private BaseAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ListView listView = findViewById(R.id.list_item);

        list = new ArrayList<>();
        setList();

        arrayList = new ArrayList<>();
        arrayList.addAll(list);

        adapter = new SearchAdapter(this, list);
        listView.setAdapter(adapter);

        SearchView searchView = findViewById(R.id.search_view);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                search(newText);
                return false;
            }
        });
    }

    public void search(String query) {
        list.clear();
        for (int i = 0; i < arrayList.size(); i++)
            if (arrayList.get(i).toLowerCase().contains(query.toLowerCase()))
                list.add(arrayList.get(i));
        adapter.notifyDataSetChanged();
    }

    private void setList() {
        list.add("당근");
        list.add("상추");
        list.add("고사리");
        list.add("오이");
        list.add("양파");
        list.add("감자");
        list.add("고등어");
        list.add("광어");
        list.add("소고기");
        list.add("갈치");
        list.add("돼지고기");
        list.add("민어");
        list.add("연어");
        list.add("청양고추");
        list.add("오이고추");
    }
}
package com.example.user.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by user on 03/11/2016.
 */
public class fav extends AppCompatActivity {
    GridView gridView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fav);
        Intent ii = this.getIntent();
        final ArrayList<Integer> arrayList =ii.getExtras().getIntegerArrayList("img");
        final ArrayList<String> arrayList1=ii.getExtras().getStringArrayList("name");
        final ArrayList<String> arrayList2=ii.getExtras().getStringArrayList("body");
        final ArrayList<String> arrayList3=ii.getExtras().getStringArrayList("display");
        final ArrayList<String> arrayList4=ii.getExtras().getStringArrayList("memory");
        final ArrayList<String> arrayList5=ii.getExtras().getStringArrayList("camera");
        final ArrayList<String> arrayList6=ii.getExtras().getStringArrayList("price");

        gridView = (GridView) findViewById(R.id.gridView2);
        add a=new add(arrayList);
         gridView.setAdapter(a);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent app=new Intent(fav.this,detail.class);
                app.putExtra("n",arrayList1.get(i));
                app.putExtra("b",arrayList2.get(i));
                app.putExtra("d",arrayList3.get(i));
                app.putExtra("m",arrayList4.get(i));
                app.putExtra("c",arrayList5.get(i));
                app.putExtra("p",arrayList6.get(i));
                app.putExtra("img",arrayList.get(i));
                startActivity(app);
            }
        });


    }



    public class add extends BaseAdapter {
        ArrayList<Integer> list = new ArrayList<Integer>();

        add(ArrayList<Integer> var) {
            this.list = var;
        }

        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public Object getItem(int i) {
            return list.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            LayoutInflater ly = getLayoutInflater();
            View view1 = ly.inflate(R.layout.row, null);
            ImageView img = (ImageView) view1.findViewById(R.id.row);
            img.setImageResource(list.get(i));
            return view1;
        }
    }
}
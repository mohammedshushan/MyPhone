package com.example.user.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by user on 31/10/2016.
 */

public class second extends AppCompatActivity {


    TextView tt;
    int ccc[];
    GridView view;
    String Name[],Body[],Display[],Memory[],Camera[],Price[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sec);
        LinearLayout ll=(LinearLayout)findViewById(R.id.lay1);
        tt=(TextView)findViewById(R.id.textView);
        view=(GridView)findViewById(R.id.gridView);
        Intent ii=getIntent();
        String ss=ii.getExtras().getString("text").toString();
        tt.setText(ss);
        ccc=ii.getExtras().getIntArray("ke");
        Name=ii.getExtras().getStringArray("apple_name");
        Body=ii.getExtras().getStringArray("apple_body");
        Display=ii.getExtras().getStringArray("apple_display");
        Memory=ii.getExtras().getStringArray("apple_memory");
        Camera=ii.getExtras().getStringArray("apple_camera");
        Price=ii.getExtras().getStringArray("apple_price");
        //Toast.makeText(second.this,"we"+ccc[1],Toast.LENGTH_LONG).show();
        //ll.setBackgroundResource(cc);
        ArrayList<item> opp=new ArrayList<item>();
        for (int i=0;i<10;i++)
        {
            opp.add(new item(ccc[i]));

        }
        add a=new add(opp);
        view.setAdapter(a);
        view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                 Intent app=new Intent(second.this,detail.class);
                 app.putExtra("n",Name[i]);
                 app.putExtra("b",Body[i]);
                 app.putExtra("d",Display[i]);
                 app.putExtra("m",Memory[i]);
                 app.putExtra("c",Camera[i]);
                 app.putExtra("p",Price[i]);
                 app.putExtra("img",ccc[i]);
                 startActivity(app);
            }
        });



    }
    public class add extends BaseAdapter
    {
        ArrayList<item> list=new ArrayList<item>();
        add (ArrayList<item> var)
        {
            this.list=var;
        }

        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public Object getItem(int i) {
            return list.get(i).img;
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            LayoutInflater ly=getLayoutInflater();
            View view1=ly.inflate(R.layout.row,null);
            ImageView img=(ImageView)view1.findViewById(R.id.row);
            img.setImageResource(list.get(i).img);
            return view1;
        }

    }

}

package com.example.user.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by user on 02/11/2016.
 */

public class detail extends AppCompatActivity {
    TextView tt1,tt2,tt3,tt4,tt5,tt6;
    ImageView img,img12;
    DataBase db;
    Button bb;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);
        tt1=(TextView)findViewById(R.id.name);
        tt2=(TextView)findViewById(R.id.body);
        tt3=(TextView)findViewById(R.id.display);
        tt4=(TextView)findViewById(R.id.memory);
        tt5=(TextView)findViewById(R.id.camera);
        tt6=(TextView)findViewById(R.id.price);
        img=(ImageView)findViewById(R.id.imageView);
        img12=(ImageView)findViewById(R.id.imageView2);
        bb=(Button)findViewById(R.id.buy);
        db=new DataBase(this);
        Intent iii=getIntent();
        final String text_name=iii.getExtras().getString("n").toString();
        final String text_body=iii.getExtras().getString("b").toString();
        final String text_display=iii.getExtras().getString("d").toString();
        final String text_memory=iii.getExtras().getString("m").toString();
        final String text_camera=iii.getExtras().getString("c").toString();
        final String text_price=iii.getExtras().getString("p").toString();
        final int img1=iii.getExtras().getInt("img");
        tt1.setText(text_name);tt2.setText(text_body);tt3.setText(text_display);
        tt4.setText(text_memory);tt5.setText(text_camera);tt6.setText(text_price);
        img.setImageResource(img1);
        img12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int cccc=db.check(text_name);
                if(cccc>0) {
                    Toast.makeText(detail.this, "Remove from favorite", Toast.LENGTH_LONG).show();
                    int re=db.delete(text_name);
                }
                else
                 {
                    Toast.makeText(detail.this, "add to favorite", Toast.LENGTH_LONG).show();
                     Boolean re = db.insertDate(img1, text_name, text_body, text_display, text_memory, text_camera, text_price);
                 }

            }
        });
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(detail.this,form.class);
                startActivity(i);
            }
        });

    }


}

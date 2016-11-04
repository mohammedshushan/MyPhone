package com.example.user.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by user on 03/11/2016.
 */
public class form extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5,e6,e7;
    Button bb;
    DataBase db;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form);
        e1=(EditText)findViewById(R.id.full_name);
        e2=(EditText)findViewById(R.id.email);
        e3=(EditText)findViewById(R.id.phone);
        e4=(EditText)findViewById(R.id.number_card);
        e5=(EditText)findViewById(R.id.nation_id);
        e6=(EditText)findViewById(R.id.phone_name);
        e7=(EditText)findViewById(R.id.price);
        final String ss1=e1.getText().toString();
        final String ss2=e2.getText().toString();
        final String ss3=e3.getText().toString();
        final String ss4=e4.getText().toString();
        final String ss5=e5.getText().toString();
        final String ss6=e6.getText().toString();
        final String ss7=e7.getText().toString();
        bb=(Button)findViewById(R.id.sumbit);
        db=new DataBase(this);
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Boolean re = db.insert_form(ss1, ss2, ss3, ss4, ss5, ss6, ss7);
                if (re == true) {
                    Toast.makeText(form.this, "Ok", Toast.LENGTH_LONG).show();
                    e1.setText("");
                    e2.setText("");
                    e3.setText("");
                    e4.setText("");
                    e5.setText("");
                    e6.setText("");
                    e7.setText("");
                } else {
                    Toast.makeText(form.this, "No", Toast.LENGTH_LONG).show();
                }
                try {
                    Intent send=new Intent(Intent.ACTION_SEND);
                    send.setData(Uri.parse("mailto:"));
                    send.setType("message/rfc822");
                    send.putExtra(Intent.EXTRA_EMAIL,"mohammedshushan1995@gmail.com");
                    send.putExtra(Intent.EXTRA_SUBJECT,"buy my phone");
                    send.putExtra(Intent.EXTRA_TEXT,"full name: "+ss1+"\n Email :  "+ss2+"\n phone :  "+ss3+" \n  number card :   "+ss4+" \n  nation id: "+ss5+"  \n phone name : "+ss6+"  \n price : "+ss7);
                    startActivity(send);

                }catch (Exception ex)
                {
                    Toast.makeText(form.this," valid email",Toast.LENGTH_LONG).show();

                }

            }
        });



    }
}

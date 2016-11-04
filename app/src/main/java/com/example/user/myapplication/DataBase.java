package com.example.user.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

/**
 * Created by user on 02/11/2016.
 */
public class DataBase extends SQLiteOpenHelper {
    public static final String Dname="mobile.db";
    public DataBase(Context context) {
        super(context,Dname,null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table sho (id Integer primary key AUTOINCREMENT ,img Integer ,name TEXT ,body Text,display Text,memory Text,camera Text,price Text )");
        db.execSQL("create table form (id Integer primary key AUTOINCREMENT ,full_name Text ,email TEXT ,phone Text,number_card Text,national_id Text,phone_name Text,price Text )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS sho ");
        onCreate(db);
    }
    public boolean insertDate(int img,String name, String body,String display,String memory,String camera,String price) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("img",img);
        values.put("name", name);
        values.put("body", body);
        values.put("display", display);
        values.put("memory", memory);
        values.put("camera", camera);
        values.put("price", price);
        long re = sqLiteDatabase.insert("sho", null, values);
        if (re == -1)
            return false;
        else
            return true;

    }
      public int check(String ss)
      {
          SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
          Cursor re= sqLiteDatabase.rawQuery("select * from sho WHERE name LIKE '"+ss+"'",null);
          int ii=re.getCount();
          return ii;
      }

    public ArrayList getdata_image() {
        ArrayList list = new ArrayList();
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        Cursor res = sqLiteDatabase.rawQuery("select * from sho", null);
        res.moveToFirst();
        while (res.isAfterLast() == false) {
            int element1 = res.getInt(1);
            list.add(element1 );
            res.moveToNext();
        }
        return list;
    }
    public ArrayList getdata_name() {
        ArrayList list = new ArrayList();
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        Cursor res = sqLiteDatabase.rawQuery("select * from sho", null);
        res.moveToFirst();
        while (res.isAfterLast() == false) {
            String element1 = res.getString(2);
            list.add(element1 );
            res.moveToNext();
        }
        return list;
    }
    public ArrayList getdata_body() {
        ArrayList list = new ArrayList();
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        Cursor res = sqLiteDatabase.rawQuery("select * from sho", null);
        res.moveToFirst();
        while (res.isAfterLast() == false) {
            String element1 = res.getString(3);
            list.add(element1 );
            res.moveToNext();
        }
        return list;
    }
    public ArrayList getdata_display() {
        ArrayList list = new ArrayList();
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        Cursor res = sqLiteDatabase.rawQuery("select * from sho", null);
        res.moveToFirst();
        while (res.isAfterLast() == false) {
            String element1 = res.getString(4);
            list.add(element1 );
            res.moveToNext();
        }
        return list;
    }
    public ArrayList getdata_memory() {
        ArrayList list = new ArrayList();
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        Cursor res = sqLiteDatabase.rawQuery("select * from sho", null);
        res.moveToFirst();
        while (res.isAfterLast() == false) {
            String element1 = res.getString(5);
            list.add(element1 );
            res.moveToNext();
        }
        return list;
    }
    public ArrayList getdata_camera() {
        ArrayList list = new ArrayList();
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        Cursor res = sqLiteDatabase.rawQuery("select * from sho", null);
        res.moveToFirst();
        while (res.isAfterLast() == false) {
            String element1 = res.getString(6);
            list.add(element1 );
            res.moveToNext();
        }
        return list;
    }
    public ArrayList getdata_price() {
        ArrayList list = new ArrayList();
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        Cursor res = sqLiteDatabase.rawQuery("select * from sho", null);
        res.moveToFirst();
        while (res.isAfterLast() == false) {
            String element1 = res.getString(7);
            list.add(element1 );
            res.moveToNext();
        }
        return list;
    }
    public Integer delete(String name)
    {
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        return sqLiteDatabase.delete("sho","name=?",new String[]{name} );
    }
    public boolean insert_form(String name, String body,String display,String memory,String nn,String camera,String price) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put("full_name", name);
        values.put("email", body);
        values.put("phone", display);
        values.put("number_card", memory);
        values.put("national_id", nn);
        values.put("phone_name", camera);
        values.put("price", price);
        long re = sqLiteDatabase.insert("form", null, values);
        if (re == -1)
            return false;
        else
            return true;

    }


}

package com.example.assignment_2.database_helpers;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelperStoresContents extends SQLiteOpenHelper {
    private static  String TABLE_NAME = "items_table";
    private static final String COL1 ="ID";
    private static final String COL2 ="ItemID";

    public DatabaseHelperStoresContents(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        TABLE_NAME=name;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + TABLE_NAME
                + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, "
                + COL2 +" INTEGER)";

        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void onAdd(Integer itemID){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL2, itemID);

        db.insert(TABLE_NAME,null,contentValues);
    }
    public Cursor getData(){
        SQLiteDatabase db = this.getReadableDatabase();
        String Query="SELECT * FROM " + TABLE_NAME;
        Cursor data = db.rawQuery(Query,null);
        return data;
    }

    public Cursor getID(String name){
        SQLiteDatabase db = this.getReadableDatabase();
        String query="SELECT " + COL1 +" FROM "+TABLE_NAME+" WHERE '"+ COL2 + " = "+ name +"'";
        Cursor data =db.rawQuery(query,null);
        return data;
    }

    public void delete(Integer ID){
        SQLiteDatabase db = this.getWritableDatabase();
        String query="DELETE FROM "+TABLE_NAME+" WHERE '"+ COL1 + " = '"+ ID +"'";
        db.execSQL(query);

    }
}

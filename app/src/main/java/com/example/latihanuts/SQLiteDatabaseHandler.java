package com.example.latihanuts;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class SQLiteDatabaseHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "AlbumDB";
    private static final String TABLE_NAME = "ALBUM";
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";
    private static final String KEY_ISBOOKMARK = "isBookmark";
    private static final String[] COLUMNS = { KEY_ID, KEY_NAME, KEY_ISBOOKMARK};

    public SQLiteDatabaseHandler(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATION_TABLE = "CREATE TABLE ALBUM ( "
                + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "name TEXT, "
                + "isBookmark TEXT)";

        db.execSQL(CREATION_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME );
        this.onCreate(db);
    }

    public List<main> allAlbums(){
        Vector<album> album;
        String selectQuery = "SELECT * FROM ALBUM";
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        if(cursor.moveToFirst()){
            do{
                a
                album.setId(cursor.getString(0));
                album.setName(cursor.getString(1));
                album.setIsBookmark(cursor.getString(2));
                albums.add(album);
            }while (cursor.moveToNext());
        }

        db.close();
        return albums;
    }
}

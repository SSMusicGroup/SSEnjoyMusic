package com.example.ssenjoymusicapp.model;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class Category {
    String nameCategory;
    ArrayList<Music> arrayList;
    Bitmap image;

    public Category(String nameCategory, ArrayList<Music> arrayList) {
        this.nameCategory = nameCategory;
        this.arrayList = arrayList;
    }

    public Category(String nameCategory, ArrayList<Music> arrayList, Bitmap image) {
        this.nameCategory = nameCategory;
        this.arrayList = arrayList;
        this.image = image;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public ArrayList<Music> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Music> arrayList) {
        this.arrayList = arrayList;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public static Bitmap convertStringToBitmapFromAccess(Context context, String filename){
        AssetManager assetManager = context.getAssets();
        try {
            InputStream is = assetManager.open(filename);
            Bitmap bitmap = BitmapFactory.decodeStream(is);
            return bitmap;
        }catch (IOException e){
            e.printStackTrace();
        }

        return null;
    }
}

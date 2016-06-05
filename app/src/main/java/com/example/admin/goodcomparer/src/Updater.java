package com.example.admin.goodcomparer.src;

/**
 * Created by Miki on 6/3/16.
 */
public class Updater {
    private static Updater ourInstance = new Updater();

    public static Updater getInstance() {
        return ourInstance;
    }

    private Updater() {
    }
    public Good[] getLatestUpdate(){
        return null;
    }
}

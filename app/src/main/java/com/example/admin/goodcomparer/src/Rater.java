package com.example.admin.goodcomparer.src;

/**
 * Created by Miki on 6/3/16.
 */
public class Rater {
    private static Rater ourInstance = new Rater();

    public static Rater getInstance() {
        return ourInstance;
    }

    private Rater() {
    }
    public Good getGood(String goodName){
        return null;
    }
    public void rateGood(Good good, int starPOW){

    }
}

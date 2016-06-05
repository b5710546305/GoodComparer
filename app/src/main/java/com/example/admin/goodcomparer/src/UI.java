package com.example.admin.goodcomparer.src;

/**
 * Created by Miki on 6/3/16.
 */
public class UI {
    public static Good[] goods;
    private Comparer comparer;
    private Searcher searcher;
    private Updater updater;
    private Rater rater;

    public UI(){

        goods = new Good[256]; //default maximum

        comparer = Comparer.getInstance();
        searcher = Searcher.getInstance();
        updater = Updater.getInstance();
        rater = Rater.getInstance();
    }
    public int getID1selection(String name1){
        return comparer.getID1selection(name1);
    }
    public int getID2selection(int ID1, String name2){
        Good good1 = comparer.getGood1(ID1);
        Good good2 = comparer.getGood2(name2);
        return comparer.compare(good1,good2);
    }
    public Good[] sendKeyword(String name){
        Good[] searched = searcher.lookForMatches(name);
        if(searched.length >= 1){
            return searched;
        } //wait this isn't ArrayList!!!
        return null;
    }
    public void update(){

    }
    public void rate(String goodName, int starPOW){

    }

}

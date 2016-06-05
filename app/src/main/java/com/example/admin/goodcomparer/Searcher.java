package com.example.admin.goodcomparer;

/**
 * Created by Miki on 6/3/16.
 */
public class Searcher {
    private static Searcher ourInstance = new Searcher();

    public static Searcher getInstance() {
        return ourInstance;
    }

    private Searcher() {
    }
    public Good[] lookForMatches(String name){
        Good[] goods = UI.goods;
        Good[] searched = goods.clone();
        for(int i = 0; i < searched.length; i++){
            searched[i] = null;
            if(goods[i] != null) {
                if (goods[i].getName().contains(name)) {
                    searched[i] = goods[i];
                }
            }
        }

        return searched;
    }
    public void sendNoResultMsg(){
        
    }
}

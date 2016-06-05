package com.example.admin.goodcomparer;

/**
 * Created by Miki on 6/3/16.
 */
public class Comparer {
    private static Comparer ourInstance = new Comparer();

    public static Comparer getInstance() {
        return ourInstance;
    }

    private Comparer() {
    }
    public int getID1selection(String name1){
        Good[] goods = UI.goods;
        int i = 0;
       while(i<goods.length){
            if(goods[i].getName().equals(name1)){
                return i;
            }
           i++;
        }
        return i;
    }
    public Good getGood1(int ID1){
        Good[] goods = UI.goods;
        int i = 0;
        while(i<goods.length){
            if(ID1 == i){
                return goods[i];
            }
            i++;
        }
        return null;
    }
    public Good getGood2(String name2){
        Good[] goods = UI.goods;
        int i = 0;
        while(i<goods.length){
            if(goods[i].getName().equals(name2)){
                return goods[i];
            }
            i++;
        }
        return null;
    }
    public int compare(Good good1, Good good2){
        Object[] goodInfo1 = good1.getInfo();
        Object[] goodInfo2 = good2.getInfo();
        int sumGood1 = (int)goodInfo1[0]+(int)goodInfo1[1]-(int)good1.getPrice();
        int sumGood2 = (int)goodInfo2[0]+(int)goodInfo2[1]-(int)good2.getPrice();
        return sumGood1 - sumGood2;
    }
}

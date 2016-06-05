package com.example.admin.goodcomparer;

/**
 * Created by Miki on 6/3/16.
 */
public class Good {
    private String name;
    private Object[] info;
    private double price;
    public Good(String name, int specificationValue, int performance, double price){
        //name is for search
        //price is double, less is better
        //info[0] is spec is interger more is better
        //info[1] is performace, such as RAM is also integer more is better
        //that's all for now for it to work
        this.name = name;
        info = new Object[2];
        this.info[0] = specificationValue;
        this.info[1] = performance;
        this.price = price;

    }
    public String getName(){
        return name;
    }
    public Object[] getInfo(){
        return info;
    }
    public double getPrice(){
        return price;
    }
}

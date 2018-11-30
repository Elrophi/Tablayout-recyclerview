package com.example.root.lta;

public class Food {

    private String Item;
    private String Name;
    private int Price;

    public Food() {
    }

    public Food(String item, String name, int price) {
        Item = item;
        Name = name;
        Price = price;
    }


    public String getItem(){

        return  Item;

    }

    public String getName(){


        return Name;
    }

    public int getPrice(){


        return Price;
    }

    public void setItem(String item) {
        Item = item;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPrice(int price) {
        Price = price;
    }
}

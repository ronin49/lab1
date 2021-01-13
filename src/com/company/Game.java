package com.company;

public class Game {
    private String name;

//    Game(String name) : name(name) {
//
//    }

    Game(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    private int cost;

    public final void print() {
        System.out.println("name  = " + name + ", cost = " + cost);
    }


    String getName() {
        return name;
    }

    int getCost() {
        return cost;
    }

    void setName(String newValue) {
        if(newValue!="")
            name = newValue;
    }

    void setCost(int newValue) {
        if(newValue >= 0)
            cost = newValue;
    }
}

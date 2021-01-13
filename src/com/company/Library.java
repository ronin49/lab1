package com.company;

import java.util.ArrayList;

public class Library {
    private String username;
    private ArrayList<String> games;

    Library(String username) {
        this.username = username;
        games = new ArrayList<>();
    }

    void addGame(String name) {
        games.add(name);
    }

    void print() {
        System.out.println(username + " games");
        for(String s : games)
            System.out.print(s+',');
        System.out.println('\b');
    }
}

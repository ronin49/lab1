package com.company;

public class LibraryService {
    public static void addGame(User user, Game game, Library library) {
        if(user.getBalance() >= game.getCost()) {
            user.setBalance(user.getBalance() - game.getCost());
            library.addGame(game.getName());
        }
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {

        Game callofduty = new Game("call of duty",1000);
        callofduty.print();

        User oleg = new User("olegator");
        oleg.print();

        oleg.setBalance(0);

        oleg.donate(1000);

        Library olegsLibrary = new Library("olegator");
        LibraryService.addGame(oleg,callofduty,olegsLibrary);
        olegsLibrary.print();

        oleg.print();
    }
}

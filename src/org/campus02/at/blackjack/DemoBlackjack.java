package org.campus02.at.blackjack;

public class DemoBlackjack {
    public static void main(String[] args) {
        Player Nik = new Player("Niki", 15);
        Blackjack Spiel = new Blackjack();
        Spiel.addPlayer(Nik);
        System.out.println(Spiel.getValue(Nik));
        System.out.println(Spiel.addCard(Nik, 2));
        System.out.println(Spiel.getValue(Nik));

        System.out.println(Nik);
        System.out.println(Spiel);

    }

}

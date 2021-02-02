package org.campus02.at.blackjack;

import java.util.HashMap;


public class Blackjack {
    private HashMap<Player, Integer> players = new HashMap<>();


    public boolean addPlayer (Player player) {
        if (players.containsKey(player)) {
            return false;
        }
        players.put(player, 0);
        return true;
    }

}

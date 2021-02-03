package org.campus02.at.blackjack;

import java.util.HashMap;
import java.util.Map;


public class Blackjack {
    private HashMap<Player, Integer> players = new HashMap<>();


    public boolean addPlayer (Player player) {
        if (players.containsKey(player)) {
            return false;
        }
        players.put(player, 0);
        return true;
    }

    public boolean addCard(Player player, Integer cardValue) {
        if (players.containsKey(player)) {
            players.put(player, cardValue);
            return true;
        } else return false;
    }

    public Integer getValue(Player player) {
        if (players.containsKey(player)) {
            return players.get(player);
        } else return null;
    }

    @Override
    public String toString() {
        if(players.size() == 0) {
            return "Noch keine Spieler registriert";
        }

        String result = "";
    /*for(Player p : players.keySet()) {
      result += p.getName() + ", Kartenwert: " + players.get(p) + "\n";
    }*/
        for (Player player : players.keySet()) {
            result += player.getName() + players.get(player);
        }
//        for (Map.Entry<Player, Integer> entry : players.entrySet()) {
//            result +="Spieler: " + entry.getKey().getName() +" Kartenwert :"+ entry.getValue() ;
//        }
        return result;
    }
}

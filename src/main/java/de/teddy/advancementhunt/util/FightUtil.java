package de.teddy.advancementhunt.util;

import org.bukkit.entity.Player;

import java.util.HashMap;

public class FightUtil {

    private HashMap<Player, Integer> kills = new HashMap<Player, Integer>();
    private HashMap<Player, Integer> deaths = new HashMap<Player, Integer>();
    private HashMap<Player, Integer> wins = new HashMap<Player, Integer>();
    private HashMap<Player, Integer> looses = new HashMap<Player, Integer>();

    public void addKill(Player player, int amount) {
        if(!kills.containsKey(player)) {
            kills.put(player, amount);
        } else {
            kills.put(player, kills.get(player) + amount);
        }
    }

    public void addDeath(Player player, int amount) {
        if(!deaths.containsKey(player)) {
            deaths.put(player, amount);
        } else {
            deaths.put(player, deaths.get(player) + amount);
        }
    }

    public void addWin(Player player, int amount) {
        if(!wins.containsKey(player)) {
            wins.put(player, amount);
        } else {
            wins.put(player, wins.get(player) + amount);
        }
    }

    public void addLoose(Player player, int amount) {
        if(!looses.containsKey(player)) {
            looses.put(player, amount);
        } else {
            looses.put(player, looses.get(player) + amount);
        }
    }

    public HashMap<Player, Integer> getWins() {
        return wins;
    }

    public HashMap<Player, Integer> getLooses() {
        return looses;
    }

    public HashMap<Player, Integer> getKills() {
        return kills;
    }

    public HashMap<Player, Integer> getDeaths() {
        return deaths;
    }

    public void clear() {
        this.kills.clear();
        this.deaths.clear();
        this.wins.clear();
        this.looses.clear();
    }
}

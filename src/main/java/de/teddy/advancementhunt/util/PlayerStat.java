package de.teddy.advancementhunt.util;


public final class PlayerStat {
    private String uuid;
    private String player_name;
    private int kills;
    private int deaths;
    private int wins;
    private int looses;

    public PlayerStat(String uuid,String player_name)
    {
        this.uuid = uuid;
        this.player_name = player_name;
    }

    public void setKills(int kills)
    {
        this.kills = kills;
    }

    public void setDeaths(int deaths)
    {
        this.deaths = deaths;
    }

    public void setWins(int wins)
    {
        this.wins = wins;
    }

    public void setLooses(int looses)
    {
        this.looses = looses;
    }

    public int getKills()
    {
        return kills;
    }

    public int getDeaths()
    {
        return deaths;
    }

    public int getWins()
    {
        return wins;
    }

    public int getLooses()
    {
        return looses;
    }
}
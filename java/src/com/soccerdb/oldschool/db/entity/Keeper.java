package com.soccerdb.oldschool.db.entity;



public class Keeper{
    private int player_id;
    private int player_total_save;
    

    public Keeper() {
    }

    public Keeper(int player_id, int player_total_save) {
        this.player_id = player_id;
        this.player_total_save = player_total_save;
    }

    public int getPlayer_id() {
        return this.player_id;
    }

    public void setPlayer_id(int player_id) {
        this.player_id = player_id;
    }

    public int getPlayer_total_save() {
        return this.player_total_save;
    }

    public void setPlayer_total_save(int player_total_save) {
        this.player_total_save = player_total_save;
    }
    
    @Override
    public String toString() {
        return "{" +
            " player_id='" + getPlayer_id() + "'" +
            ", player_total_save='" + getPlayer_total_save() + "'" +
            "}";
    }

}
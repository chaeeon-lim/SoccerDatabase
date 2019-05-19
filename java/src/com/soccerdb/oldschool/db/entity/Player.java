package com.soccerdb.oldschool.db.entity;

import java.util.Date;

public class Player{
    private int player_id;
    private String player_name;
    private String player_nationality;
    private int player_debut;
    private Date player_birthday;
    

    public Player() {
    }

    public Player(int player_id, String player_name, String player_position, String player_nationality, int player_debut, Date player_birthday) {
        this.player_id = player_id;
        this.player_name = player_name;
        this.player_nationality = player_nationality;
        this.player_debut = player_debut;
        this.player_birthday = player_birthday;
    }

    public int getPlayer_id() {
        return this.player_id;
    }

    public void setPlayer_id(int player_id) {
        this.player_id = player_id;
    }

    public String getPlayer_name() {
        return this.player_name;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }

    public String getPlayer_nationality() {
        return this.player_nationality;
    }

    public void setPlayer_nationality(String player_nationality) {
        this.player_nationality = player_nationality;
    }

    public int getPlayer_debut() {
        return this.player_debut;
    }

    public void setPlayer_debut(int player_debut) {
        this.player_debut = player_debut;
    }

    public Date getPlayer_birthday() {
        return this.player_birthday;
    }

    public void setPlayer_birthday(Date player_birthday) {
        this.player_birthday = player_birthday;
    }

    @Override
    public String toString() {
        return "{" +
            " player_id='" + getPlayer_id() + "'" +
            ", player_name='" + getPlayer_name() + "'" +
            ", player_nationality='" + getPlayer_nationality() + "'" +
            ", player_debut='" + getPlayer_debut() + "'" +
            ", player_birthday='" + getPlayer_birthday() + "'" +
            "}";
    }


    
}
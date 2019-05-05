package com.soccerdb.oldschool.db.entity;

import java.util.Date;

public class Player{
    private int player_id;
    private String player_name;
    private String player_position;
    private int player_height;
    private int player_weight;
    private String player_nationality;
    private int player_debut;
    private Date player_birthday;
    private int player_total_card;
    private int player_total_game;
    private int player_total_foul;


    public Player() {
    }

    public Player(int player_id, String player_name, String player_position, int player_height, int player_weight, String player_nationality, int player_debut, Date player_birthday, int player_total_card, int player_total_game, int player_total_foul) {
        this.player_id = player_id;
        this.player_name = player_name;
        this.player_position = player_position;
        this.player_height = player_height;
        this.player_weight = player_weight;
        this.player_nationality = player_nationality;
        this.player_debut = player_debut;
        this.player_birthday = player_birthday;
        this.player_total_card = player_total_card;
        this.player_total_game = player_total_game;
        this.player_total_foul = player_total_foul;
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

    public String getPlayer_position() {
        return this.player_position;
    }

    public void setPlayer_position(String player_position) {
        this.player_position = player_position;
    }

    public int getPlayer_height() {
        return this.player_height;
    }

    public void setPlayer_height(int player_height) {
        this.player_height = player_height;
    }

    public int getPlayer_weight() {
        return this.player_weight;
    }

    public void setPlayer_weight(int player_weight) {
        this.player_weight = player_weight;
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

    public int getPlayer_total_card() {
        return this.player_total_card;
    }

    public void setPlayer_total_card(int player_total_card) {
        this.player_total_card = player_total_card;
    }

    public int getPlayer_total_game() {
        return this.player_total_game;
    }

    public void setPlayer_total_game(int player_total_game) {
        this.player_total_game = player_total_game;
    }

    public int getPlayer_total_foul() {
        return this.player_total_foul;
    }

    public void setPlayer_total_foul(int player_total_foul) {
        this.player_total_foul = player_total_foul;
    }


    @Override
    public String toString() {
        return "{" +
            " player_id='" + getPlayer_id() + "'" +
            ", player_name='" + getPlayer_name() + "'" +
            ", player_position='" + getPlayer_position() + "'" +
            ", player_height='" + getPlayer_height() + "'" +
            ", player_weight='" + getPlayer_weight() + "'" +
            ", player_nationality='" + getPlayer_nationality() + "'" +
            ", player_debut='" + getPlayer_debut() + "'" +
            ", player_birthday='" + getPlayer_birthday() + "'" +
            ", player_total_card='" + getPlayer_total_card() + "'" +
            ", player_total_game='" + getPlayer_total_game() + "'" +
            ", player_total_foul='" + getPlayer_total_foul() + "'" +
            "}";
    }

}
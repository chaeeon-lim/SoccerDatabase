package com.soccerdb.oldschool.db.entity;



public class Fieldplayer{
    private int player_id;
    private int player_total_goal;
    private int player_total_assist;

    public Fieldplayer() {
    }

    public Fieldplayer(int player_id, int player_total_goal, int player_total_assist) {
        this.player_id = player_id;
        this.player_total_goal = player_total_goal;
        this.player_total_assist = player_total_assist;
    }

    public int getPlayer_id() {
        return this.player_id;
    }

    public void setPlayer_id(int player_id) {
        this.player_id = player_id;
    }

    public int getPlayer_total_goal() {
        return this.player_total_goal;
    }

    public void setPlayer_total_goal(int player_total_goal) {
        this.player_total_goal = player_total_goal;
    }

    public int getPlayer_total_assist() {
        return this.player_total_assist;
    }

    public void setPlayer_total_assist(int player_total_assist) {
        this.player_total_assist = player_total_assist;
    }

    @Override
    public String toString() {
        return "{" +
            " player_id='" + getPlayer_id() + "'" +
            ", player_total_goal='" + getPlayer_total_goal() + "'" +
            ", player_total_assist='" + getPlayer_total_assist() + "'" +
            "}";
    }


}
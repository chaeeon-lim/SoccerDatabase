package com.soccerdb.oldschool.db.entity;

import java.util.Date;

public class Game{
    private int game_id;
    private Date game_time;
    private String game_place;
    private String game_weather;
    private int game_bonus_time;
    private boolean game_is_extended;
    private boolean game_is_shoot_out;
    private String game_type;
    private int game_score;
    private int game_foul;
    private int game_ball_occupation;
    private int game_card;
    private int game_corner_kick;
    private int game_penalty_kick;
    private int game_throwing;
    private String game_uniform_color;
    public Game() {
    }

public Game(int game_id,Date game_time,String game_place,String game_weather,int game_bonus_time,boolean game_is_extended,boolean game_is_shoot_out,String game_type,int game_score,int game_foul,int game_ball_occupation,int game_card,int game_corner_kick,int game_penalty_kick,int game_throwing,String game_uniform_color) {
    	
    this.game_id=game_id;
   	this.game_time=game_time;
    this.game_place=game_place;
   	this.game_weather=game_weather;
   	this.game_bonus_time=game_bonus_time;
   	this.game_is_extended=game_is_extended;
   	this.game_is_shoot_out=game_is_shoot_out;
   	this.game_type=game_type;
   	this.game_score=game_score;
   	this.game_foul=game_foul;
    this.game_ball_occupation=game_ball_occupation;
   	this.game_card=game_card;
    this.game_corner_kick=game_corner_kick;
    this.game_penalty_kick=game_penalty_kick;
    this.game_throwing=game_throwing;
   	this.game_uniform_color=game_uniform_color;   	
}

public int getGame_id() {
	return game_id;
}

public void setGame_id(int game_id) {
	this.game_id = game_id;
}

public Date getgame_time() {
	return game_time;
}

public void setgame_time(Date game_time) {
	this.game_time = game_time;
}

public String getgame_place() {
	return game_place;
}

public void setgame_place(String game_place) {
	this.game_place = game_place;
}

public String getgame_weather() {
	return game_weather;
}

public void setgame_weather(String game_weather) {
	this.game_weather = game_weather;
}

public int getgame_bonus_time() {
	return game_bonus_time;
}

public void setgame_bonus_time(int game_bonus_time) {
	this.game_bonus_time = game_bonus_time;
}

public boolean isgame_is_extended() {
	return game_is_extended;
}

public void setgame_is_extended(boolean game_is_extended) {
	this.game_is_extended = game_is_extended;
}

public boolean isgame_is_shoot_out() {
	return game_is_shoot_out;
}

public void setgame_is_shoot_out(boolean game_is_shoot_out) {
	this.game_is_shoot_out = game_is_shoot_out;
}

public String getGame_type() {
	return game_type;
}

public void setGame_type(String game_type) {
	this.game_type = game_type;
}

public int getgame_score() {
	return game_score;
}

public void setgame_score(int game_score) {
	this.game_score = game_score;
}

public int getgame_foul() {
	return game_foul;
}

public void setgame_foul(int game_foul) {
	this.game_foul = game_foul;
}

public int getgame_ball_occupation() {
	return game_ball_occupation;
}

public void setgame_ball_occupation(int game_ball_occupation) {
	this.game_ball_occupation = game_ball_occupation;
}

public int getgame_card() {
	return game_card;
}

public void setgame_card(int game_card) {
	this.game_card = game_card;
}

public int getgame_corner_kick() {
	return game_corner_kick;
}

public void setgame_corner_kick(int game_corner_kick) {
	this.game_corner_kick = game_corner_kick;
}

public int getgame_penalty_kick() {
	return game_penalty_kick;
}

public void setgame_penalty_kick(int game_penalty_kick) {
	this.game_penalty_kick = game_penalty_kick;
}

public int getgame_throwing() {
	return game_throwing;
}

public void setgame_throwing(int game_throwing) {
	this.game_throwing = game_throwing;
}

public String getgame_uniform_color() {
	return game_uniform_color;
}

public void setgame_uniform_color(String game_uniform_color) {
	this.game_uniform_color = game_uniform_color;
}

@Override
public String toString() {
	return "Game [game_id=" + game_id + ", game_time=" + game_time + ", game_place=" + game_place + ", game_weather=" + game_weather + ", game_bonus_time="
			+ game_bonus_time + ", game_is_extended=" + game_is_extended + ", game_is_shoot_out=" + game_is_shoot_out + ", game_type="
			+ game_type + ", game_score=" + game_score + ", game_foul=" + game_foul + ", game_ball_occupation=" + game_ball_occupation + ", game_card="
			+ game_card + ", game_corner_kick=" + game_corner_kick + ", game_penalty_kick=" + game_penalty_kick + ", game_throwing=" + game_throwing
			+ ", game_uniform_color=" + game_uniform_color + "]";
}



}
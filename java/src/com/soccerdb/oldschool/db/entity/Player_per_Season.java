package com.soccerdb.oldschool.db.entity;

public class Player_per_Season {

	private int player_id;
	private int season_id;
	private String pps_position;
	private int pps_height;
	private int pps_weight;
	private int pps_season_goal;
	private int pps_season_assist;
	private int pps_season_save;
	private int pps_season_game;
	private int pps_season_card;
	private int pps_season_foul;
	

	public Player_per_Season() {
	}

	public Player_per_Season(int player_id, int season_id, String pps_position, int pps_height, int pps_weight, int pps_season_goal, int pps_season_assist, int pps_season_save, int pps_season_game, int pps_season_card, int pps_season_foul) {
		this.player_id = player_id;
		this.season_id = season_id;
		this.pps_position = pps_position;
		this.pps_height = pps_height;
		this.pps_weight = pps_weight;
		this.pps_season_goal = pps_season_goal;
		this.pps_season_assist = pps_season_assist;
		this.pps_season_save = pps_season_save;
		this.pps_season_game = pps_season_game;
		this.pps_season_card = pps_season_card;
		this.pps_season_foul = pps_season_foul;
	}

	public int getPlayer_id() {
		return this.player_id;
	}

	public void setPlayer_id(int player_id) {
		this.player_id = player_id;
	}

	public int getSeason_id() {
		return this.season_id;
	}

	public void setSeason_id(int season_id) {
		this.season_id = season_id;
	}

	public String getPps_position() {
		return this.pps_position;
	}

	public void setPps_position(String pps_position) {
		this.pps_position = pps_position;
	}

	public int getPps_height() {
		return this.pps_height;
	}

	public void setPps_height(int pps_height) {
		this.pps_height = pps_height;
	}

	public int getPps_weight() {
		return this.pps_weight;
	}

	public void setPps_weight(int pps_weight) {
		this.pps_weight = pps_weight;
	}

	public int getPps_season_goal() {
		return this.pps_season_goal;
	}

	public void setPps_season_goal(int pps_season_goal) {
		this.pps_season_goal = pps_season_goal;
	}

	public int getPps_season_assist() {
		return this.pps_season_assist;
	}

	public void setPps_season_assist(int pps_season_assist) {
		this.pps_season_assist = pps_season_assist;
	}

	public int getPps_season_save() {
		return this.pps_season_save;
	}

	public void setPps_season_save(int pps_season_save) {
		this.pps_season_save = pps_season_save;
	}

	public int getPps_season_game() {
		return this.pps_season_game;
	}

	public void setPps_season_game(int pps_season_game) {
		this.pps_season_game = pps_season_game;
	}

	public int getPps_season_card() {
		return this.pps_season_card;
	}

	public void setPps_season_card(int pps_season_card) {
		this.pps_season_card = pps_season_card;
	}

	public int getPps_season_foul() {
		return this.pps_season_foul;
	}

	public void setPps_season_foul(int pps_season_foul) {
		this.pps_season_foul = pps_season_foul;
	}

	@Override
	public String toString() {
		return "{" +
			" player_id='" + getPlayer_id() + "'" +
			", season_id='" + getSeason_id() + "'" +
			", pps_position='" + getPps_position() + "'" +
			", pps_height='" + getPps_height() + "'" +
			", pps_weight='" + getPps_weight() + "'" +
			", pps_season_goal='" + getPps_season_goal() + "'" +
			", pps_season_assist='" + getPps_season_assist() + "'" +
			", pps_season_save='" + getPps_season_save() + "'" +
			", pps_season_game='" + getPps_season_game() + "'" +
			", pps_season_card='" + getPps_season_card() + "'" +
			", pps_season_foul='" + getPps_season_foul() + "'" +
			"}";
	}

}

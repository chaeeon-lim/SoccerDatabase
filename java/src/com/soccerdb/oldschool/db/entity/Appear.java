//appear(player_id,game_id, season,start_time,end_time,in_game_position,goals,assist,save,foul,card,distance)

package com.soccerdb.oldschool.db.entity;

import java.util.Date;

public class Appear{

	private int player_id;
    private int game_id;
    private String season; //int???
    private Date start_time; 
    private Date end_time; 
    private String in_game_position; 
    private int goals; 
    private int assist; 
    private int save; 
    private int foul; 
    private int card; 
    private float distance; 

    public Appear() {
    }

    public Appear(int player_id, int game_id, String season, Date start_time, Date end_time, String in_game_position, int goals, int assist, int save, int foul, int card, float distance) {
    	this.player_id = player_id;
        this.game_id = game_id;
        this.season = season;
        this.start_time = start_time;
        this.end_time = end_time;
        this.in_game_position = in_game_position;
        this.goals = goals;
        this.assist = assist;
        this.save = save;
        this.foul = foul;
        this.card = card;
        this.distance = distance; 
    }
    
    public int getPlayer_id() {
		return player_id;
	}

	public void setPlayer_id(int player_id) {
		this.player_id = player_id;
	}

	public int getGame_id() {
		return game_id;
	}

	public void setGame_id(int game_id) {
		this.game_id = game_id;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public Date getStart_time() {
		return start_time;
	}

	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}

	public Date getEnd_time() {
		return end_time;
	}

	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}

	public String getIn_game_position() {
		return in_game_position;
	}

	public void setIn_game_position(String in_game_position) {
		this.in_game_position = in_game_position;
	}

	public int getGoals() {
		return goals;
	}

	public void setGoals(int goals) {
		this.goals = goals;
	}

	public int getAssist() {
		return assist;
	}

	public void setAssist(int assist) {
		this.assist = assist;
	}

	public int getSave() {
		return save;
	}

	public void setSave(int save) {
		this.save = save;
	}

	public int getFoul() {
		return foul;
	}

	public void setFoul(int foul) {
		this.foul = foul;
	}

	public int getCard() {
		return card;
	}

	public void setCard(int card) {
		this.card = card;
	}

	public float getDistance() {
		return distance;
	}

	public void setDistance(float distance) {
		this.distance = distance;
	}

    @Override
    public String toString() {
        return "{" +
            " player_id='" + getPlayer_id() + "'" +
            ", game_id='" + getGame_id() + "'" +
            ", season='" + getSeason() + "'" +
            ", start_time='" + getStart_time() + "'" +
            ", end_time='" + getEnd_time() + "'" +
            ", in_game_position='" + getIn_game_position() + "'" +
            ", goal='" + getGoals() + "'" +
            ", assist='" + getAssist() + "'" +
            ", save='" + getSave() + "'" +
            ", foul='" + getFoul() + "'" +
            ", card='" + getCard() + "'" +
            ", distance='" + getDistance() + "'" +
            "}";
    }
    //player_id,game_id, season,start_time,end_time,in_game_position,goals,assist,save,foul,card,distance
}


package com.soccerdb.oldschool.db.entity;

public class Match{
	private int game_id;
	private int club_id;
	private int season_id;
	/*
    private Game game_id;
    private Club club_id;
    private Season season_id;
    */
    public Match() {
    }

public Match(int game_id,int club_id,int season_id/*Game game_id,Club club_id,Season season_id*/) {
    	
    this.game_id=game_id;
	this.club_id=club_id;
	this.season_id=season_id;
}

public int getGame_id() {
	return game_id;
}

public void setGame_id(int game_id) {
	this.game_id = game_id;
}

public int getClub_id() {
	return club_id;
}

public void setClub_id(int club_id) {
	this.club_id = club_id;
}

public int getSeason_id() {
	return season_id;
}

public void setSeason_id(int season_id) {
	this.season_id = season_id;
}

@Override
public String toString() {
	return "Match [game_id=" + game_id + ", club_id=" + club_id + ", season_id=" + season_id + "]";
}


}
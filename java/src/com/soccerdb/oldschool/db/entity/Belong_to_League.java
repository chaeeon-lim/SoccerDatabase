package com.soccerdb.oldschool.db.entity;

public class Belong_to_League {

	private int league_id;
	private int club_id;


	public Belong_to_League() {
	}

	public Belong_to_League(int league_id, int club_id) {
		this.league_id = league_id;
		this.club_id = club_id;
	}

	public int getLeague_id() {
		return this.league_id;
	}

	public void setLeague_id(int league_id) {
		this.league_id = league_id;
	}

	public int getClub_id() {
		return this.club_id;
	}

	public void setClub_id(int club_id) {
		this.club_id = club_id;
	}


	@Override
	public String toString() {
		return "{" +
			" league_id='" + getLeague_id() + "'" +
			", club_id='" + getClub_id() + "'" +
			"}";
	}
		
}

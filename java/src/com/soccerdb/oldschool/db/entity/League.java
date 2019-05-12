package com.soccerdb.oldschool.db.entity;

public class League {
	private int league_id;
	private String league_name;


	public League() {
	}

	public League(int league_id, String league_name) {
		this.league_id = league_id;
		this.league_name = league_name;
	}

	public int getLeague_id() {
		return this.league_id;
	}

	public void setLeague_id(int league_id) {
		this.league_id = league_id;
	}

	public String getLeague_name() {
		return this.league_name;
	}

	public void setLeague_name(String league_name) {
		this.league_name = league_name;
	}
	
	@Override
	public String toString() {
		return "{" +
			" league_id='" + getLeague_id() + "'" +
			", league_name='" + getLeague_name() + "'" +
			"}";
	}

}

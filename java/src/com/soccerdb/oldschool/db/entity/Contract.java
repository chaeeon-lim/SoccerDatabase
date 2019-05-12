//contract(player_id,club_id,salary,year_contract)

package com.soccerdb.oldschool.db.entity;

//import java.util.Date;

public class Contract{
	private int player_id;
	private int club_id;
	private int season_id;
	private float salary;
	private int year_contract; 


	public Contract() {
	}
	
	public Contract(int player_id, int club_id, int season_id, float salary, int year_contract) {
		this.player_id = player_id; 
		this.club_id = club_id; 
		this.season_id = season_id; 
		this.salary = salary; 
		this.year_contract = year_contract; 
	  }
  
	public int getPlayer_id() {
		return player_id;
	}

	public void setPlayer_id(int player_id) {
		this.player_id = player_id;
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


	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getYear_contract() {
		return year_contract;
	}

	public void setYear_contract(int year_contract) {
		this.year_contract = year_contract;
	}
	
    @Override
    public String toString() {
        return "{" +
            " player_id='" + getPlayer_id() + "'" +
            ", club_id='" + getClub_id() + "'" +
            ", season_id='" + getSeason_id() +"'" +
            ", salary='" + getSalary() + "'" +
            ", year_contract='" + getYear_contract() + "'" +
            "}";
    }
//player_id,club_id,salary,year_contract
}
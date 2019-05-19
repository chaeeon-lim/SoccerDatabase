package com.soccerdb.oldschool.db.entity;

//import java.util.Date;
//club(club_id,fullname,ground,nickname,owner,chairman,manager,logo)

public class Club{
    private int club_id;
    private String club_fullname;
	private String club_ground;
    private String club_nickname;
    private String club_owner;
    private String club_chairman;
    private String club_manager;
    private String club_logo;

    public Club() {
    }

    public Club(int club_id, String club_fullname, String club_ground, String club_nickname, String club_owner, String club_chairman, String club_manager, String club_logo){
    	this.club_id = club_id;
        this.club_fullname = club_fullname; 
        this.club_ground = club_ground; 
        this.club_nickname = club_nickname; 
        this.club_owner = club_owner; 
        this.club_chairman = club_chairman; 
        this.club_manager = club_manager; 
        this.club_logo = club_logo; 
    }
    
    public int getClub_id() {
        return this.club_id;
    }

    public void setClub_id(int club_id) {
        this.club_id = club_id;
    }
    
    public String getClub_fullname() {
        return this.club_fullname;
    }

    public void setClub_fullname(String club_fullname) {
        this.club_fullname = club_fullname;
    }
    public String getClub_ground() {
		return club_ground;
	}

	public void setClub_ground(String club_ground) {
		this.club_ground = club_ground;
	}

	public String getClub_nickname() {
		return club_nickname;
	}

	public void setClub_nickname(String club_nickname) {
		this.club_nickname = club_nickname;
	}

	public String getClub_owner() {
		return club_owner;
	}

	public void setClub_owner(String club_owner) {
		this.club_owner = club_owner;
	}

	public String getClub_chairman() {
		return club_chairman;
	}

	public void setClub_chairman(String club_chairman) {
		this.club_chairman = club_chairman;
	}

	public String getClub_manager() {
		return club_manager;
	}

	public void setClub_manager(String club_manager) {
		this.club_manager = club_manager;
	}

	public String getClub_logo() {
		return club_logo;
	}

	public void setClub_logo(String club_logo) {
		this.club_logo = club_logo;
	}
	
    @Override
    public String toString() {
        return "{" +
            " club_id='" + getClub_id() + "'" +
            ", club_full_name='" + getClub_fullname() + "'" +
            ", club_groundname='" + getClub_ground() + "'" +
            ", club_nickname='" + getClub_nickname() + "'" +
            ", club_owner='" + getClub_owner() + "'" +
            ", club_chairman='" + getClub_chairman() + "'" +
            ", club_manager='" + getClub_manager() + "'" +
            ", club_logo='" + getClub_logo() + "'" +
            "}";
    }
    //fullname,ground,nickname,owner,chairman,manager,logo

}
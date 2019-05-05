package com.soccerdb.oldschool.db.entity;



public class Season{
    private int season_id;
    private int season_year;
    

    public Season() {
    }

    public Season(int season_id, int season_year) {
        this.season_id = season_id;
        this.season_year = season_year;
    }

    public int getSeason_id() {
        return this.season_id;
    }

    public void setSeason_id(int season_id) {
        this.season_id = season_id;
    }

    public int getSeason_year() {
        return this.season_year;
    }

    public void setSeason_year(int season_year) {
        this.season_year = season_year;
    }


    @Override
    public String toString() {
        return "{" +
            " season_id='" + getSeason_id() + "'" +
            ", season_year='" + getSeason_year() + "'" +
            "}";
    }
    
}
    
package com.soccerdb.oldschool.db.dao;
import com.soccerdb.oldschool.db.entity.Season;
import com.soccerdb.oldschool.db.source.GenericDAO;

public interface SeasonDAO extends GenericDAO<Season, Integer>{
    //TODO please give dditional methods for 'Player' entity.
	
	public int countAllSeason() throws Exception;
}
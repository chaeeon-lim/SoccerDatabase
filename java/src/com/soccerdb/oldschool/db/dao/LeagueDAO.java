package com.soccerdb.oldschool.db.dao;
import java.util.List;

import com.soccerdb.oldschool.db.entity.League;
import com.soccerdb.oldschool.db.source.GenericDAO;

public interface LeagueDAO extends GenericDAO<League, Integer>{
    //TODO please give aditional methods for 'League' entity.
	
	List<League> searchLeagueName(String league_name) throws Exception;
	int countAllLeague() throws Exception;
	
}
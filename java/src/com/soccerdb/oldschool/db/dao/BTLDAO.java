package com.soccerdb.oldschool.db.dao;
import java.util.List;

import com.soccerdb.oldschool.db.entity.Belong_to_League;
import com.soccerdb.oldschool.db.source.GenericDAO;

public interface BTLDAO extends GenericDAO<Belong_to_League, Integer>{
    //TODO please give aditional methods for 'Match' entity.
	public List<Belong_to_League> selectByLeagueAndClubId(Belong_to_League btl) throws Exception;
	public void deleteByBTL(Belong_to_League btl) throws Exception;
}
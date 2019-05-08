package com.soccerdb.oldschool.db.dao;


import java.util.List;

import com.soccerdb.oldschool.db.entity.Appear;
import com.soccerdb.oldschool.db.source.GenericDAO;

public interface AppearDAO extends GenericDAO<Appear, Integer>{
    //TODO please give additional methods for 'Appear' entity.
    
	public List<Appear> selectByPlayerId(int player_id) throws Exception;
	public List<Appear> selectByGameId(int game_id) throws Exception;
	
}
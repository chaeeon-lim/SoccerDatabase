package com.soccerdb.oldschool.db.dao;
import java.util.List;

import com.soccerdb.oldschool.db.entity.Player_per_Season;
import com.soccerdb.oldschool.db.source.GenericDAO;

public interface PPSDAO extends GenericDAO<Player_per_Season, Integer>{
    //TODO please give aditional methods for 'Match' entity.

	public Player_per_Season selectByPPS(Player_per_Season pps) throws Exception;
	public void deleteByPPS(Player_per_Season pps) throws Exception;
	public void updateByPPS(Player_per_Season pps) throws Exception;
}
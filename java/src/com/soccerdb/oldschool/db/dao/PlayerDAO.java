package com.soccerdb.oldschool.db.dao;
import java.util.Date;
import java.util.List;

import com.soccerdb.oldschool.db.entity.Player;
import com.soccerdb.oldschool.db.source.GenericDAO;

public interface PlayerDAO extends GenericDAO<Player, Integer>{
    //TODO please give additional methods for 'Player' entity.
	
	public List<Player> selectByNationality(String nationality) throws Exception;
	public List<Player> selectByLetterForName(String name) throws Exception;
	public List<Player> selectByBirthday(String birthday) throws Exception;
	
}
package com.soccerdb.oldschool.db.dao;


import java.util.List;

import com.soccerdb.oldschool.db.entity.Appear;
import com.soccerdb.oldschool.db.entity.Player_per_Season;
import com.soccerdb.oldschool.db.source.GenericDAO;

public interface AppearDAO extends GenericDAO<Appear, Integer>{
    //TODO please give additional methods for 'Appear' entity.
    
	public Appear selectByAppear(Appear appear) throws Exception;
	public void deleteByAppear(Appear appear) throws Exception;
	//public void updateByAppear(Appear appear) throws Exception;
	
}
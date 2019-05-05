package com.soccerdb.oldschool.db.dao;

import com.soccerdb.oldschool.db.entity.User;
import com.soccerdb.oldschool.db.source.GenericDAO;

public interface UserDAO extends GenericDAO<User, Integer>{
	
	public User selectByAccount(String name) throws Exception;

}

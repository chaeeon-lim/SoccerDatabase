package com.soccerdb.oldschool.db.dao;

import java.util.List;

import com.soccerdb.oldschool.db.entity.Club;
import com.soccerdb.oldschool.db.source.ImplAbstractDAO;

public class ImplClubDAO extends ImplAbstractDAO<Club, Integer> implements ClubDAO {
	public ImplClubDAO() {
		super();
		namespace = "com.soccerdb.oldschool.db.dao.ClubDAO";
	}

}

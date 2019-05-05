package com.soccerdb.oldschool.db.dao;

import com.soccerdb.oldschool.db.entity.Match;
import com.soccerdb.oldschool.db.source.ImplAbstractDAO;

public class ImplMatchDAO extends ImplAbstractDAO<Match, Integer> implements MatchDAO{

	public ImplMatchDAO() {
		super();
		namespace = "com.soccerdb.oldschool.db.dao.MatchDAO";
	}
}

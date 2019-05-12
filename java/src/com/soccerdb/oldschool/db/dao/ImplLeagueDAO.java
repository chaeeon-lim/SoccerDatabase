package com.soccerdb.oldschool.db.dao;

import com.soccerdb.oldschool.db.entity.League;
import com.soccerdb.oldschool.db.source.ImplAbstractDAO;

public class ImplLeagueDAO extends ImplAbstractDAO<League, Integer> implements LeagueDAO{

	public ImplLeagueDAO() {
		super();
		namespace = "com.soccerdb.oldschool.db.dao.LeagueDAO";
	}
}

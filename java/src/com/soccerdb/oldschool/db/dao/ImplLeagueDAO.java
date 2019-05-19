package com.soccerdb.oldschool.db.dao;

import java.util.List;

import com.soccerdb.oldschool.db.entity.League;
import com.soccerdb.oldschool.db.source.ImplAbstractDAO;

public class ImplLeagueDAO extends ImplAbstractDAO<League, Integer> implements LeagueDAO{

	public ImplLeagueDAO() {
		super();
		namespace = "com.soccerdb.oldschool.db.dao.LeagueDAO";
	}

	@Override
	public List<League> searchLeagueName(String league_name) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchLeagueName", league_name);
		}finally {
			session.close();
		}
	}

	@Override
	public int countAllLeague() throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countAllLeague");
		}finally {
			session.close();
		}	}
}

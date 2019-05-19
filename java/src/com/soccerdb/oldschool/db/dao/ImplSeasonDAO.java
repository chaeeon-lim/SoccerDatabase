package com.soccerdb.oldschool.db.dao;

import com.soccerdb.oldschool.db.entity.Season;
import com.soccerdb.oldschool.db.source.ImplAbstractDAO;

public class ImplSeasonDAO extends ImplAbstractDAO<Season, Integer> implements SeasonDAO{

	public ImplSeasonDAO() {
		super();
		namespace = "com.soccerdb.oldschool.db.dao.SeasonDAO";
	}

	@Override
	public int countAllSeason() throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countAllSeason");
		}finally {
			session.close();
		}
	}
}

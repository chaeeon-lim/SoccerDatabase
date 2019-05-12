package com.soccerdb.oldschool.db.dao;

import java.util.List;

import com.soccerdb.oldschool.db.entity.Belong_to_League;
import com.soccerdb.oldschool.db.source.ImplAbstractDAO;

public class ImplBTLDAO extends ImplAbstractDAO<Belong_to_League, Integer> implements BTLDAO {
	public ImplBTLDAO() {
		super();
		namespace = "com.soccerdb.oldschool.db.dao.BTLDAO";
	}

	@Override
	public List<Belong_to_League> selectByLeagueAndClubId(Belong_to_League btl) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByNationality", btl);
		}finally {
			session.close();
		}
	}

	@Override
	public void deleteByBTL(Belong_to_League btl) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			session.delete(namespace + ".deleteByBTL", btl);
		}finally {
			session.close();
		}
	}
	
	
}

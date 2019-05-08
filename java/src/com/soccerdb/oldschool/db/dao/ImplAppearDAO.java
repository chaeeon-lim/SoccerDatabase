package com.soccerdb.oldschool.db.dao;

import java.util.List;

import com.soccerdb.oldschool.db.entity.Appear;
import com.soccerdb.oldschool.db.source.ImplAbstractDAO;

public class ImplAppearDAO extends ImplAbstractDAO<Appear, Integer> implements AppearDAO {
	public ImplAppearDAO() {
		super();
		namespace = "com.soccerdb.oldschool.db.dao.AppearDAO";
	}

	@Override
	public List<Appear> selectByPlayerId(int player_id) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByPlayerId", player_id);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Appear> selectByGameId(int game_id) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByGameId", game_id);
		}finally {
			session.close();
		}
	}
	
}

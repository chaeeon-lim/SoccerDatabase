package com.soccerdb.oldschool.db.dao;

import java.util.List;

import com.soccerdb.oldschool.db.entity.Match;
import com.soccerdb.oldschool.db.source.ImplAbstractDAO;

public class ImplMatchDAO extends ImplAbstractDAO<Match, Integer> implements MatchDAO{

	public ImplMatchDAO() {
		super();
		namespace = "com.soccerdb.oldschool.db.dao.MatchDAO";
	}

	@Override
	public List<Match> selectByGameId(int game_id) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectById", game_id);
		}finally {
			session.close();
		}
	}
	@Override
	public List<Match> selectByClubId(int club_id) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectById",club_id);
		}finally {
			session.close();
		}
	}
	@Override
	public List<Match> selectBySeasonId(int season_id) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectById",season_id);
		}finally {
			session.close();
		}
	}
	@Override
	public void deleteMatch(Match match) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			session.delete(namespace + ".deleteMatch", match);
		}finally {
			session.close();
		}
	}
}

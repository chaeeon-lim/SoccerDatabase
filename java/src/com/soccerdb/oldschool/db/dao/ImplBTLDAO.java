package com.soccerdb.oldschool.db.dao;

import java.util.List;

import com.soccerdb.oldschool.db.entity.Appear;
import com.soccerdb.oldschool.db.entity.Belong_to_League;
import com.soccerdb.oldschool.db.source.ImplAbstractDAO;

public class ImplBTLDAO extends ImplAbstractDAO<Belong_to_League, Integer> implements BTLDAO {
	public ImplBTLDAO() {
		super();
		namespace = "com.soccerdb.oldschool.db.dao.BTLDAO";
	}

	@Override
	public List<Belong_to_League> selectByLeagueAndClubId(Belong_to_League btl) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByNationality", btl);
		}finally {
			session.close();
		}
	}

	@Override
	public void deleteByBTL(Belong_to_League btl) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			session.delete(namespace + ".deleteByBTL", btl);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Belong_to_League> selectByLeagueId(int league_id) throws Exception {
		// TODO Auto-generated method stub
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByLeagueId", league_id);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Belong_to_League> selectByClubId(int club_id) throws Exception {
		// TODO Auto-generated method stub
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByClubId", club_id);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Belong_to_League> orderByLeagueId() throws Exception {
		// TODO Auto-generated method stub
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".orderByLeagueId");
		}finally {
			session.close();
		}
	}

	@Override
	public List<Belong_to_League> orderByClubId() throws Exception {
		// TODO Auto-generated method stub
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".orderByClubId");
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Belong_to_League> orderByLeagueIdDESC() throws Exception {
		// TODO Auto-generated method stub
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".orderByLeagueIdDESC");
		}finally {
			session.close();
		}
	}

	@Override
	public List<Belong_to_League> orderByClubIdDESC() throws Exception {
		// TODO Auto-generated method stub
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".orderByClubIdDESC");
		}finally {
			session.close();
		}
	}	
}

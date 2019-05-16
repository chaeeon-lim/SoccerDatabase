package com.soccerdb.oldschool.db.dao;

import java.util.List;
import java.util.Map;
import java.util.Date;
import java.util.HashMap;

import com.soccerdb.oldschool.db.entity.Appear;
import com.soccerdb.oldschool.db.source.ImplAbstractDAO;

public class ImplAppearDAO extends ImplAbstractDAO<Appear, Integer> implements AppearDAO {
	public ImplAppearDAO() {
		super();
		namespace = "com.soccerdb.oldschool.db.dao.AppearDAO";
	}

	@Override
	public Appear selectByAppear(Appear appear) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".selectByAppear", appear);
		}finally {
			session.close();
		}
	}

	@Override
	public void deleteByAppear(Appear appear) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			session.delete(namespace + ".deleteByAppear", appear);
		}finally {
			session.close();
		}
		
	}
	
	@Override
	public List<Appear> selectByPlayerId(int player_id) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByPlayerId", player_id);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Appear> selectByGameId(int game_id) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByGameId", game_id);
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Appear> selectBySeasonId(int season_id) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectBySeasonId", season_id);
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Appear> selectByStartTimeBetween(Date time1, Date time2) throws Exception {
		try {
			Map<String, Object> params = new HashMap<String, Object>(); 
			params.put("time1", time1); 
			params.put("time2", time2);
			System.out.println(params); 
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByStartTimeBetween", params);
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Appear> selectByEndTimeBetween(Date time1, Date time2) throws Exception {
		try {
			Map<String, Object> params = new HashMap<String, Object>(); 
			params.put("time1", time1); 
			params.put("time2", time2);
			System.out.println(params); 
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByEndTimeBetween", params);
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Appear> selectByInGamePosition(String in_game_position) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByInGamePosition", in_game_position);
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Appear> selectByGoalsMoreThan(int goals) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByGoalsMoreThan", goals);
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Appear> selectByAssistMoreThan(int assist) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByAssistMoreThan", assist);
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Appear> selectBySaveMoreThan(int save) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectBySaveMoreThan", save);
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Appear> selectByFoulMoreThan(int foul) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByFoulMoreThan", foul);
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Appear> selectByCardMoreThan(int card) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByCardMoreThan", card);
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Appear> selectByDistanceMoreThan(float distance) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByDistanceMoreThan", distance);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Appear> orderByPlayerId() throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".orderByPlayerId");
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Appear> orderByGameId() throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".orderByGameId");
		}finally {
			session.close();
		}
	}

	@Override
	public List<Appear> orderBySeasonId() throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".orderBySeasonId");
		}finally {
			session.close();
		}
	}

	@Override
	public List<Appear> orderByStartTime() throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".orderByStartTime");
		}finally {
			session.close();
		}
	}

	@Override
	public List<Appear> orderByEndTime() throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".orderByEndTime");
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Appear> orderByGoals() throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".orderByGoals");
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Appear> orderByAssist() throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".orderByAssist");
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Appear> orderBySave() throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".orderBySave");
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Appear> orderByFoul() throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".orderByFoul");
		}finally {
			session.close();
		}
	}

	@Override
	public List<Appear> orderByCard() throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".orderByCard");
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Appear> orderByDistance() throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".orderByDistance");
		}finally {
			session.close();
		}
	}
	
}

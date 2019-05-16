package com.soccerdb.oldschool.db.dao;

import java.util.Date;
import java.util.List;

import com.soccerdb.oldschool.db.entity.Game;
import com.soccerdb.oldschool.db.source.ImplAbstractDAO;

public class ImplGameDAO extends ImplAbstractDAO<Game, Integer> implements GameDAO{

	public ImplGameDAO() {
		super();
		namespace = "com.soccerdb.oldschool.db.dao.GameDAO";
	}
	@Override
	public List<Game> selectById(String game_id) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectById", game_id);
		}finally {
			session.close();
		}
	}
	@Override
	public List<Game> selectByGameTime(Date game_time) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByTime", game_time);
		}finally {
			session.close();
		}
	}
	@Override
	public List<Game> selectByPlace(String place) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByPlace", place);
		}finally {
			session.close();
		}
	}
	@Override
	public List<Game> selectByWeather(String weather) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByWeather", weather);
		}finally {
			session.close();
		}
	}
	@Override
	public List<Game> selectByExtended(boolean is_extended) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByExtended", is_extended);
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Game> selectByShootOut(boolean is_shoot_out) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByShootOut", is_shoot_out);
		}finally {
			session.close();
		}
	}
	@Override
	public List<Game> selectByGameType(String type) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			
			return session.selectList(namespace + ".selectByType", type);
		}finally {
			session.close();
		}
	}
	@Override
	public void updateGame(Game game) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			session.update(namespace + ".updateGame", game);
		}finally {
			session.close();
		}
		
	}
	@Override
	public void deleteGame(Game game) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			session.delete(namespace + ".deleteGame", game);
		}finally {
			session.close();
		}
	}
	
}

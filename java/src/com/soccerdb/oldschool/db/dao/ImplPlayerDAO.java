package com.soccerdb.oldschool.db.dao;

import java.util.Date;
import java.util.List;

import com.soccerdb.oldschool.db.entity.Player;
import com.soccerdb.oldschool.db.source.ImplAbstractDAO;

public class ImplPlayerDAO extends ImplAbstractDAO<Player, Integer> implements PlayerDAO{

	public ImplPlayerDAO() {
		super();
		namespace = "com.soccerdb.oldschool.db.dao.PlayerDAO";
	}

	@Override
	public List<Player> selectByNationality(String nationality) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByNationality", nationality);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player> selectByLetterForName(String name) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByLetterForName", name);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Player> selectByBirthday(String birthday) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByBirthday", birthday);
		}finally {
			session.close();
		}
	}

}

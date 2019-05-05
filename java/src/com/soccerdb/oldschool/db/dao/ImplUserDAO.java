package com.soccerdb.oldschool.db.dao;

import com.soccerdb.oldschool.db.entity.User;
import com.soccerdb.oldschool.db.source.ImplAbstractDAO;

public class ImplUserDAO extends ImplAbstractDAO<User, Integer> implements UserDAO{
	public ImplUserDAO() {
		super();
		namespace = "com.soccerdb.oldschool.db.dao.UserDAO";
	}

	@Override
	public User selectByAccount(String name) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".selectByAccount", name);
		}finally {
			session.close();
		}
	}
}

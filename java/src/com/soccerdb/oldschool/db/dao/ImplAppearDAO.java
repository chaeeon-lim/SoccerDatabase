package com.soccerdb.oldschool.db.dao;

import java.util.List;

import com.soccerdb.oldschool.db.entity.Appear;
import com.soccerdb.oldschool.db.entity.Player_per_Season;
import com.soccerdb.oldschool.db.source.ImplAbstractDAO;

public class ImplAppearDAO extends ImplAbstractDAO<Appear, Integer> implements AppearDAO {
	public ImplAppearDAO() {
		super();
		namespace = "com.soccerdb.oldschool.db.dao.AppearDAO";
	}

	@Override
	public Appear selectByAppear(Appear appear) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".selectByAppear", appear);
		}finally {
			session.close();
		}
	}

	@Override
	public void deleteByAppear(Appear appear) throws Exception {
		// TODO Auto-generated method stub
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			session.delete(namespace + ".deleteByAppear", appear);
		}finally {
			session.close();
		}
		
	}
	
}

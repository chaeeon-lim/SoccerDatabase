package com.soccerdb.oldschool.db.dao;

import com.soccerdb.oldschool.db.entity.Player_per_Season;
import com.soccerdb.oldschool.db.source.ImplAbstractDAO;

public class ImplPPSDAO extends ImplAbstractDAO<Player_per_Season, Integer> implements PPSDAO{

	public ImplPPSDAO() {
		super();
		namespace = "com.soccerdb.oldschool.db.dao.PPSDAO";
	}

	@Override
	public Player_per_Season selectByPPS(Player_per_Season pps) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".selectByPPS", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public void deleteByPPS(Player_per_Season pps) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			session.delete(namespace + ".deleteByPPS", pps);
		}finally {
			session.close();
		}
	}

	@Override
	public void updateByPPS(Player_per_Season pps) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			session.update(namespace + ".updateByPPS", pps);
		}finally {
			session.close();
		}
		
	}
}

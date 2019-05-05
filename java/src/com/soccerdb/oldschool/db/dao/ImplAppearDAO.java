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
	public void insert(Appear entity) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public Appear selectById(Integer key) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Appear> selectAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Appear entity) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer key) throws Exception {
		// TODO Auto-generated method stub

	}

}

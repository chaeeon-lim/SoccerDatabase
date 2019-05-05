package com.soccerdb.oldschool.db.dao;

import java.util.List;

import com.soccerdb.oldschool.db.entity.Club;
import com.soccerdb.oldschool.db.source.ImplAbstractDAO;

public class ImplClubDAO extends ImplAbstractDAO<Club, Integer> implements ClubDAO {
	public ImplClubDAO() {
		super();
		namespace = "com.soccerdb.oldschool.db.dao.ClubDAO";
	}
	@Override
	public void insert(Club entity) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public Club selectById(Integer key) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Club> selectAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Club entity) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer key) throws Exception {
		// TODO Auto-generated method stub

	}

}

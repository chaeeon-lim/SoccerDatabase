package com.soccerdb.oldschool.db.dao;

import java.util.List;

import com.soccerdb.oldschool.db.entity.Contract;
import com.soccerdb.oldschool.db.source.ImplAbstractDAO;

public class ImplContractDAO extends ImplAbstractDAO<Contract, Integer> implements ContractDAO {
	public ImplContractDAO() {
		super();
		namespace = "com.soccerdb.oldschool.db.dao.ContractDAO";
	}
	@Override
	public void insert(Contract entity) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public Contract selectById(Integer key) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contract> selectAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Contract entity) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer key) throws Exception {
		// TODO Auto-generated method stub

	}

}

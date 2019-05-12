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
	public Contract selectByContract(Contract contract) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".selectByContract", contract);
		}finally {
			session.close();
		}
	}

	@Override
	public void deleteByContract(Contract contract) throws Exception {
		// TODO Auto-generated method stub
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			session.delete(namespace + ".deleteByContract", contract);
		}finally {
			session.close();
		}
		
	}

}

package com.soccerdb.oldschool.db.dao;

import java.util.List;

import com.soccerdb.oldschool.db.entity.Club;
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
	
	@Override
	public List<Contract> selectByPlayerId(int player_id) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByPlayerId", player_id);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Contract> selectByClubId(int club_id) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByClubId", club_id);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Contract> selectBySalaryOverThan(int salary) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectBySalaryOverThan", salary);
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Contract> selectByDurationContractOverThan(int duration_contract) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByDurationContractOverThan", duration_contract);
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Contract> orderByPlayerId() throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".orderByPlayerId");
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Contract> orderByClubId() throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".orderByClubId");
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Contract> orderBySalary() throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".orderBySalary");
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Contract> orderByDurationContract() throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".orderByDurationContract");
		}finally {
			session.close();
		}
	}
}

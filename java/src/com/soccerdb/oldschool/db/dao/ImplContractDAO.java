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
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".selectByContract", contract);
		}finally {
			session.close();
		}
	}

	@Override
	public void deleteByContract(Contract contract) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			session.delete(namespace + ".deleteByContract", contract);
		}finally {
			session.close();
		}
		
	}
	
	@Override
	public List<Contract> selectByPlayerId(int player_id) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByPlayerId", player_id);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Contract> selectByClubId(int club_id) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByClubId", club_id);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Contract> selectBySeasonId(int season_id) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectBySeasonId", season_id);
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Contract> selectBySalaryOverThan(float salary) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectBySalaryOverThan", salary);
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Contract> selectByDurationContractOverThan(int duration_contract) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByDurationContractOverThan", duration_contract);
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Contract> orderByPlayerId() throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".orderByPlayerId");
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Contract> orderByClubId() throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".orderByClubId");
		}finally {
			session.close();
		}
	}

	@Override
	public List<Contract> orderBySeasonId() throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".orderBySeasonId");
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Contract> orderBySalary() throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".orderBySalary");
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Contract> orderByDurationContract() throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".orderByDurationContract");
		}finally {
			session.close();
		}
	}
	@Override
	public List<Contract> orderByPlayerIdDESC() throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".orderByPlayerIdDESC");
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Contract> orderByClubIdDESC() throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".orderByClubIdDESC");
		}finally {
			session.close();
		}
	}

	@Override
	public List<Contract> orderBySeasonIdDESC() throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".orderBySeasonIdDESC");
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Contract> orderBySalaryDESC() throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".orderBySalaryDESC");
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Contract> orderByDurationContractDESC() throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".orderByDurationContractDESC");
		}finally {
			session.close();
		}
	}
}

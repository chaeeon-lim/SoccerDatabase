package com.soccerdb.oldschool.db.dao;

import com.soccerdb.oldschool.db.entity.Contract;
import com.soccerdb.oldschool.db.source.GenericDAO;

public interface ContractDAO extends GenericDAO<Contract, Integer>{
	public Contract selectByContract(Contract contract) throws Exception;
	public void deleteByContract(Contract contract) throws Exception;
	//public void updateByContract(Contract contract) throws Exception;
}

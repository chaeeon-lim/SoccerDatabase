package com.soccerdb.oldschool.db.dao;

import java.util.List;

import com.soccerdb.oldschool.db.entity.Contract;
import com.soccerdb.oldschool.db.source.ImplAbstractDAO;

public class ImplContractDAO extends ImplAbstractDAO<Contract, Integer> implements ContractDAO {
	public ImplContractDAO() {
		super();
		namespace = "com.soccerdb.oldschool.db.dao.ContractDAO";
	}
	
}

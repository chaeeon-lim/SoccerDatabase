package com.soccerdb.oldschool.db.dao;

import java.util.List;

import com.soccerdb.oldschool.db.entity.Contract;
import com.soccerdb.oldschool.db.source.GenericDAO;

public interface ContractDAO extends GenericDAO<Contract, Integer>{
	public Contract selectByContract(Contract contract) throws Exception;
	public void deleteByContract(Contract contract) throws Exception;
	
	public List<Contract> selectByPlayerId(int player_id) throws Exception;
	public List<Contract> selectByClubId(int club_id) throws Exception;
	public List<Contract> selectBySeasonId(int club_id) throws Exception;
	public List<Contract> selectBySalaryOverThan(float salary) throws Exception; 
	public List<Contract> selectByDurationContractOverThan(int duration_contract) throws Exception; 
	
	public List<Contract> orderByPlayerId() throws Exception; 
	public List<Contract> orderByClubId() throws Exception; 
	public List<Contract> orderBySeasonId() throws Exception; 
	public List<Contract> orderBySalary() throws Exception; 
	public List<Contract> orderByDurationContract() throws Exception; 
	
	public List<Contract> orderByPlayerIdDESC() throws Exception; 
	public List<Contract> orderByClubIdDESC() throws Exception; 
	public List<Contract> orderBySeasonIdDESC() throws Exception; 
	public List<Contract> orderBySalaryDESC() throws Exception; 
	public List<Contract> orderByDurationContractDESC() throws Exception; 
}

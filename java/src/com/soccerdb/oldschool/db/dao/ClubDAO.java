package com.soccerdb.oldschool.db.dao;


import java.util.List;

import com.soccerdb.oldschool.db.entity.Club;
import com.soccerdb.oldschool.db.source.GenericDAO;

public interface ClubDAO extends GenericDAO<Club, Integer>{
	public List<Club> selectByFullname(String fullname) throws Exception;
	public List<Club> selectByGround(String ground) throws Exception; 
	public List<Club> selectByNickname(String nickname) throws Exception; 
	public List<Club> selectByOwner(String owner) throws Exception; 
	public List<Club> selectByChairman(String chairman) throws Exception; 
	public List<Club> selectByManager(String manager) throws Exception; 
	
	public List<Club> orderByFullname() throws Exception; 
	public List<Club> orderByGround() throws Exception; 
	public List<Club> orderByNickname() throws Exception; 
	public List<Club> orderByOwner() throws Exception; 
	public List<Club> orderByChairman() throws Exception; 
	public List<Club> orderByManager() throws Exception; 
	
	public List<Club> orderByFullnameDESC() throws Exception; 
	public List<Club> orderByGroundDESC() throws Exception; 
	public List<Club> orderByNicknameDESC() throws Exception; 
	public List<Club> orderByOwnerDESC() throws Exception; 
	public List<Club> orderByChairmanDESC() throws Exception; 
	public List<Club> orderByManagerDESC() throws Exception; 
}

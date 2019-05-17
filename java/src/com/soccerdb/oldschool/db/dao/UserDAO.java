package com.soccerdb.oldschool.db.dao;

import java.util.List;

import com.soccerdb.oldschool.db.entity.User;
import com.soccerdb.oldschool.db.source.GenericDAO;

public interface UserDAO extends GenericDAO<User, Integer>{
	
	public User searchUserAccount(String user_account) throws Exception;
	public User searchUserName (String user_name) throws Exception;
	public User searchUserEmail (String user_email) throws Exception;
	public List<User> searchUsersOrderByAccount() throws Exception;
	public List<User> searchUsersOrderByName() throws Exception;
	public List<User> searchUsersOrderByEmail() throws Exception;
	public List<User> searchUsersOrderByAccountDesc() throws Exception;
	public List<User> searchUsersOrderByNameDesc() throws Exception;
	public List<User> searchUsersOrderByEmailDesc() throws Exception;
	public int countAllUsers()throws Exception;
	
	
}

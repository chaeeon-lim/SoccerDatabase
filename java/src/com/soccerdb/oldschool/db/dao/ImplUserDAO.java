package com.soccerdb.oldschool.db.dao;

import java.util.List;

import com.soccerdb.oldschool.db.entity.User;
import com.soccerdb.oldschool.db.source.ImplAbstractDAO;

public class ImplUserDAO extends ImplAbstractDAO<User, Integer> implements UserDAO{
	public ImplUserDAO() {
		super();
		namespace = "com.soccerdb.oldschool.db.dao.UserDAO";
	}

	@Override
	public User searchUserAccount(String user_account) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".searchUserAccount", user_account);
		}finally {
			session.close();
		}
	}

	@Override
	public User searchUserName(String user_name) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".searchUserName", user_name);
		}finally {
			session.close();
		}
	}

	@Override
	public User searchUserEmail(String user_email) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".searchUserEmail", user_email);
		}finally {
			session.close();
		}
	}

	@Override
	public List<User> searchUsersOrderByAccount() throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchUsersOrderByAccount");
		}finally {
			session.close();
		}
	}

	@Override
	public List<User> searchUsersOrderByName() throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchUsersOrderByName");
		}finally {
			session.close();
		}
	}

	@Override
	public List<User> searchUsersOrderByEmail() throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchUsersOrderByEmail");
		}finally {
			session.close();
		}
	}

	@Override
	public int countAllUsers() throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".countAllUsers");
		}finally {
			session.close();
		}
	}

	@Override
	public List<User> searchUsersOrderByAccountDesc() throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchUsersOrderByAccountDesc");
		}finally {
			session.close();
		}
	}

	@Override
	public List<User> searchUsersOrderByNameDesc() throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchUsersOrderByNameDesc");
		}finally {
			session.close();
		}
	}

	@Override
	public List<User> searchUsersOrderByEmailDesc() throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".searchUsersOrderByEmailDesc");
		}finally {
			session.close();
		}
	}
}

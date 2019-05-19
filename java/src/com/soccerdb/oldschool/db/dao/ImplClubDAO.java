package com.soccerdb.oldschool.db.dao;

import java.util.List;

import com.soccerdb.oldschool.db.entity.Club;
import com.soccerdb.oldschool.db.source.ImplAbstractDAO;

public class ImplClubDAO extends ImplAbstractDAO<Club, Integer> implements ClubDAO {
	public ImplClubDAO() {
		super();
		namespace = "com.soccerdb.oldschool.db.dao.ClubDAO";
	}
	@Override
	public List<Club> selectByFullname(String fullname) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByFullname", fullname);
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Club> selectByGround(String ground) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByGround", ground);
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Club> selectByNickname(String nickname) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByNickname", nickname);
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Club> selectByOwner(String owner) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByOwner", owner);
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Club> selectByChairman(String chairman) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByChairman", chairman);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Club> selectByManager(String manager) throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByManager", manager);
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Club> orderByFullname() throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".orderByFullname");
		}finally {
			session.close();
		}
	}

	@Override
	public List<Club> orderByGround() throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".orderByGround");
		}finally {
			session.close();
		}
	}

	@Override
	public List<Club> orderByNickname() throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".orderByNickname");
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Club> orderByOwner() throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".orderByOwner");
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Club> orderByChairman() throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".orderByChairman");
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Club> orderByManager() throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".orderByManager");
		}finally {
			session.close();
		}
	}
	@Override
	public List<Club> orderByFullnameDESC() throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".orderByFullnameDESC");
		}finally {
			session.close();
		}
	}

	@Override
	public List<Club> orderByGroundDESC() throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".orderByGroundDESC");
		}finally {
			session.close();
		}
	}

	@Override
	public List<Club> orderByNicknameDESC() throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".orderByNicknameDESC");
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Club> orderByOwnerDESC() throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".orderByOwnerDESC");
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Club> orderByChairmanDESC() throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".orderByChairmanDESC");
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Club> orderByManagerDESC() throws Exception {
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".orderByManagerDESC");
		}finally {
			session.close();
		}
	}
}

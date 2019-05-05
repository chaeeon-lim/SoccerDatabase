package com.soccerdb.oldschool.db.source;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class ImplAbstractDAO<Entity, Key> extends SessionFactory implements GenericDAO<Entity, Key>{

	protected SqlSession session;
	protected String namespace;
	
	@Override
	public void insert(Entity entity) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session.insert(namespace + ".insert", entity);
		}finally {
			session.close();
        }
    }
    
	@Override
	public Entity selectById(Key key) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectOne(namespace + ".selectById", key);
		}finally {
			session.close();
		}
	}
	
	@Override
	public List<Entity> selectAll() throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectAll");
		}finally {
			session.close();
		}
	}
	@Override
	public void update(Entity entity) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			session.update(namespace + ".update", entity);
		}finally {
			session.close();
		}
	}
	@Override
	public void delete(Key key) throws Exception {
		session = getSqlSessionFactory().openSession();
		try {
			session = getSqlSessionFactory().openSession();
			session.delete(namespace + ".delete", key);
		}finally {
			session.close();
		}
	}
}

package com.soccerdb.oldschool.db.source;

import java.util.List;

public interface GenericDAO<Entity, Key> {

	public void insert(Entity entity) throws Exception;
	public Entity selectById(Key key) throws Exception;
	public List<Entity> selectAll() throws Exception;
	public void update(Entity entity) throws Exception;
	public void delete(Key key) throws Exception;
}

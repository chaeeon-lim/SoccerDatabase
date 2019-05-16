package com.soccerdb.oldschool.control;

public interface ControllerInterface<Entity> {

	void init();
	String selectAll();
	String search(String attribute, String condition);
	String order(String attribute, String condition, String logic);
	
	int insert(Entity entity);
	void update(Entity entity);
	void delete(Entity entity);
}

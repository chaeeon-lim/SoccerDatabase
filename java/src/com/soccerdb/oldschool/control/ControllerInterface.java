package com.soccerdb.oldschool.control;

public interface ControllerInterface<Entity> {

	void init();
	String selectAll();
	String search(String attribute, String condition);
	String order(String attribute, String condition);
	int count(String attribute, String condition);
	
}

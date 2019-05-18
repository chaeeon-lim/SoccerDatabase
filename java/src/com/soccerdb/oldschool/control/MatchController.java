package com.soccerdb.oldschool.control;

import java.util.Iterator;
import java.util.List;

import com.soccerdb.oldschool.db.dao.ImplMatchDAO;
import com.soccerdb.oldschool.db.dao.MatchDAO;
import com.soccerdb.oldschool.db.entity.Match;

public class MatchController implements ControllerInterface<Match>{
	
	private static MatchController controller;
	
	static {
		try {
			if(controller == null) {
				controller = new MatchController();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	Match match = new Match();
	MatchDAO matchDAO = new ImplMatchDAO();
	List<Match> matchList;
	Iterator<Match> itr;
	int count;
	String temp = "";
	String column_name = "";
	@Override
	public void init() {
		temp ="";
		
	}
	@Override
	public String selectAll() {
		init();
		
		try {
			matchList = matchDAO.selectAll();
			getData();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return temp;
	}
	@Override
	public String search(String attribute, String condition) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String order(String attribute, String condition) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int count(String attribute, String condition) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	void getData() {
		itr = matchList.iterator();
		temp = column_name;
		while(itr.hasNext()) {
			match = itr.next();
			temp += match.toString() +"\n";
		}
	}
	
	public static MatchController getController() {
		return controller;
	}

}

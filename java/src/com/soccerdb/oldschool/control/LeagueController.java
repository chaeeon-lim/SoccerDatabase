package com.soccerdb.oldschool.control;

import java.util.Iterator;
import java.util.List;

import com.soccerdb.oldschool.db.dao.ImplLeagueDAO;
import com.soccerdb.oldschool.db.dao.LeagueDAO;
import com.soccerdb.oldschool.db.entity.League;

public class LeagueController implements ControllerInterface<League> {
	
	private static LeagueController controller;
	
	static {
		try {
			if(controller == null) controller = new LeagueController();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	League league;
	LeagueDAO leagueDAO = new ImplLeagueDAO();
	List<League> leagueList;
	Iterator<League> itr;
	int count;
	String temp = "";
	String column_name ="";

	@Override
	public void init() {
		temp = "";
		
	}

	@Override
	public String selectAll() {
		init();
		try {
			leagueList = leagueDAO.selectAll();
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
		itr = leagueList.iterator();
		temp = column_name;
		while(itr.hasNext()) {
			league = itr.next();
			temp += league.toString() + "\n" ;
		}
	}
	
	public static LeagueController getController() {
		return controller;
	}

}

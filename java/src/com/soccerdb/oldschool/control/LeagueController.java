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
	String column_name ="Name\n" + "----\n";

	@Override
	public void init() {
		temp = column_name;
		
	}

	@Override
	public String selectAll() {
		init();
		try {
			leagueList = leagueDAO.selectAll();
			count = count("all","anything");
			getData();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return temp;
	}

	@Override
	public String search(String attribute, String condition) {
		init();
		if(!condition.isEmpty()) {
			try {
				leagueList = leagueDAO.searchLeagueName("%"+condition+"%");
				count = count(attribute, condition);
			}catch(Exception e) {
				e.printStackTrace();
			} finally {
				getData();
			}
		}
		// TODO Auto-generated method stub
		if(temp.equals(column_name) || temp.isEmpty()) temp += "\n\n\n\t\t\t There is no data for " + condition + " at " + "in League Table"  + " \n";
		return temp;
	}

	@Override
	public String order(String attribute, String condition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count(String attribute, String condition) {
		// TODO Auto-generated method stub
		try {
			count = leagueDAO.countAllLeague();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	void getData() {
		itr = leagueList.iterator();
		while(itr.hasNext()) {
			league = itr.next();
			temp += league.getLeague_name() + "\n" ;
		}
		temp += "\n\n" + "Total : \t" + count + " Leagues\n";

	}
	
	public static LeagueController getController() {
		return controller;
	}

}

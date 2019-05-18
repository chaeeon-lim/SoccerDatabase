package com.soccerdb.oldschool.control;

import java.util.Iterator;
import java.util.List;

import com.soccerdb.oldschool.db.dao.BTLDAO;
import com.soccerdb.oldschool.db.dao.ClubDAO;
import com.soccerdb.oldschool.db.dao.ImplBTLDAO;
import com.soccerdb.oldschool.db.dao.ImplClubDAO;
import com.soccerdb.oldschool.db.dao.ImplLeagueDAO;
import com.soccerdb.oldschool.db.dao.LeagueDAO;
import com.soccerdb.oldschool.db.entity.Belong_to_League;
import com.soccerdb.oldschool.db.entity.Club;
import com.soccerdb.oldschool.db.entity.League;

public class BTLController implements ControllerInterface<Belong_to_League>{

	private static BTLController controller;
	
	static {
		try {
			if(controller == null) controller = new BTLController();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	Belong_to_League btl = new Belong_to_League();
	League league; 
	Club club; 
	
	BTLDAO btlDAO = new ImplBTLDAO();
	LeagueDAO leagueDAO = new ImplLeagueDAO(); 
	ClubDAO clubDAO = new ImplClubDAO(); 
	
	List<Belong_to_League> btlList;
	Iterator<Belong_to_League> itr;
	int count;
	String temp = "";
	String 
	column_name = "League\t club\t"+ "----\t--------\t-----\t--------"+"\n";
	
	@Override
	public void init() {
		temp = "";
	}
	@Override
	public String selectAll() {
		init();
		try {
			btlList = btlDAO.selectAll();
			getData();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return temp;
	}
	
	@Override
	public String search(String attribute, String condition) {
		init();
		if(!attribute.isEmpty() && !condition.isEmpty()) {
			try {
				switch(attribute) {
					case "league":
						btlList = btlDAO.selectByLeagueId(Integer.parseInt(condition)); 
						getData();
						break;
					case "club":
						btlList = btlDAO.selectByClubId(Integer.parseInt(condition)); 
						getData();
						break;
					default:
						temp += "\n\n\n\t\t\tIllegal Attribute... is it " + attribute +"?";
						break;
				}
			
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

		if(temp.equals(column_name) || temp.isEmpty()) temp += "\n\n\n\t\t\t There is no data for " + condition + " at " + attribute + "in Belong_to_League Table"  + " \n";

		return temp;	
	}
	@Override
	public String order(String attribute, String condition) {
		// TODO Auto-generated method stub
		init();
		
		if(!attribute.isEmpty() && !condition.isEmpty()) {
			try {
				if(condition.equals("dsc")) {
					switch(attribute) {
					case "league_id":
						btlList = btlDAO.orderByLeagueIdDESC(); 
						break; 
					case "club_id": 
						btlList = btlDAO.orderByClubIdDESC(); 
						break; 
					}
				}else {
					switch(attribute) {
					case "league_id":
						btlList = btlDAO.orderByLeagueId(); 
						break; 
					case "club_id": 
						btlList = btlDAO.orderByClubId(); 
						break; 
					}
				}
			
			} catch(Exception e) {
				e.printStackTrace();
			}finally {
				getData(); 
			}
		}
		
		return temp; 
	}
	
	@Override
	public int count(String attribute, String condition) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	void getData() {
		itr = btlList.iterator();
		temp += column_name;
		try {
			while(itr.hasNext()) {
				btl = itr.next();
				league = leagueDAO.selectById(btl.getLeague_id());
				club = clubDAO.selectById(btl.getClub_id()); 
				temp += league.getLeague_name() + "\t" + club.getClub_fullname() +"\n";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public static BTLController getController() {
		return controller;
	}
	
}

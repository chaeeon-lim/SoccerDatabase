package com.soccerdb.oldschool.control;

import java.util.Iterator;
import java.util.List;

import com.soccerdb.oldschool.db.dao.ImplSeasonDAO;
import com.soccerdb.oldschool.db.dao.SeasonDAO;
import com.soccerdb.oldschool.db.entity.Season;

public class SeasonController implements ControllerInterface<Season>{

	private static SeasonController controller;
	
	static {
		try {
			if(controller == null) {
				controller = new SeasonController();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	Season season;
	SeasonDAO seasonDAO = new ImplSeasonDAO();
	List<Season> seasonList;
	Iterator<Season> itr;
	int count;
	String temp = "";
	String column_name = "Season" + "\n" + "-----" + "\n";
	@Override
	public void init() {
		temp = "";
	}

	@Override
	public String selectAll() {
		init();
		try {
			seasonList = seasonDAO.selectAll();
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
				season = seasonDAO.selectById(Integer.parseInt(condition));
			}catch(Exception e) {
				e.printStackTrace();
			}
				
		}
		return ""+season.getSeason_year();
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
		itr = seasonList.iterator();
		temp += column_name;
		while(itr.hasNext()) {
			season = itr.next();
			temp += season.getSeason_year();
		}
	}
	
	public static SeasonController getController() {
		return controller;
	}
	
	@Override
	public int insert(Season entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void update(Season entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Season entity) {
		// TODO Auto-generated method stub
		
	}

}

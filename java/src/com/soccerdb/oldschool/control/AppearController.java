package com.soccerdb.oldschool.control;

import java.util.Iterator;
import java.util.List;

import com.soccerdb.oldschool.db.dao.AppearDAO;
import com.soccerdb.oldschool.db.dao.ImplAppearDAO;
import com.soccerdb.oldschool.db.entity.Appear;

public class AppearController implements ControllerInterface<Appear>{

	private static AppearController controller;
	
	static {
		try {
			if(controller == null) controller = new AppearController();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	Appear appear;
	AppearDAO appearDAO = new ImplAppearDAO();
	List<Appear> appearList;
	Iterator<Appear> itr;
	int count;
	String temp = "";
	String column_name = "Name\tSeason\tGameID\tStartTime\tEndTime\tinGamePosition\tGoals\tAssists\tSaves\tFouls\tCard\tDistance" + "\n"
			+ "----\t--------\t-----\t--------"+"\n";
	
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		temp="";
	}

	@Override
	public String selectAll() {
		init();
		try {
			appearList = appearDAO.selectAll();
			getData();
		} catch (Exception e) {
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
	
	public static AppearController getController() {
		return controller;
	}
	
	void getData() {
		itr = appearList.iterator();
		temp += column_name;
		while(itr.hasNext()) {
			appear = itr.next();
			temp += appear.toString() +"\n";
		}
	}

}

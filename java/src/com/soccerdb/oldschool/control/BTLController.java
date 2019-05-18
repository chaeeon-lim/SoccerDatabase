package com.soccerdb.oldschool.control;

import java.util.Iterator;
import java.util.List;

import com.soccerdb.oldschool.db.dao.BTLDAO;
import com.soccerdb.oldschool.db.dao.ImplBTLDAO;
import com.soccerdb.oldschool.db.entity.Belong_to_League;

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
	BTLDAO btlDAO = new ImplBTLDAO();
	List<Belong_to_League> btlList;
	Iterator<Belong_to_League> itr;
	int count;
	String temp = "";
	String 
	column_name = "";
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
		itr = btlList.iterator();
		temp = column_name;
		while(itr.hasNext()) {
			btl = itr.next();
			temp += btl.toString() +"\n";
		}
	}
	
	public static BTLController getController() {
		return controller;
	}
	
}

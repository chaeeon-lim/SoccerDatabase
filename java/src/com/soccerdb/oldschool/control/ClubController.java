package com.soccerdb.oldschool.control;

import java.util.Iterator;
import java.util.List;

import com.soccerdb.oldschool.db.dao.ClubDAO;
import com.soccerdb.oldschool.db.dao.ImplClubDAO;
import com.soccerdb.oldschool.db.entity.Club;

public class ClubController implements ControllerInterface<Club>{

	private static ClubController controller;

	static {
		try {
			if(controller == null) {
				controller = new ClubController();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
	Club club;
	ClubDAO clubDAO = new ImplClubDAO();
	List<Club> clubList;
	Iterator<Club> itr;
	int count;
	String temp = "";
	
	
	String column_name = "Full name\t" + "gound\t" + "nickname\t"+ "owner\t" + "chairman\t" +
	"manager\t" + "logo\t" + "----\t--------\t-----\t--------"+"\n"; 

	@Override
	public void init() {
		// TODO Auto-generated method stub
		temp = "";
	}

	@Override
	public String selectAll() {
		// TODO Auto-generated method stub
		init();
		try {
			clubList = clubDAO.selectAll();
			getData();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return temp;
	}
	
	@Override
	public String search(String attribute, String condition) {
		// TODO Auto-generated method stub
		init();
		if(!attribute.isEmpty() && !condition.isEmpty()) {
			try {
				switch(attribute) {
					case "id":
						club = clubDAO.selectById(Integer.parseInt(condition));
						return club.getClub_fullname(); 

					case "ground":
						clubList = clubDAO.selectByGround(condition); 
						getData();
						break;
					case "nickname":
						clubList = clubDAO.selectByNickname(condition); 
						getData();
						break;
					case "owner":
						clubList = clubDAO.selectByOwner(condition); 
						getData();
						break;
					case "chairman":
						clubList = clubDAO.selectByOwner(condition); 
						getData();
						break;
					case "manager":
						clubList = clubDAO.selectByManager(condition); 
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

		if(temp.equals(column_name) || temp.isEmpty()) temp += "\n\n\n\t\t\t There is no data for " + condition + " at " + attribute + "in Club Table"  + " \n";

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
					case "full_name":
						clubList = clubDAO.orderByFullnameDESC();  
						break; 
					case "ground":
						clubList = clubDAO.orderByGroundDESC();  
						break;
					case "nickname":
						clubList = clubDAO.orderByNicknameDESC();  
						break;
					case "owner":
						clubList = clubDAO.orderByOwnerDESC();  
						break;
					case "chairman":
						clubList = clubDAO.orderByChairmanDESC();  
						break;
					case "manager":
						clubList = clubDAO.orderByManagerDESC();  
						break;
					}
				}else {
					switch(attribute) {
					case "full_name":
						clubList = clubDAO.orderByFullname();  
						break; 
					case "ground":
						clubList = clubDAO.orderByGround();  
						break;
					case "nickname":
						clubList = clubDAO.orderByNickname();  
						break;
					case "owner":
						clubList = clubDAO.orderByOwner();  
						break;
					case "chairman":
						clubList = clubDAO.orderByChairman();  
						break;
					case "manager":
						clubList = clubDAO.orderByManager();  
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
		init();
		
		return count;
	}
	
	public static ClubController getController() {
		return controller;
	}
	
	void getData() {
		itr = clubList.iterator();
		temp += column_name;
		while(itr.hasNext()) {
			club = itr.next();
			temp += club.getClub_fullname() + "\t" + club.getClub_ground() + "\t" + 
			club.getClub_nickname() + "\t" + club.getClub_owner() +  club.getClub_chairman() + "\t" + 
					club.getClub_manager() + "\t" + club.getClub_logo() + "\n";
		}
	}
}

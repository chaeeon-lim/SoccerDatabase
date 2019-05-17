package com.soccerdb.oldschool.control;

import java.util.Iterator;
import java.util.List;

import com.soccerdb.oldschool.db.dao.ImplPlayerDAO;
import com.soccerdb.oldschool.db.dao.PlayerDAO;
import com.soccerdb.oldschool.db.entity.Player;

public class PlayerController implements ControllerInterface<Player>{
	
	private static PlayerController controller;

	static {
		try {
			if(controller == null) {
				controller = new PlayerController();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
	Player player;
	PlayerDAO playerDAO = new ImplPlayerDAO();
	List<Player> playerList;
	Iterator<Player> itr;
	String temp = "";
	String column_name = "Name\t" + "Nationality\t" + "Debut\t"+"Birthday" + "\n"
						+ "----\t--------\t-----\t--------"+"\n";
	
	
	@Override
	public String selectAll() {
		init();
		try {
			playerList = playerDAO.selectAll();
			getData();
		} catch (Exception e) {
			// TODO Auto-generated catch block
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
					case "nationality":
						playerList = playerDAO.selectByNationality(condition);
						getData();
						break;
					case "name":
						playerList = playerDAO.selectByLetterForName("%"+condition+"%");
						getData();
						break;
					case "debut":
						playerList = playerDAO.searchPlayerDebutAtThisYear(Integer.parseInt(condition));
						break;
					case "birthday":
						playerList = playerDAO.selectByBirthday(condition);
						getData();
						break;
					case "age":
						playerList = playerDAO.searchAllPlayersSameAge(Integer.parseInt(condition));
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
		if(temp.equals(column_name) || temp.isEmpty()) temp += "\n\n\n\t\t\t There is no data for " + condition + "";
		return temp;
		
	}
	@Override
	public String order(String attribute, String condition, String logic) {
		// TODO Auto-generated method stub
		init();
		return null;
	}

	public static PlayerController getController() {
		return controller;
	}
	
	void getData() {
		itr = playerList.iterator();
		temp += column_name;
		while(itr.hasNext()) {
			player = itr.next();
			temp += player.getPlayer_name() + "\t" + player.getPlayer_nationality()+ "\t" + player.getPlayer_debut() + "\t" + player.getPlayer_birthday() +  "\n";
		}
	}
	@Override
	public void init() {
		temp = "";
		
	}
	@Override
	public int insert(Player entity) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void update(Player entity) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete(Player entity) {
		// TODO Auto-generated method stub
		
	}
}

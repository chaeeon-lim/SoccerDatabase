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
	int count;
	String temp = "";
	String column_name = "Name\t" + "Nationality\t" + "Debut\t"+"Birthday" + "\n"
						+ "----\t--------\t-----\t--------"+"\n";

	@Override
	public void init() {
		temp = "";
		
	}
	
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
				case "id":
						player = playerDAO.selectById(Integer.parseInt(condition));
						return player.getPlayer_name();
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
						getData();
						break;
					case "debut after":
						playerList = playerDAO.searchPlayerDebutAfterThisYear(Integer.parseInt(condition));
						getData();
						break;
					case "debut before":
						playerList = playerDAO.searchPlayerDebutBeforeThisYear(Integer.parseInt(condition));
						getData();
						break;
					case "birthday":
						playerList = playerDAO.selectByBirthday(condition);
						getData();
						break;
					case "same age":
						playerList = playerDAO.searchAllPlayersSameAge(Integer.parseInt(condition));
						getData();
						break;
					case "under age":
						playerList = playerDAO.searchAllPlayersUnderAge(Integer.parseInt(condition));
						getData();
						break;
					case "over age":
						playerList = playerDAO.searchAllPlayersOverAge(Integer.parseInt(condition));
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
		if(temp.equals(column_name) || temp.isEmpty()) temp += "\n\n\n\t\t\t There is no data for " + condition + " at " + attribute + "in Player Table"  + " \n";
		return temp;
		
	}
	@Override
	public String order(String attribute, String condition) {
		
		init();
		
		if(!attribute.isEmpty() && !condition.isEmpty()) {
			try {
				player.setPlayer_name(attribute);
				switch(condition) {
					case "dsc":
						player.setPlayer_nationality(condition);
						playerList = playerDAO.searchPlayerOrderBy(player);
						getData();
						break;
					case "asc":
						playerList = playerDAO.searchPlayerOrderBy(player);
						getData();
						break;
					default:
						temp += "\n\n\n\t\t\tIllegal Attribute... is it " + attribute +"?";
						break;
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		return temp;
	}
	
	@Override
	public int count(String attribute, String condition) {

		init();
		
		if(!attribute.isEmpty() && !condition.isEmpty()) {
			try {
				switch(attribute) {
				case "all":
					count = playerDAO.countAllPlayers();
					break;
				case "country":
					count = playerDAO.countAllPlayerWithCountry(condition);
					break;
				case "debut":
					count = playerDAO.countAllPlayerWithDebutYear(Integer.parseInt(condition));
					break;
				case "birthday":
					count = playerDAO.countAllPlayerWithBirthday(condition);
					break;
				case "same age":
					count = playerDAO.countAllPlayersSameAge(Integer.parseInt(condition));
					break;
				case "under age":
					count = playerDAO.countAllPlayersUnderAge(Integer.parseInt(condition));
					break;
				case "over age":
					count = playerDAO.countAllPlayersOverAge(Integer.parseInt(condition));
					break;
				default:
					count = -1;
					
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		return count;
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

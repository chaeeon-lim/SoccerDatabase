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
	
	Player player = new Player();
	PlayerDAO playerDAO = new ImplPlayerDAO();
	List<Player> playerList;
	Iterator<Player> itr;
	int count;
	String temp = "";
	String column_name = "Name\t" + "Nationality\t" + "Debut\t"+"Birthday" + "\n"
						+ "----\t--------\t-----\t--------"+"\n";

	@Override
	public void init() {
		temp = column_name;
		player.setPlayer_nationality("");
		player.setPlayer_name("");
		player.setPlayer_id(0);
		player.setPlayer_debut(0);
		player.setPlayer_birthday(null);
		
	}
	
	@Override
	public String selectAll() {
		init();
		try {
			playerList = playerDAO.selectAll();
			count = count("all", "anything");
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
						count = count(attribute, condition);
						break;
					case "name":
						playerList = playerDAO.selectByLetterForName("%"+condition+"%");
						count = count(attribute, "%"+condition+"%");
						break;
					case "debut":
						playerList = playerDAO.searchPlayerDebutAtThisYear(Integer.parseInt(condition));
						count = count(attribute, condition);
						break;
					case "debut after":
						playerList = playerDAO.searchPlayerDebutAfterThisYear(Integer.parseInt(condition));
						count = count(attribute, condition);
						break;
					case "debut before":
						playerList = playerDAO.searchPlayerDebutBeforeThisYear(Integer.parseInt(condition));
						count = count(attribute, condition);
						break;
					case "birthday":
						playerList = playerDAO.selectByBirthday(condition);
						count = count("birthday", condition);
						break;
					case "same age":
						playerList = playerDAO.searchAllPlayersSameAge(Integer.parseInt(condition));
						count = count("same age", condition);
						break;
					case "under age":
						playerList = playerDAO.searchAllPlayersUnderAge(Integer.parseInt(condition));
						count = count("under age", condition);
						break;
					case "over age":
						playerList = playerDAO.searchAllPlayersOverAge(Integer.parseInt(condition));
						count = count("over age", condition);
						break;
					default:
						temp += "\n\n\n\t\t\tIllegal Attribute... is it " + attribute +"?";
						break;
				}
			
			}catch(Exception e) {
				e.printStackTrace();
			}finally{
				getData();
			}
		}
		

		if(temp.equals(column_name)) temp += "\n\n\n\t\t\t There is no data for " + condition + " at " + attribute + "in Player Table"  + " \n";

		return temp;		
	}
	@Override
	public String order(String attribute, String condition) {
		
		init();
		
		if(!attribute.isEmpty() && !condition.isEmpty()) {
			try {
				if(condition.equals("dsc")) {
					switch(attribute) {
					case "nationality":
						playerList = playerDAO.searchPlayersOrderByNationalityDesc();
						
						break;
					case "name":
						playerList = playerDAO.searchPlayersOrderByNameDesc();
						
						break;
					case "debut":
						playerList = playerDAO.searchPlayersOrderByDebutDesc();
						
						break;
					case "birthday":
						playerList = playerDAO.searchPlayersOrderByBirthdayDesc();
						
						break;
					default:
						temp += "\n\n\n\t\t\tIllegal Attribute... is it " + attribute +"?";
						break;
					}
				}
				else {
					switch(attribute) {
					case "nationality":
						playerList = playerDAO.searchPlayersOrderByNationality();
						
						break;
					case "name":
						playerList = playerDAO.searchPlayersOrderByName();
						
						break;
					case "debut":
						playerList = playerDAO.searchPlayersOrderByDebut();
						
						break;
					case "birthday":
						playerList = playerDAO.searchPlayersOrderByBirthday();
						
						break;
					default:
						temp += "\n\n\n\t\t\tIllegal Attribute... is it " + attribute +"?";
						break;
					}
				}
				
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				count = count("all", "anything");
				getData();
			}
		}
		
		if(temp.equals(column_name) || temp.isEmpty()) temp += "\n\n\n\t\t\t There is no data for " + condition + " at " + attribute + "in Player Table"  + " \n";
		
		return temp;
	}
	
	@Override
	public int count(String attribute, String condition) {

		if(!attribute.isEmpty() && !condition.isEmpty()) {
			try {
				switch(attribute) {
				case "all":
					count = playerDAO.countAllPlayers();
					break;
				case "name":
					count = playerDAO.countAllPlayerByLetterForName(condition);
					break;
				case "nationality":
					count = playerDAO.countAllPlayerWithCountry(condition);
					break;
				case "debut":
					count = playerDAO.countAllPlayerWithDebutYear(Integer.parseInt(condition));
					break;
				case "debut after":
					count = playerDAO.countAllPlayerDebutAfterThisYear(Integer.parseInt(condition));
					break;
				case "debut before":
					count = playerDAO.countAllPlayerDebutBeforeThisYear(Integer.parseInt(condition));
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
		while(itr.hasNext()) {
			player = itr.next();
			temp += player.getPlayer_name() + "\t" + player.getPlayer_nationality()+ "\t" + player.getPlayer_debut() + "\t" + player.getPlayer_birthday() +  "\n";
		}
		temp += "\n\n" + "Total : \t" + count + " Players\n";
	}
}

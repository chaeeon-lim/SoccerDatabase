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
	public String search(String attribute, String condition) {		// 'moreLess' for more than or less than condition
		init();
	//	if(!attribute.isBlank() && !condition.isBlank()) {
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
						getData();
						break;
					case "debut before":
						playerList = playerDAO.searchPlayerDebutBeforeThisYear(Integer.parseInt(condition));
						getData();
						break;
					case "debut after":
						playerList = playerDAO.searchPlayerDebutAfterThisYear(Integer.parseInt(condition));
						getData();
						break;
					case "birthday":
						playerList = playerDAO.selectByBirthday(condition);
						getData();
						break;
					case "age":
						playerList = playerDAO.searchAllPlayersSameAge(Integer.parseInt(condition));
						getData();
						break;
					case "age under":
						playerList = playerDAO.searchAllPlayersUnderAge(Integer.parseInt(condition));
						getData();
						break;
					case "age over":
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
	//	}
	//	if(temp.equals(column_name) || temp.isBlank()) temp += "\n\n\n\t\t\t There is no data for " + condition + "";
		return temp;
		
	}
	@Override
	public String order(String attribute, String condition) {
		// TODO Auto-generated method stub
		init();
		try{
			switch(attribute){
				case "nationality":
					if(condition.equals("asc")){
						playerList = playerDAO.searchPlayersOrderByNationality();
						getData();						
					}
					else if(condition.equals("desc")){
						playerList = playerDAO.searchPlayersOrderByNationalityDesc();
						getData();
					}
					break;
				case "name":
					if(condition.equals("asc")){
						playerList = playerDAO.searchPlayersOrderByName();
						getData();						
					}
					else if(condition.equals("desc")){
						playerList = playerDAO.searchPlayersOrderByNameDesc();
						getData();
					}
					break;
				case "debut":
					if(condition.equals("asc")){
						playerList = playerDAO.searchPlayersOrderByDebut();
						getData();						
					}
					else if(condition.equals("desc")){
						playerList = playerDAO.searchPlayersOrderByDebutDesc();
						getData();
					}
					break;
				case "birthday":
					if(condition.equals("asc")){
						playerList = playerDAO.searchPlayersOrderByBirthday();
						getData();						
					}
					else if(condition.equals("desc")){
						playerList = playerDAO.searchPlayersOrderByBirthdayDesc();
						getData();
					}
					break;
				default:
					temp += "\n\n\n\t\t\tIllegal Attribute... is it " + attribute +"?";
					break;
			}

		} catch(Exception ex){
			ex.printStackTrace();
		}

		return temp;
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

package com.soccerdb.oldschool.control;

import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

import com.soccerdb.oldschool.db.dao.AppearDAO;
import com.soccerdb.oldschool.db.dao.ContractDAO;
import com.soccerdb.oldschool.db.dao.GameDAO;
import com.soccerdb.oldschool.db.dao.ImplAppearDAO;
import com.soccerdb.oldschool.db.dao.ImplGameDAO;
import com.soccerdb.oldschool.db.dao.ImplPlayerDAO;
import com.soccerdb.oldschool.db.dao.ImplSeasonDAO;
import com.soccerdb.oldschool.db.dao.PlayerDAO;
import com.soccerdb.oldschool.db.dao.SeasonDAO;
import com.soccerdb.oldschool.db.entity.Appear;
import com.soccerdb.oldschool.db.entity.Contract;
import com.soccerdb.oldschool.db.entity.Game;
import com.soccerdb.oldschool.db.entity.Player;
import com.soccerdb.oldschool.db.entity.Season;

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
	Player player; 
	Game game; 
	Season season; 
	
	AppearDAO appearDAO = new ImplAppearDAO();
	PlayerDAO playerDAO = new ImplPlayerDAO(); 
	GameDAO gameDAO = new ImplGameDAO(); 
	SeasonDAO seasonDAO = new ImplSeasonDAO(); 
	
	List<Appear> appearList;
	Iterator<Appear> itr;
	int count;
	String temp = "";
	String column_name = "Name\tGameID\tSeason\tStartTime\tEndTime\tinGamePosition\tGoals\tAssists\tSaves\tFouls\tCard\tDistance" + "\n"
			+ "----\t--------\t-----\t--------"+"\n";
	String condition1 = ""; 
	String condition2 = ""; 
	
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
			count = count("all", "anything");
			getData();
		} catch (Exception e) {
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
				if(condition.indexOf(",") != -1){
					String[] conditions = condition.split(","); 
					condition1 = conditions[0]; 
					condition2 = conditions[1]; 
				}
				switch(attribute) {

					case "player_id":
						appearList = appearDAO.selectByPlayerId(Integer.parseInt(condition)); 
						break; 
					case "game_id":
						appearList = appearDAO.selectByGameId(Integer.parseInt(condition));  
						break;
					case "season_id":
						appearList = appearDAO.selectBySeasonId(Integer.parseInt(condition));  
						break;
					case "start_time_between":
						appearList = appearDAO.selectByStartTimeBetween(
								new SimpleDateFormat("hh:mm:ss").parse(condition1), 
								new SimpleDateFormat("hh:mm:ss").parse(condition2)); 
						count = count(attribute, condition);
						break; 
					case "end_time_between":
						appearList = appearDAO.selectByEndTimeBetween(
								new SimpleDateFormat("hh:mm:ss").parse(condition1), 
								new SimpleDateFormat("hh:mm:ss").parse(condition2));  
						count = count(attribute, condition);
						break; 
					case "in_game_position":
						appearList = appearDAO.selectByInGamePosition(condition);  
						count = count(attribute, condition);
						break;
					case "goals_more_than":
						appearList = appearDAO.selectByGoalsMoreThan(Integer.parseInt(condition));  
						count = count(attribute, condition);
						break;
					case "assist_more_than":
						appearList = appearDAO.selectByAssistMoreThan(Integer.parseInt(condition)); 
						count = count(attribute, condition);
						break;
					case "save_more_than":
						appearList = appearDAO.selectBySaveMoreThan(Integer.parseInt(condition)); 
						count = count(attribute, condition);
						break;
					case "foul_more_than":
						appearList = appearDAO.selectByFoulMoreThan(Integer.parseInt(condition)); 
						count = count(attribute, condition);
						break;
					case "card_more_than":
						appearList = appearDAO.selectByCardMoreThan(Integer.parseInt(condition)); 
						count = count(attribute, condition);
						break;
					case "distance_more_than":
						appearList = appearDAO.selectByDistanceMoreThan(Float.parseFloat(condition)); 
						count = count(attribute, condition);
						break;
					default:
						temp += "\n\n\n\t\t\tIllegal Attribute... is it " + attribute +"?";
						break;
				}
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				getData();
			}
		}
		
		if(temp.equals(column_name) || temp.isEmpty()) temp += "\n\n\n\t\t\t There is no data for " + condition + " at " + attribute + " in Appear Table"  + " \n";

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
					case "player_id":
						appearList = appearDAO.orderByPlayerIdDESC(); 
						break; 
					case "game_id": 
						appearList = appearDAO.orderByGameIdDESC(); 
						break; 
					case "season_id": 
						appearList = appearDAO.orderBySeasonIdDESC(); 
						break; 
					case "start_time": 
						appearList = appearDAO.orderByStartTimeDESC(); 
						break; 
					case "end_time": 
						appearList = appearDAO.orderByEndTimeDESC(); 
						break; 
					case "goals": 
						appearList = appearDAO.orderByGoalsDESC(); 
						break; 
					case "assist": 
						appearList = appearDAO.orderByAssistDESC(); 
						break; 
					case "save": 
						appearList = appearDAO.orderBySaveDESC(); 
						break; 
					case "foul": 
						appearList = appearDAO.orderByFoulDESC(); 
						break; 
					case "card": 
						appearList = appearDAO.orderByCardDESC(); 
						break; 
					case "distance": 
						appearList = appearDAO.orderByDistanceDESC(); 
						break; 
					}
				}else {
					switch(attribute) {
					case "game_id":
						appearList = appearDAO.orderByGameId(); 
					case "player_id":
						appearList = appearDAO.orderByPlayerId(); 
						break; 
					case "season_id": 
						appearList = appearDAO.orderBySeasonId(); 
						break; 
					case "start_time": 
						appearList = appearDAO.orderByStartTime(); 
						break; 
					case "end_time": 
						appearList = appearDAO.orderByEndTime(); 
						break; 
					case "goals": 
						appearList = appearDAO.orderByGoals(); 
						break; 
					case "assist": 
						appearList = appearDAO.orderByAssist(); 
						break; 
					case "save": 
						appearList = appearDAO.orderBySave(); 
						break; 
					case "foul": 
						appearList = appearDAO.orderByFoul(); 
						break; 
					case "card": 
						appearList = appearDAO.orderByCard(); 
						break; 
					case "distance": 
						appearList = appearDAO.orderByDistance(); 
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
		if(!attribute.isEmpty() && !condition.isEmpty()) {
			try {
				switch(attribute) {
					case "all":
						count = appearDAO.CountAllAppears();
						break;
					case "start_time_between":
						count = appearDAO.CountByStartTimeBetween(
								new SimpleDateFormat("hh:mm:ss").parse(condition1), 
								new SimpleDateFormat("hh:mm:ss").parse(condition2)); 
						break; 
					case "end_time_between":
						count = appearDAO.CountByEndTimeBetween(
								new SimpleDateFormat("hh:mm:ss").parse(condition1), 
								new SimpleDateFormat("hh:mm:ss").parse(condition2));  
						break; 
					case "in_game_position":
						count = appearDAO.CountByInGamePosition(condition);  
						break;
					case "goals_more_than":
						count = appearDAO.CountByGoalsMoreThan(Integer.parseInt(condition));  
						break;
					case "assist_more_than":
						count = appearDAO.CountByAssistMoreThan(Integer.parseInt(condition)); 
						break;
					case "save_more_than":
						count = appearDAO.CountBySaveMoreThan(Integer.parseInt(condition)); 
						break;
					case "foul_more_than":
						count = appearDAO.CountByFoulMoreThan(Integer.parseInt(condition)); 
						break;
					case "card_more_than":
						count = appearDAO.CountByCardMoreThan(Integer.parseInt(condition)); 
						break;
					case "distance_more_than":
						count = appearDAO.CountByDistanceMoreThan(Float.parseFloat(condition)); 
						break;
					default:
						count = -1;
						break;
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally{
				getData();
			}
			
		}

		return count;
	}
	
	public static AppearController getController() {
		return controller;
	}
	
	void getData() {
		itr = appearList.iterator();
		temp += column_name;
		try {
			while(itr.hasNext()) {
				appear = itr.next();
				player = playerDAO.selectById(appear.getPlayer_id()); 
				season = seasonDAO.selectById(appear.getSeason_id()); 
				temp += player.getPlayer_name() + "\t"+ appear.getGame_id() + "\t" + 
						season.getSeason_year() +"\t" + appear.getStart_time() + "\t" + 
						appear.getEnd_time() + "\t" + appear.getGoals() + "\t" + 
						appear.getAssist() + "\t" + appear.getFoul() + "\t" + 
						appear.getCard() + "\t" + appear.getDistance() +"\n";
			}
			temp += "\n\n" + "Total : \t" + count + " Appears\n";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}

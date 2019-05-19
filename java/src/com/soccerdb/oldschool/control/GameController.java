package com.soccerdb.oldschool.control;

import java.util.Iterator;
import java.util.List;

import com.soccerdb.oldschool.db.dao.ImplGameDAO;
import com.soccerdb.oldschool.db.dao.GameDAO;
import com.soccerdb.oldschool.db.entity.Game;

public class GameController implements ControllerInterface<Game>{
	
	private static GameController controller;

	static {
		try {
			if(controller == null) {
				controller = new GameController();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
	Game game;
	GameDAO gameDAO = new ImplGameDAO();
	List<Game> gameList;
	Iterator<Game> itr;
	int count;
	String temp = "";
	String column_name = "Place\t" + "GameID\t" + "Time\t\t\t\tWeather\tBonusTime\tisExtended\tisShootOut\tGameType\tScore\tFoul\tBallOccupation\tCard\tCornerKick\tPenaltyKick\tThrowing\tUniformColor\tFreekick"+ "\n"
						+ "----\t----\t-----\t------\t--------\t-------\t--------\t--------\t----\t----\t--------\t----\t------\t-------\t-----\t------\t-----"+"\n";
	@Override
	public void init() {
		temp = column_name;
		
	}
	
	@Override
	public String selectAll() {
		init();
		try {
			gameList = gameDAO.selectAll();
			count = count("all","anything");
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
					case "place":
						gameList = gameDAO.selectByPlace(condition);
						count = count(attribute,condition);
						break;
					case "weather":
						gameList = gameDAO.selectByWeather(condition);
						count = count(attribute,condition);
						break;
					case "extended":
						gameList = gameDAO.selectByExtended(Boolean.parseBoolean(condition));
						count = count(attribute,condition);
						break;
					case "shoot out":
						gameList = gameDAO.selectByShootOut(Boolean.parseBoolean(condition));
						count = count(attribute,condition);
						break;
					case "type":
						gameList = gameDAO.selectByGameType(condition);
						count = count(attribute,condition);
						break;
					case "score upper":
						gameList = gameDAO.selectByScoreUpper(Integer.parseInt(condition));
						count = count(attribute,condition);
						break;
					case "score lower":
						gameList = gameDAO.selectByScoreLower(Integer.parseInt(condition));
						count = count(attribute,condition);
						break;
					case "throwing upper":
						gameList = gameDAO.selectByThrowingUpper(Integer.parseInt(condition));
						count = count(attribute,condition);
						break;
					case "throwing lower":
						gameList = gameDAO.selectByThrowingLower(Integer.parseInt(condition));
						count = count(attribute,condition);
						break;
					case "foul upper":
						gameList = gameDAO.selectByFoulUpper(Integer.parseInt(condition));
						count = count(attribute,condition);
						break;
					case "foul lower":
						gameList = gameDAO.selectByFoulLower(Integer.parseInt(condition));
						count = count(attribute,condition);
						break;
					case "card upper":
						gameList = gameDAO.selectByCardUpper(Integer.parseInt(condition));
						count = count(attribute,condition);
						break;
					case "card lower":
						gameList = gameDAO.selectByCardLower(Integer.parseInt(condition));
						count = count(attribute,condition);
						break;
					case "cornerkick upper":
						gameList = gameDAO.selectByCornerKickUpper(Integer.parseInt(condition));
						count = count(attribute,condition);
						break;
					case "cornerkick lower":
						gameList = gameDAO.selectByFreekickLower(Integer.parseInt(condition));
						count = count(attribute,condition);
						break;
					case "freekick upper":
						gameList = gameDAO.selectByFreekickUpper(Integer.parseInt(condition));
						count = count(attribute,condition);
						break;
					case "freekick lower":
						gameList = gameDAO.selectByCornerKickLower(Integer.parseInt(condition));
						count = count(attribute,condition);
						break;
					case "penaltykick upper":
						gameList = gameDAO.selectByPenaltykickUpper(Integer.parseInt(condition));
						count = count(attribute,condition);
						break;
					case "penaltykick lower":
						gameList = gameDAO.selectByPenaltykickLower(Integer.parseInt(condition));
						count = count(attribute,condition);
						break;
					case "uniform color":
						gameList = gameDAO.selectByUniformColor(condition);
						count = count(attribute,condition);
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
		if(temp.equals(column_name)) temp += "\n\n\n\t\t\t There is no data for " + condition + "";
		return temp;
		
	}
	@Override
	public String order(String attribute, String condition) {
		init();
		if(!attribute.isEmpty() && !condition.isEmpty()) {
			try {
				switch(attribute) {
				case "score":
					gameList = gameDAO.selectOrderByScore();
					break;
				case "bonus time":
					gameList = gameDAO.selectOrderByBonus();
					break;
				case "ball occupation":
					gameList = gameDAO.selectOrderByBallOccupation();
					break;
				case "card":
					gameList = gameDAO.selectOrderByCard();
					break;
				case "cornerkick":
					gameList = gameDAO.selectOrderByCornerkick();
					break;
				case "penaltykick":
					gameList = gameDAO.selectOrderByPenaltykick();
					break;
				case "throwing":
					gameList = gameDAO.selectOrderByThrowing();
					break;
				}
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				count = count("all","anything");
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
						count = gameDAO.countAll();
						break;
					case "place":
						count = gameDAO.countByPlace(condition);
						break;
					case "weather":
						count = gameDAO.countByWeather(condition);
						 
						break;
					case "extended":
						count = gameDAO.countByExtended(Boolean.parseBoolean(condition));
						 
						break;
					case "shoot out":
						count = gameDAO.countByShootOut(Boolean.parseBoolean(condition));
						 
						break;
					case "type":
						count = gameDAO.countByGameType(condition);
						 
						break;
					case "score upper":
						count = gameDAO.countByScoreUpper(Integer.parseInt(condition));
						 
						break;
					case "score lower":
						count = gameDAO.countByScoreLower(Integer.parseInt(condition));
						 
						break;
					case "throwing upper":
						count = gameDAO.countByThrowingUpper(Integer.parseInt(condition));
						 
						break;
					case "throwing lower":
						count = gameDAO.countByThrowingLower(Integer.parseInt(condition));
						 
						break;
					case "foul upper":
						count = gameDAO.countByFoulUpper(Integer.parseInt(condition));
						 
						break;
					case "foul lower":
						count = gameDAO.countByFoulLower(Integer.parseInt(condition));
						 
						break;
					case "card upper":
						count = gameDAO.countByCardUpper(Integer.parseInt(condition));
						 
						break;
					case "card lower":
						count = gameDAO.countByCardLower(Integer.parseInt(condition));
						 
						break;
					case "cornerkick upper":
						count = gameDAO.countByCornerKickUpper(Integer.parseInt(condition));
						 
						break;
					case "cornerkick lower":
						count = gameDAO.countByFreekickLower(Integer.parseInt(condition));
						 
						break;
					case "freekick upper":
						count = gameDAO.countByFreekickUpper(Integer.parseInt(condition));
						 
						break;
					case "freekick lower":
						count = gameDAO.countByCornerKickLower(Integer.parseInt(condition));
						 
						break;
					case "penaltykick upper":
						count = gameDAO.countByPenaltykickUpper(Integer.parseInt(condition));
						 
						break;
					case "penaltykick lower":
						count = gameDAO.countByPenaltykickLower(Integer.parseInt(condition));
						 
						break;
					case "uniform color":
						count = gameDAO.countByUniformColor(condition);
						 
						break;
					default:
						temp += "\n\n\n\t\t\tIllegal Attribute... is it " + attribute +"?";
						break;
				}
			
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return count;
	}
	public static GameController getController() {
		return controller;
	}
	
	void getData() {
		itr = gameList.iterator();
		while(itr.hasNext()) {
			game = itr.next();
			temp += game.getgame_place() + "\t" + game.getGame_id()+ "\t" + game.getgame_time() + "\t"
			+ game.getgame_weather() + "\t"+ game.getgame_bonus_time() + "\t"+ game.isgame_is_extended()
			+ "\t"+ game.isgame_is_shoot_out() + "\t"+ game.getGame_type()
			+ "\t"+ game.getgame_score() + "\t"+ game.getgame_foul() + "\t"+ game.getgame_ball_occupation()
			+ "\t" + game.getgame_card() + "\t"+ game.getgame_corner_kick() + "\t"+ game.getgame_penalty_kick() + "\t"
			+ game.getgame_throwing() + "\t"+ game.getgame_uniform_color() + "\t"+"\n";
		}
		temp += "\n\n" + "Total : \t" + count + " Games\n";
	}
	
	
}

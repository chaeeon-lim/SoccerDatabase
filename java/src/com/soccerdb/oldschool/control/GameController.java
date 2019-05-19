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
	String column_name = "GameId\t" + "Time\t" + "Place\tWeather\tBonusTime\tisExtended\tisShootOut\tGameType\tScore\tFoul\tBallOccupation\tCard\tCornerKick\tPenaltyKick\tThrowing\tUniformColor\tFreekick"+ "\n"
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
						break;
					case "weather":
						gameList = gameDAO.selectByWeather(condition);
						break;
					case "is_extended":
						gameList = gameDAO.selectByExtended(Boolean.parseBoolean(condition));
						break;
					case "is_shoot_out":
						gameList = gameDAO.selectByShootOut(Boolean.parseBoolean(condition));
						break;
					case "type":
						gameList = gameDAO.selectByGameType(condition);
						break;
					case "extended":
						gameList = gameDAO.selectByExtended(Boolean.parseBoolean(condition));
						break;
					case "score upper":
						gameList = gameDAO.selectByScoreUpper(Integer.parseInt(condition));
						break;
					case "score lower":
						gameList = gameDAO.selectByScoreLower(Integer.parseInt(condition));
						break;
					case "throwing upper":
						gameList = gameDAO.selectByThrowingUpper(Integer.parseInt(condition));
						break;
					case "throwing lower":
						gameList = gameDAO.selectByThrowingLower(Integer.parseInt(condition));
						break;
					case "foul upper":
						gameList = gameDAO.selectByFoulUpper(Integer.parseInt(condition));
						break;
					case "foul lower":
						gameList = gameDAO.selectByFoulLower(Integer.parseInt(condition));
						break;
					case "card upper":
						gameList = gameDAO.selectByCardUpper(Integer.parseInt(condition));
						break;
					case "card lower":
						gameList = gameDAO.selectByCardLower(Integer.parseInt(condition));
						break;
					case "cornerkick upper":
						gameList = gameDAO.selectByCornerKickUpper(Integer.parseInt(condition));
						break;
					case "cornerkick lower":
						gameList = gameDAO.selectByFreekickLower(Integer.parseInt(condition));
						break;
					case "freekick upper":
						gameList = gameDAO.selectByFreekickUpper(Integer.parseInt(condition));
						break;
					case "freekick lower":
						gameList = gameDAO.selectByCornerKickLower(Integer.parseInt(condition));
						break;
					case "penaltykick upper":
						gameList = gameDAO.selectByPenaltykickUpper(Integer.parseInt(condition));
						break;
					case "penaltykick lower":
						gameList = gameDAO.selectByPenaltykickLower(Integer.parseInt(condition));
						break;
					case "uniform color":
						gameList = gameDAO.selectByUniformColor(condition);
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
		

		
		return temp;
	}
	@Override
	public int count(String attribute, String condition) {
		// TODO Auto-generated method stub
		return 0;
	}
	public static GameController getController() {
		return controller;
	}
	
	void getData() {
		itr = gameList.iterator();
		temp += column_name;
		while(itr.hasNext()) {
			game = itr.next();
			temp += game.getgame_place() + "\t" + game.getGame_id()+ "\t" + game.getgame_time() + "\t"
			+ game.getgame_weather() + "\t"+ game.getgame_bonus_time() + "\t"+ game.isgame_is_extended()
			+ "\t"+ game.isgame_is_shoot_out() + "\t"+ game.getGame_type()
			+ "\t"+ game.getgame_score() + "\t"+ game.getgame_foul() + "\t"+ game.getgame_ball_occupation()
			+ "\t" + game.getgame_card() + "\t"+ game.getgame_corner_kick() + "\t"+ game.getgame_penalty_kick() + "\t"
			+ game.getgame_throwing() + "\t"+ game.getgame_uniform_color() + "\t"+"\n";
		}
	}
	
	
}

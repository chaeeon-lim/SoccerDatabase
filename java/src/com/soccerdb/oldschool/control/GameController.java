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
	String temp = "";
	String column_name = "Name\t" + "Nationality\t" + "Debut\t"+"Birthday" + "\n"
						+ "----\t--------\t-----\t--------"+"\n";
	
	
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
						getData();
						break;
					case "weather":
						gameList = gameDAO.selectByWeather(condition);
						getData();
						break;
					case "is_extended":
						gameList = gameDAO.selectByExtended(Boolean.parseBoolean(condition));
						break;
					case "is_shoot_out":
						gameList = gameDAO.selectByShootOut(Boolean.parseBoolean(condition));
						getData();
						break;
					case "type":
						gameList = gameDAO.selectByGameType(condition);
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
	@Override
	public void init() {
		temp = "";
		
	}
	@Override
	public int insert(Game entity) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void update(Game entity) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete(Game entity) {
		// TODO Auto-generated method stub
		
	}
}

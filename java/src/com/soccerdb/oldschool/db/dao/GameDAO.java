package com.soccerdb.oldschool.db.dao;
import java.util.List;
import java.util.Date;


import com.soccerdb.oldschool.db.entity.Game;
import com.soccerdb.oldschool.db.source.GenericDAO;

public interface GameDAO extends GenericDAO<Game, Integer>{
    //TODO please give dditional methods for 'Game' entity.

	public List<Game> selectById(String game_id) throws Exception;
	public List<Game> selectByGameTime(Date game_time) throws Exception;
	public List<Game> selectByPlace(String place) throws Exception;
	public List<Game> selectByWeather(String weather) throws Exception;
	public List<Game> selectByExtended(boolean is_extended) throws Exception;
	public List<Game> selectByShootOut(boolean is_shoot_out) throws Exception;
	public List<Game> selectByGameType(String type) throws Exception;
	public void updateGame(Game game) throws Exception;
	public void deleteGame(Game game) throws Exception;
}
package com.soccerdb.oldschool.db.dao;


import java.util.Date;
import java.util.List;

import com.soccerdb.oldschool.db.entity.Appear;
import com.soccerdb.oldschool.db.source.GenericDAO;

public interface AppearDAO extends GenericDAO<Appear, Integer>{
    //TODO please give additional methods for 'Appear' entity.
    
	public Appear selectByAppear(Appear appear) throws Exception;
	public void deleteByAppear(Appear appear) throws Exception;
	
	public List<Appear> selectByPlayerId(int player_id) throws Exception;
	public List<Appear> selectByGameId(int game_id) throws Exception; 
	public List<Appear> selectBySeasonId(int season_id) throws Exception; 
	public List<Appear> selectByStartTimeBetween(Date time1, Date time2) throws Exception; 
	public List<Appear> selectByEndTimeBetween(Date time1, Date time2) throws Exception; 
	public List<Appear> selectByInGamePosition(String position) throws Exception; 
	public List<Appear> selectByGoalsMoreThan(int goals) throws Exception; 
	public List<Appear> selectByAssistMoreThan(int assist) throws Exception; 
	public List<Appear> selectBySaveMoreThan(int save) throws Exception;
	public List<Appear> selectByFoulMoreThan(int foul) throws Exception; 
	public List<Appear> selectByCardMoreThan(int card) throws Exception; 
	public List<Appear> selectByDistanceMoreThan(float distance) throws Exception; 

	public int CountAllAppears() throws Exception;
	public int CountByStartTimeBetween(Date time1, Date time2) throws Exception; 
	public int CountByEndTimeBetween(Date time1, Date time2) throws Exception; 
	public int CountByInGamePosition(String position) throws Exception; 
	public int CountByGoalsMoreThan(int goals) throws Exception; 
	public int CountByAssistMoreThan(int assist) throws Exception; 
	public int CountBySaveMoreThan(int save) throws Exception;
	public int CountByFoulMoreThan(int foul) throws Exception; 
	public int CountByCardMoreThan(int card) throws Exception; 
	public int CountByDistanceMoreThan(float distance) throws Exception; 
	
	public List<Appear> orderByPlayerId() throws Exception; 
	public List<Appear> orderByGameId() throws Exception; 
	public List<Appear> orderBySeasonId() throws Exception; 
	public List<Appear> orderByStartTime() throws Exception; 
	public List<Appear> orderByEndTime() throws Exception; 
	public List<Appear> orderByGoals() throws Exception; 
	public List<Appear> orderByAssist() throws Exception; 
	public List<Appear> orderBySave() throws Exception; 
	public List<Appear> orderByFoul() throws Exception; 
	public List<Appear> orderByCard() throws Exception; 
	public List<Appear> orderByDistance() throws Exception; 
	
	public List<Appear> orderByPlayerIdDESC() throws Exception; 
	public List<Appear> orderByGameIdDESC() throws Exception; 
	public List<Appear> orderBySeasonIdDESC() throws Exception; 
	public List<Appear> orderByStartTimeDESC() throws Exception; 
	public List<Appear> orderByEndTimeDESC() throws Exception; 
	public List<Appear> orderByGoalsDESC() throws Exception; 
	public List<Appear> orderByAssistDESC() throws Exception; 
	public List<Appear> orderBySaveDESC() throws Exception; 
	public List<Appear> orderByFoulDESC() throws Exception; 
	public List<Appear> orderByCardDESC() throws Exception; 
	public List<Appear> orderByDistanceDESC() throws Exception; 
}
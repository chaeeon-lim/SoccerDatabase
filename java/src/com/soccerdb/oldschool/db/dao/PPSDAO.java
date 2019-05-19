package com.soccerdb.oldschool.db.dao;
import java.util.List;

import com.soccerdb.oldschool.db.entity.Player_per_Season;
import com.soccerdb.oldschool.db.source.GenericDAO;

public interface PPSDAO extends GenericDAO<Player_per_Season, Integer>{
    //TODO please give aditional methods for 'Match' entity.

	public Player_per_Season selectByPPS(Player_per_Season pps) throws Exception;
	public void deleteByPPS(Player_per_Season pps) throws Exception;
	public List<Player_per_Season> searchPPSWhoseHeightIs(Player_per_Season pps) throws Exception;
	public List<Player_per_Season> searchPPSWhoseShorterThan(Player_per_Season pps) throws Exception;
	public List<Player_per_Season> searchPPSWhoseTallerThan(Player_per_Season pps) throws Exception;
	public List<Player_per_Season> searchPPSWhoseWeightIs(Player_per_Season pps) throws Exception;
	public List<Player_per_Season> searchPPSWhoseLighterThan(Player_per_Season pps) throws Exception;
	public List<Player_per_Season> searchPPSWhoseHeavierThan(Player_per_Season pps) throws Exception;
	public List<Player_per_Season> searchPPSWhosePositionIs(Player_per_Season pps) throws Exception;
	public List<Player_per_Season> searchPPSWhoseGoalsAre(Player_per_Season pps) throws Exception;
	public List<Player_per_Season> searchPPSWhoseGoalsLessThan(Player_per_Season pps) throws Exception;
	public List<Player_per_Season> searchPPSWhoseGoalsMoreThan(Player_per_Season pps) throws Exception;
	public List<Player_per_Season> searchPPSWhoseAssistsAre(Player_per_Season pps) throws Exception;
	public List<Player_per_Season> searchPPSWhoseAssistsLessThan(Player_per_Season pps) throws Exception;
	public List<Player_per_Season> searchPPSWhoseAssistsMoreThan(Player_per_Season pps) throws Exception;
	public List<Player_per_Season> searchPPSWhoseSavesAre(Player_per_Season pps) throws Exception;
	public List<Player_per_Season> searchPPSWhoseSavesLessThan(Player_per_Season pps) throws Exception;
	public List<Player_per_Season> searchPPSWhoseSavesMoreThan(Player_per_Season pps) throws Exception;
	public List<Player_per_Season> searchPPSWhoseGamesAre(Player_per_Season pps) throws Exception;
	public List<Player_per_Season> searchPPSWhoseGamesLessThan(Player_per_Season pps) throws Exception;
	public List<Player_per_Season> searchPPSWhoseGamesMoreThan(Player_per_Season pps) throws Exception;
	public List<Player_per_Season> searchPPSWhoseCardsAre(Player_per_Season pps) throws Exception;
	public List<Player_per_Season> searchPPSWhoseCardsLessThan(Player_per_Season pps) throws Exception;
	public List<Player_per_Season> searchPPSWhoseCardsMoreThan(Player_per_Season pps) throws Exception;
	public List<Player_per_Season> searchPPSWhoseFoulsAre(Player_per_Season pps) throws Exception;
	public List<Player_per_Season> searchPPSWhoseFoulsLessThan(Player_per_Season pps) throws Exception;
	public List<Player_per_Season> searchPPSWhoseFoulsMoreThan(Player_per_Season pps) throws Exception;
	public List<Player_per_Season> searchPPSOrderBySeason(Player_per_Season pps) throws Exception;
	public List<Player_per_Season> searchPPSOrderByPosition(Player_per_Season pps) throws Exception;
	public List<Player_per_Season> searchPPSOrderByHeight(Player_per_Season pps) throws Exception;
	public List<Player_per_Season> searchPPSOrderByWeight(Player_per_Season pps) throws Exception;
	public List<Player_per_Season> searchPPSOrderByGoals(Player_per_Season pps) throws Exception;
	public List<Player_per_Season> searchPPSOrderByAssists(Player_per_Season pps) throws Exception;
	public List<Player_per_Season> searchPPSOrderBySaves(Player_per_Season pps) throws Exception;
	public List<Player_per_Season> searchPPSOrderByGames(Player_per_Season pps) throws Exception;
	public List<Player_per_Season> searchPPSOrderByCards(Player_per_Season pps) throws Exception;
	public List<Player_per_Season> searchPPSOrderByFouls(Player_per_Season pps) throws Exception;
	public List<Player_per_Season> searchPPSOrderBySeasonDesc(Player_per_Season pps) throws Exception;
	public List<Player_per_Season> searchPPSOrderByPositionDesc(Player_per_Season pps) throws Exception;
	public List<Player_per_Season> searchPPSOrderByHeightDesc(Player_per_Season pps) throws Exception;
	public List<Player_per_Season> searchPPSOrderByWeightDesc(Player_per_Season pps) throws Exception;
	public List<Player_per_Season> searchPPSOrderByGoalsDesc(Player_per_Season pps) throws Exception;
	public List<Player_per_Season> searchPPSOrderByAssistsDesc(Player_per_Season pps) throws Exception;
	public List<Player_per_Season> searchPPSOrderBySavesDesc(Player_per_Season pps) throws Exception;
	public List<Player_per_Season> searchPPSOrderByGamesDesc(Player_per_Season pps) throws Exception;
	public List<Player_per_Season> searchPPSOrderByCardsDesc(Player_per_Season pps) throws Exception;
	public List<Player_per_Season> searchPPSOrderByFoulsDesc(Player_per_Season pps) throws Exception;
	public int countAllPPS(Player_per_Season pps) throws Exception;
	public int sumOfPlayerGoals(Player_per_Season pps) throws Exception;
	public int sumOfPlayerAssists(Player_per_Season pps) throws Exception;
	public int sumOfPlayerSaves(Player_per_Season pps) throws Exception;
	public int sumOfPlayerGames(Player_per_Season pps) throws Exception;
	public int sumOfPlayerCards(Player_per_Season pps) throws Exception;
	public int sumOfPlayerFouls(Player_per_Season pps) throws Exception;
}
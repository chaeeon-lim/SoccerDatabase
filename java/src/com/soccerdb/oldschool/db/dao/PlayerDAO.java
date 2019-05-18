package com.soccerdb.oldschool.db.dao;
import java.util.List;

import com.soccerdb.oldschool.db.entity.Player;
import com.soccerdb.oldschool.db.source.GenericDAO;

public interface PlayerDAO extends GenericDAO<Player, Integer>{
    //TODO please give additional methods for 'Player' entity.
	
	public List<Player> selectByNationality(String nationality) throws Exception;
	public List<Player> selectByLetterForName(String name) throws Exception;
	public List<Player> selectByBirthday(String birthday) throws Exception;
	public List<Player> searchPlayerDebutAtThisYear(int player_debut) throws Exception;
	public List<Player> searchPlayerDebutAfterThisYear(int player_debut) throws Exception;
	public List<Player> searchPlayerDebutBeforeThisYear(int player_debut) throws Exception;
	public List<Player> searchPlayersOrderByName() throws Exception;
	public List<Player> searchPlayersOrderByNationality() throws Exception;
	public List<Player> searchPlayersOrderByDebut() throws Exception;
	public List<Player> searchPlayersOrderByBirthday() throws Exception;
	public List<Player> searchPlayersOrderByNameDesc() throws Exception;
	public List<Player> searchPlayersOrderByNationalityDesc() throws Exception;
	public List<Player> searchPlayersOrderByDebutDesc() throws Exception;
	public List<Player> searchPlayersOrderByBirthdayDesc() throws Exception;
	//public List<Player> searchPlayerOrderBy(Player player) throws Exception;
	public int calculatePlayerAge(int player_id) throws Exception;
	public int countAllPlayers() throws Exception;
	public int countAllPlayerWithCountry(String player_nationality) throws Exception;
	public int countAllPlayerWithDebutYear(int player_debut);
	public int countAllPlayerWithBirthday(String player_birthday) throws Exception;
	public int countAllPlayersSameAge(int player_debut) throws Exception;
	public List<Player> searchAllPlayersSameAge(int player_debut) throws Exception;
	public int countAllPlayersUnderAge(int player_debut) throws Exception;
	public List<Player> searchAllPlayersUnderAge(int player_debut) throws Exception;
	public int countAllPlayersOverAge(int player_debut) throws Exception;
	public List<Player> searchAllPlayersOverAge(int player_debut) throws Exception;
	
	
}
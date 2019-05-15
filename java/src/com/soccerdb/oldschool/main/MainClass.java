package com.soccerdb.oldschool.main;


import com.soccerdb.oldschool.view.MainView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.soccerdb.oldschool.db.dao.AppearDAO;
import com.soccerdb.oldschool.db.dao.ClubDAO;
import com.soccerdb.oldschool.db.dao.ContractDAO;
import com.soccerdb.oldschool.db.dao.ImplAppearDAO;
import com.soccerdb.oldschool.db.dao.ImplClubDAO;
import com.soccerdb.oldschool.db.dao.ImplContractDAO;
import com.soccerdb.oldschool.db.dao.ImplPPSDAO;
import com.soccerdb.oldschool.db.dao.ImplPlayerDAO;
import com.soccerdb.oldschool.db.dao.ImplUserDAO;
import com.soccerdb.oldschool.db.dao.PPSDAO;
import com.soccerdb.oldschool.db.dao.PlayerDAO;
import com.soccerdb.oldschool.db.dao.UserDAO;
import com.soccerdb.oldschool.db.entity.Appear;
import com.soccerdb.oldschool.db.entity.Club;
import com.soccerdb.oldschool.db.entity.Contract;
import com.soccerdb.oldschool.db.entity.Player;
import com.soccerdb.oldschool.db.entity.Player_per_Season;
import com.soccerdb.oldschool.db.entity.User;
import com.soccerdb.oldschool.view.LoginView;
import com.soccerdb.oldschool.view.View;


/**
 * Please, do not test 'DELETE' query
 */

public class MainClass {

	public static void main(String[] args) throws Exception {
		Player_per_Season pps = new Player_per_Season();
		PPSDAO ppsDAO = new ImplPPSDAO();
		
		List<Player_per_Season> ppsList = new ArrayList<Player_per_Season>();
		Iterator<Player_per_Season> itr;
		pps.setPps_season_save(10);
		//print(""+pps.getPlayer_id());
		//pps.setSeason_id(94);
		
		print("*** \t pps for assists : 10 \t ***");
		ppsList = ppsDAO.searchPPSWhoseSavesAre(pps);
		itr = ppsList.iterator();
		while(itr.hasNext())print(itr.next().toString());
		
		
		print("*** \t pps for assists less than 85 \t ***");
		ppsList = ppsDAO.searchPPSWhoseSavesLessThan(pps);
		itr = ppsList.iterator();
		while(itr.hasNext())print(itr.next().toString());
		
		print("*** \t pps for assists greater than 175 \t ***");
		ppsList = ppsDAO.searchPPSWhoseSavesMoreThan(pps);
		itr = ppsList.iterator();
		while(itr.hasNext())print(itr.next().toString());
		
		
	/*
		int temp = playerDAO.calculatePlayerAge(35);
		player = playerDAO.selectById(35);
		print("Age of " + player.getPlayer_name() + " : " + temp);
		
		temp = playerDAO.countAllPlayers();
		print("Number of Players in the database : " + temp);
		
		temp = playerDAO.countAllPlayerWithCountry("Germany");
		print("Number of Players from Germany : " + temp);
		
		temp = playerDAO.countAllPlayerWithDebutYear(2005);
		print("Number of Players debut at 2005 : " + temp);
		
		
		temp = playerDAO.countAllPlayerWithBirthday("1985-09-07");
		print("Number of Players whose birthday is 1985-09-07 : " + temp);
		
		
		temp = playerDAO.countAllPlayersSameAge(26);
		print("Number of Players whose age is 26 : " + temp);
		*/
		
		/*

		temp = playerDAO.countAllPlayersUnderAge(30);
		print("Number of Players whose age is under 26 : " + temp);
		

		playerList = playerDAO.searchAllPlayersUnderAge(30);
		itr = playerList.iterator();
		print("**** \t  All Players whose age is under 26  \t ****");
		while(itr.hasNext()) print(itr.next().toString());

		temp = playerDAO.countAllPlayersOverAge(40);
		print("Number of Players whose age is over 40 : " + temp);
		

		playerList = playerDAO.searchAllPlayersOverAge(40);
		itr = playerList.iterator();
		print("**** \t  All Players whose age is over 40  \t ****");
		while(itr.hasNext()) print(itr.next().toString());
		*/
	}
	
	public static void print(String message) {
		System.out.println(message);
	}
	
	public static void printInt(int i) {
		System.out.println(i);
	}
	
	public static void printStr(String mesg) {
		System.out.println(mesg);
	}

	public static void printDate(Date mesg) {
		System.out.println(mesg);
	}
}

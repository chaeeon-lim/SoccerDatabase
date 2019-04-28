package com.soccerdb.oldschool.main;

import java.util.List;

import com.soccerdb.oldschool.db.dao.PlayerDAO;
import com.soccerdb.oldschool.db.dao.ImplPlayerDAO;
import com.soccerdb.oldschool.db.entity.Player;

/**
 * Please, do not test 'DELETE' query
 */

public class MainClass {

	public static void main(String[] args) {
		
		PlayerDAO playerDAO = new ImplPlayerDAO();
		Player player = new Player();
        
        /*
        // Test codes for trying 'INSERT' query.
		try {
			player.setPlayer_name("hellodummy");
			
			playerDAO.insert(player);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        */
        
        /*
        // Test codes for trying 'SELECT * FROM Player WHERE player_id = ?'
		try {
			player = playerDAO.select(1);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		*/
        
        /*
        // Test codes for trying 'UPDATE' query
		try {
			player = playerDAO.selectById(17);
			printout(player.getPlayer_name());
			printout(player.getPlayer_email());
			//player.setId(4);
			player.setPlayer_account("dumbo");
			player.setPlayer_passwd("dummydumbdumb");
			player.setPlayer_name("dummy1");
			player.setPlayer_email("ddsfu2@dummies.com");
			
			playerDAO.update(player);
		}catch(Exception e) {
			e.printStackTrace();
		}
		*/
		
		/*
		try {
			playerDAO.delete(23);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		*/

		try {
			List<Player> players = playerDAO.selectAll();
			
			for(int i = 0 ; i < players.size() ; i++) {
				System.out.println(players.get(i).toString());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void printout(String message) {
		System.out.println(message);
	}
}

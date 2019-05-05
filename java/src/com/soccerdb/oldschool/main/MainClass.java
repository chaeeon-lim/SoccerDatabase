package com.soccerdb.oldschool.main;

import java.text.SimpleDateFormat;
import java.util.List;

import com.soccerdb.oldschool.db.dao.PlayerDAO;
import com.soccerdb.oldschool.db.dao.SeasonDAO;
import com.soccerdb.oldschool.db.dao.ImplPlayerDAO;
import com.soccerdb.oldschool.db.dao.ImplSeasonDAO;
import com.soccerdb.oldschool.db.dao.KeeperDAO;
import com.soccerdb.oldschool.db.dao.FieldplayerDAO;
import com.soccerdb.oldschool.db.dao.ImplFieldplayerDAO;
import com.soccerdb.oldschool.db.dao.ImplKeeperDAO;
import com.soccerdb.oldschool.db.entity.Fieldplayer;
import com.soccerdb.oldschool.db.entity.Keeper;
import com.soccerdb.oldschool.db.entity.Player;
import com.soccerdb.oldschool.db.entity.Season;


/**
 * Please, do not test 'DELETE' query
 */

public class MainClass {

	public static void main(String[] args) {
		
		PlayerDAO playerDAO = new ImplPlayerDAO();
		Player player = new Player();
		
		
		try {
			List<Player> players = playerDAO.selectByLetterForName("%o%");
			printout("***** List of Players. ******");
			for(int i = 0 ; i < players.size() ; i++) {
				System.out.println(players.get(i).toString());
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		/*
        Keeper gk = new Keeper();
        KeeperDAO keeperDAO = new ImplKeeperDAO();
        FieldplayerDAO fieldDAO = new ImplFieldplayerDAO();
        Fieldplayer field = new Fieldplayer();
        SeasonDAO seasonDAO = new ImplSeasonDAO();
        Season Season = new Season();
        */
        /*
        try {
        	field.setPlayer_id(4);
        	field.setPlayer_total_goal(83);
        	field.setPlayer_total_assist(27);
        	fieldDAO.insert(field);
        	
        } catch(Exception e) {
        	e.printStackTrace();
        }
        */
        
        // Test codes for trying 'INSERT' query.
		/*
		try {
			player.setPlayer_id(4);
			player.setPlayer_name("Son Heung-min");
			player.setPlayer_position("FM-MF (WM)");
			player.setPlayer_height(183);
			player.setPlayer_weight(76);
			player.setPlayer_nationality("Korea Republic");
			player.setPlayer_debut(2010);
			player.setPlayer_birthday(new SimpleDateFormat("yyyy-MM-dd").parse("1992-07-08"));
			player.setPlayer_total_card(14);
			player.setPlayer_total_game(264);
			player.setPlayer_total_foul(153);


			
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
/*
		try {
			List<Player> players = playerDAO.selectAll();
			List<Keeper> keepers = keeperDAO.selectAll();
			List<Fieldplayer> fields = fieldDAO.selectAll();
			List<Season> seasons = seasonDAO.selectAll();
			
			printout("***** List of Players. ******");
			for(int i = 0 ; i < players.size() ; i++) {
				System.out.println(players.get(i).toString());
			}
			
			printout("***** List of Goal Keepers. ******");
			for(int i = 0 ; i < keepers.size() ; i++) {
				System.out.println(keepers.get(i).toString());
			}
			
			printout("***** List of Field Players. ******");
			for(int i = 0 ; i < fields.size() ; i++) {
				System.out.println(fields.get(i).toString());
			}
			
			printout("***** List of Seasons. ******");
			for(int i = 0 ; i < seasons.size() ; i++) {
				System.out.println(seasons.get(i).toString());
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	*/	
	}
	
	
	public static void printout(String message) {
		System.out.println(message);
	}
}

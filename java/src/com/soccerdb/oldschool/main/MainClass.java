package com.soccerdb.oldschool.main;

import com.soccerdb.oldschool.view.MainView;

/**
 * Please, do not test 'DELETE' query
 */

public class MainClass {

	public static void main(String[] args) {
		
//		View view = new LoginView();
//		LoginController loginController = new LoginController();

		MainView mainView = new MainView();

		mainView.showDB();
		
		/*
		UserDAO userDAO = new ImplUserDAO();
		User user = new User();
		try {
			user.setUser_name("djfi");
			user.setUser_password("2rjid");
			userDAO.insert(user);
			List<User> users = userDAO.selectAll();
			for(int i = 0 ; i < users.size(); i++) {
				System.out.println(users.get(i).toString());
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		*/
		//PlayerDAO playerDAO = new ImplPlayerDAO();
		//Player player = new Player();
		
		/*
		FieldplayerDAO fieldDAO = new ImplFieldplayerDAO();
        Fieldplayer field = new Fieldplayer();
		
		try {
			field.setPlayer_id(4);
			field.setPlayer_total_assist(0);
			field.setPlayer_total_goal(0);
			fieldDAO.update(field);
			List<Fieldplayer> fields = fieldDAO.selectAll();
			for(int i = 0 ; i < fields.size() ; i++) {
				System.out.println(fields.get(i).toString());
			}
		} catch ( Exception e){
			e.printStackTrace();
		}
		*/
		/*
		try {
			List<Player> players = playerDAO.selectByLetterForName("%o%");
			printout("***** List of Players. ******");
			for(int i = 0 ; i < players.size() ; i++) {
				System.out.println(players.get(i).toString());
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
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
			player.setPlayer_id(1);
			//player.setPlayer_name("Son Heung-min");
			//player.setPlayer_position("FM-MF (WM)");
			//player.setPlayer_height(183);
			//player.setPlayer_weight(76);
			//player.setPlayer_nationality("Korea Republic");
			//player.setPlayer_debut(2010);
			//player.setPlayer_birthday(new SimpleDateFormat("yyyy-MM-dd").parse("1992-07-08"));
			player.setPlayer_total_card(999);
			player.setPlayer_total_game(999);
			player.setPlayer_total_foul(999);


			
			playerDAO.update(player);
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

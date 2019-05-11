package com.soccerdb.oldschool.main;


import com.soccerdb.oldschool.view.MainView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.soccerdb.oldschool.db.dao.AppearDAO;
import com.soccerdb.oldschool.db.dao.ClubDAO;
import com.soccerdb.oldschool.db.dao.ContractDAO;
import com.soccerdb.oldschool.db.dao.ImplAppearDAO;
import com.soccerdb.oldschool.db.dao.ImplClubDAO;
import com.soccerdb.oldschool.db.dao.ImplContractDAO;
import com.soccerdb.oldschool.db.entity.Appear;
import com.soccerdb.oldschool.db.entity.Club;
import com.soccerdb.oldschool.db.entity.Contract;
import com.soccerdb.oldschool.view.LoginView;
import com.soccerdb.oldschool.view.View;


/**
 * Please, do not test 'DELETE' query
 */

public class MainClass {

	public static void main(String[] args) throws Exception {
		
		/*
		ContractDAO contractDAO = new ImplContractDAO(); 
		Contract contract = new Contract(); 
		
		contract.setClub_id(1);
		contract.setPlayer_id(3);
		contract.setSeason_id(1);
		contract.setSalary(20);
		contract.setYear_contract(7);
		
		contractDAO.update(contract);
		*/
		/*
		Contract contract1 = new Contract(); 
		contract1 = contractDAO.selectByContract(contract); 
		printInt(contract1.getClub_id()); 
		printInt(contract1.getPlayer_id()); 
		printInt(contract1.getSeason_id()); 
		*/
		//contractDAO.deleteByContract(contract);
		//contractDAO.insert(contract);
		/*
		List<Contract>  contracts = contractDAO.selectAll();

		
		printStr("*** List of Contracts. ***"); 
		try {
			for(int i = 0; i < contracts.size(); i++) {
				System.out.println(contracts.get(i).toString()); 
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	*/
/*
		AppearDAO appearDAO = new ImplAppearDAO(); 
		Appear appear = new Appear(); 
		
		try {
			appear.setPlayer_id(2);
			appear.setGame_id(2); 
			appear.setSeason_id(1); 
			appear.setStart_time(new SimpleDateFormat("hh:mm:ss").parse("01:30:18"));
			appear.setEnd_time(new SimpleDateFormat("hh:mm:ss").parse("03:30:18"));
			appear.setIn_game_position("mf");
			//appear.setGoals(1);
			//appear.setAssist(1);
			//appear.setSave(0);
			//appear.setFoul(3);
			//appear.setCard(1);
			//appear.setDistance(20);
			
			Appear appear1 = new Appear(); 
			appear1 = appearDAO.selectByAppear(appear); 
			//appearDAO.deleteByAppear(appear);
			//appearDAO.insert(appear);
			appearDAO.update(appear);
			printDate(appear1.getEnd_time()); 
			
			System.out.println(appear.getStart_time()); 
			System.out.println(appear.getEnd_time()); 
			
			List<Appear> appears = appearDAO.selectAll();
			System.out.println(appears.size()); 
			
			printStr("*** List of Appears. ***"); 
			for(int i = 0; i < appears.size(); i++) {
				System.out.println(appears.get(i).toString()); 
			}
	
			}catch (Exception e) {
				e.printStackTrace();
			}
		
*/
		
		ClubDAO clubDAO = new ImplClubDAO(); 
		Club club = new Club(); 
		
		try {
			club.setClub_id(7); 
			club.setClub_fullname("namynamy1234"); 
			club.setClub_ground("Carcelona"); 
			club.setClub_nickname("namy1234");
			club.setClub_owner("Obama"); 
			club.setClub_chairman("Halsey");
			club.setClub_manager("HK");
			club.setClub_logo("JPG00000011111123444444");
			
			clubDAO.insert(club);
			//clubDAO.delete(5);
			//clubDAO.update(club);
			Club club1 = new Club(); 
			club1 = clubDAO.selectById(4); 
			printStr(club1.getClub_ground()); 
			List<Club> clubs = clubDAO.selectAll();
			printStr("*** List of Clubs. ***"); 
			for(int i = 0; i < clubs.size(); i++) {
				System.out.println(clubs.get(i).toString()); 
			}
	
			}catch (Exception e) {
				e.printStackTrace();
			}
		
		
<<<<<<< HEAD
		//View view = new LoginView();
=======

//		View view = new LoginView();
//		LoginController loginController = new LoginController();

		MainView mainView = new MainView();

		mainView.sho
>>>>>>> upstream/ver4.0.0
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

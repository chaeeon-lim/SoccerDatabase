package com.soccerdb.oldschool.view;

import java.io.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.text.SimpleDateFormat;

import com.soccerdb.oldschool.db.dao.*;
import com.soccerdb.oldschool.db.entity.*;

public class AdminView {
	JLabel adminMenu = new JLabel("Administrator Menu");
	JButton insertButton = new JButton("Insert");
	JButton updateButton = new JButton("Update");
	JButton deleteButton = new JButton("Delete");
//	JTextArea typeText1 = new JTextArea("", 1, 55);
//	JTextArea typeText2 = new JTextArea("", 1, 10);
//	JTextArea typeText3 = new JTextArea("", 1, 10);
	JButton seasonsButton = new JButton("Season");
	JButton leaguesButton = new JButton("League");
	JButton clubsButton = new JButton("Club");
	JButton playersButton = new JButton("Player");
	JButton appearButton = new JButton("Appear");
	JButton btlButton = new JButton("Belong_to_League");
	JButton contractButton = new JButton("Contract");
	JButton gameButton = new JButton("Game");
	JButton matchButton = new JButton("Match");
	JButton ppsButton = new JButton("Player_per_Season");
	JButton userButton = new JButton("User");
	JTextArea text = new JTextArea("", 20, 75);
	JScrollPane sp = new JScrollPane(text);
	JButton cancelButton = new JButton("Cancel All");

	JButton[] entityButtons = {appearButton, btlButton, clubsButton, contractButton, gameButton, 
									leaguesButton, matchButton, playersButton, seasonsButton, ppsButton, userButton};
	JButton[] enterButtons = {insertButton, updateButton, deleteButton};
//	JTextArea[] typeTexts = {typeText1, typeText2, typeText3};


	JTextArea attribute1 = new JTextArea("", 1, 55);
	JTextArea attribute2 = new JTextArea("", 1, 10);
	JTextArea attribute3 = new JTextArea("", 1, 10);
	JTextArea attribute4 = new JTextArea("", 1, 15);
	JTextArea attribute5 = new JTextArea("", 1, 15);
	JTextArea attribute6 = new JTextArea("", 1, 15);
	JTextArea attribute7 = new JTextArea("", 1, 15);
	JTextArea attribute8 = new JTextArea("", 1, 15);
	JTextArea attribute9 = new JTextArea("", 1, 15);
	JTextArea attribute10 = new JTextArea("", 1, 15);
	JTextArea attribute11 = new JTextArea("", 1, 15);
	JTextArea attribute12 = new JTextArea("", 1, 15);
	JTextArea attribute13 = new JTextArea("", 1, 15);
	JTextArea attribute14 = new JTextArea("", 1, 15);
	JTextArea attribute15 = new JTextArea("", 1, 15);
	JTextArea attribute16 = new JTextArea("", 1, 15);
	JTextArea attribute17 = new JTextArea("", 1, 25);

	JTextArea[] attributes = {attribute1, attribute2, attribute3, attribute4, attribute5, attribute6, 
								attribute7, attribute8, attribute9, attribute10, attribute11, attribute12, 
								attribute13, attribute14, attribute15, attribute16, attribute17};


	SeasonDAO seasonDAO = new ImplSeasonDAO();
	LeagueDAO leagueDAO = new ImplLeagueDAO();
	ClubDAO clubDAO = new ImplClubDAO();
	PlayerDAO playerDAO = new ImplPlayerDAO();
	AppearDAO appearDAO = new ImplAppearDAO();
	BTLDAO btlDAO = new ImplBTLDAO();
	ContractDAO contractDAO = new ImplContractDAO();
	GameDAO gameDAO = new ImplGameDAO();
	MatchDAO matchDAO = new ImplMatchDAO();
	PPSDAO ppsDAO = new ImplPPSDAO();
	UserDAO userDAO = new ImplUserDAO();

	JPanel menuPanel;
/*
	public void showMenu(JFrame frame){
		menuPanel = new JPanel(new BorderLayout(5,5));
		label = new JPanel(new GridLayout(0,1,2,2));

		label.add(new JLabel())
	}
*/
	public void showAdmin(JFrame frame, JPanel panel){
		frame.setTitle("Administrator Mode");
		frame.setSize(900, 600);

		insertButton.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent ae){

					if(clubsButton.isEnabled()){
						Scanner s1 = new Scanner(attribute1.getText());
						Scanner s2 = new Scanner(attribute2.getText());
						Scanner s3 = new Scanner(attribute3.getText());
						Scanner s4 = new Scanner(attribute4.getText());
						Scanner s5 = new Scanner(attribute5.getText());
						Scanner s6 = new Scanner(attribute6.getText());
						Scanner s7 = new Scanner(attribute7.getText());
						Scanner s8 = new Scanner(attribute8.getText());
						Club club = new Club();
						try{
							club.setClub_id(s1.nextInt());
							club.setClub_fullname(s2.next());
							club.setClub_ground(s3.next());
							club.setClub_nickname(s4.next());
							club.setClub_owner(s5.next());
							club.setClub_chairman(s6.next());
							club.setClub_manager(s7.next());
							club.setClub_logo(s8.next());
							clubDAO.insert(club);
						} catch(Exception ex){
							ex.printStackTrace();
						}
						s1.close();
						s2.close();
						s3.close();
						s4.close();
						s5.close();
						s6.close();
						s7.close();
						s8.close();
					}

					if(btlButton.isEnabled()){
						Scanner s1 = new Scanner(attribute1.getText());
						Scanner s2 = new Scanner(attribute2.getText());
						Belong_to_League  btl = new Belong_to_League();
						try{
							btl.setLeague_id(s1.nextInt());
							btl.setClub_id(s2.nextInt());
						} catch(Exception ex){
							ex.printStackTrace();
						}
						s1.close();
						s2.close();
					}

					if(contractButton.isEnabled()){
						Scanner s1 = new Scanner(attribute1.getText());
						Scanner s2 = new Scanner(attribute2.getText());
						Scanner s3 = new Scanner(attribute3.getText());
						Scanner s4 = new Scanner(attribute4.getText());
						Scanner s5 = new Scanner(attribute5.getText());
						Contract contract = new Contract();
						try{
							contract.setPlayer_id(s1.nextInt());
							contract.setClub_id(s2.nextInt());
							contract.setSeason_id(s3.nextInt());
							contract.setSalary(s4.nextFloat());
							contract.setDuration_contract(s5.nextInt());
							contractDAO.insert(contract);
						} catch(Exception ex){
							ex.printStackTrace();
						}

						s1.close();
						s2.close();
						s3.close();
						s4.close();
						s5.close();
					}

					if(matchButton.isEnabled()){
						Scanner s1 = new Scanner(attribute1.getText());
						Scanner s2 = new Scanner(attribute2.getText());
						Scanner s3 = new Scanner(attribute3.getText());
						Match match = new Match();
						try{
							match.setGame_id(s1.nextInt());
							match.setClub_id(s2.nextInt());
							match.setSeason_id(s3.nextInt());
							matchDAO.insert(match);
						} catch(Exception ex){
							ex.printStackTrace();
						}
						s1.close();
						s2.close();
						s3.close();
					}

					if(gameButton.isEnabled()){
						Scanner s1 = new Scanner(attribute1.getText());
						Scanner s2 = new Scanner(attribute2.getText());
						Scanner s3 = new Scanner(attribute3.getText());
						Scanner s4 = new Scanner(attribute4.getText());
						Scanner s5 = new Scanner(attribute5.getText());
						Scanner s6 = new Scanner(attribute6.getText());
						Scanner s7 = new Scanner(attribute7.getText());
						Scanner s8 = new Scanner(attribute8.getText());
						Scanner s9 = new Scanner(attribute9.getText());
						Scanner s10 = new Scanner(attribute10.getText());
						Scanner s11 = new Scanner(attribute11.getText());
						Scanner s12 = new Scanner(attribute12.getText());
						Scanner s13 = new Scanner(attribute13.getText());
						Scanner s14 = new Scanner(attribute14.getText());
						Scanner s15 = new Scanner(attribute15.getText());
						Scanner s16 = new Scanner(attribute16.getText());
						Game game = new Game();
						try{
							game.setGame_id(s1.nextInt());
							game.setgame_time(new SimpleDateFormat("yyyy-MM-dd").parse(s2.next()));
							game.setgame_place(s3.next());
							game.setgame_weather(s4.next());
							game.setgame_bonus_time(s5.nextInt());
							game.setgame_is_extended(Boolean.parseBoolean(s6.next()));
							game.setgame_is_shoot_out(Boolean.parseBoolean(s7.next()));
							game.setGame_type(s8.next());
							game.setgame_score(s9.nextInt());
							game.setgame_foul(s10.nextInt());
							game.setgame_ball_occupation(s11.nextInt());
							game.setgame_card(s12.nextInt());
							game.setgame_corner_kick(s13.nextInt());
							game.setgame_penalty_kick(s14.nextInt());
							game.setgame_throwing(s15.nextInt());
							game.setgame_uniform_color(s16.next());
							gameDAO.insert(game);
						} catch(Exception ex){
							ex.printStackTrace();
						}
						s1.close();
						s2.close();
						s3.close();
						s4.close();
						s5.close();
						s6.close();
						s7.close();
						s8.close();
						s9.close();
						s10.close();
						s11.close();
						s12.close();
						s13.close();
						s14.close();
						s15.close();
						s16.close();
					}
					
					if(seasonsButton.isEnabled()){
						Scanner s1 = new Scanner(attribute1.getText());
						Season season = new Season();
						try{
							season.setSeason_year(s1.nextInt());
							seasonDAO.insert(season);
						} catch(Exception ex){
							ex.printStackTrace();
						}
						s1.close();
					}

					if(leaguesButton.isEnabled()){
						Scanner s1 = new Scanner(attribute1.getText());
						Scanner s2 = new Scanner(attribute2.getText());
						League league = new League();
						try{
							league.setLeague_id(s1.nextInt());
							league.setLeague_name(s2.next());
							leagueDAO.insert(league);
						} catch(Exception ex){
							ex.printStackTrace();
						}
						s1.close();
						s2.close();
					}

					if(appearButton.isEnabled()){
						Scanner s1 = new Scanner(attribute1.getText());
						Scanner s2 = new Scanner(attribute2.getText());
						Scanner s3 = new Scanner(attribute3.getText());
						Scanner s4 = new Scanner(attribute4.getText());
						Scanner s5 = new Scanner(attribute5.getText());
						Scanner s6 = new Scanner(attribute6.getText());
						Scanner s7 = new Scanner(attribute7.getText());
						Scanner s8 = new Scanner(attribute8.getText());
						Scanner s9 = new Scanner(attribute9.getText());
						Scanner s10 = new Scanner(attribute10.getText());
						Scanner s11 = new Scanner(attribute11.getText());
						Scanner s12 = new Scanner(attribute12.getText());
						Appear appear = new Appear();
						try{
							appear.setPlayer_id(s1.nextInt());
							appear.setSeason_id(s2.nextInt());
							appear.setGame_id(s3.nextInt());
							appear.setStart_time(new SimpleDateFormat("hh:mm:ss").parse(s4.next()));
							appear.setEnd_time(new SimpleDateFormat("hh:mm:ss").parse(s5.next()));
							appear.setIn_game_position(s6.next());
							appear.setGoals(s7.nextInt());
							appear.setAssist(s8.nextInt());
							appear.setSave(s9.nextInt());
							appear.setFoul(s10.nextInt());
							appear.setCard(s11.nextInt());
							appear.setDistance(s12.nextInt());
							appearDAO.insert(appear);
						} catch(Exception ex){
							ex.printStackTrace();
						}
						s1.close();
						s2.close();
						s3.close();
						s4.close();
						s5.close();
						s6.close();
						s7.close();
						s8.close();
						s9.close();
						s10.close();
						s11.close();
						s12.close();
					}

					if(playersButton.isEnabled()){
						Scanner s1 = new Scanner(attribute1.getText());
						Scanner s2 = new Scanner(attribute2.getText());
						Scanner s3 = new Scanner(attribute3.getText());
						Scanner s4 = new Scanner(attribute4.getText());
						Player player = new Player();
						try{
							player.setPlayer_name(s1.nextLine());
							player.setPlayer_nationality(s2.next());
							player.setPlayer_debut(s3.nextInt());
							player.setPlayer_birthday(new SimpleDateFormat("yyyy-MM-dd").parse(s4.next()));
							playerDAO.insert(player);
						} catch(Exception ex){
							ex.printStackTrace();
						}
						s1.close();
						s2.close();
						s3.close();
						s4.close();
					}

					if(userButton.isEnabled()){
						Scanner s1 = new Scanner(attribute1.getText());
						Scanner s2 = new Scanner(attribute2.getText());
						Scanner s3 = new Scanner(attribute3.getText());
						Scanner s4 = new Scanner(attribute4.getText());
						User user = new User();
						try{
							user.setUser_name(s1.next());
							user.setUser_account(s2.next());
							user.setUser_password(s3.next());
							user.setUser_email(s4.next());
							userDAO.insert(user);
						} catch(Exception ex){
							ex.printStackTrace();
						}
						s1.close();
						s2.close();
						s3.close();
						s4.close();
					}

					text.setText("");

					for(JButton buttons : entityButtons){
						buttons.setEnabled(true);
					}
					for(JButton buttons : enterButtons){
						buttons.setEnabled(false);
					}
					for(JTextArea textAreas : attributes){
						textAreas.setText("");
					}
					frame.setVisible(true);
				}
			}
		);

		updateButton.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent ae){
				/*
					if(leaguesButton.isEnabled()){
						try{
							League league = leagueDAO.selectById(s1.nextInt());
							league.setLeague_name(s2.next());
							leagueDAO.update(league);
						} catch(Exception ex){
							ex.printStackTrace();
						}
					}

					if(seasonsButton.isEnabled()){
						try{
							Season season = seasonDAO.selectById(s1.nextInt());
							season.setSeason_year(s2.nextInt());
							seasonDAO.update(season);
						} catch(Exception ex){
							ex.printStackTrace();
						}
					}

					if(clubsButton.isEnabled()){
						try{
							Club club = clubDAO.selectById(s1.nextInt());
							if(!(s2.next().equals("")))		club.setClub_fullname(s2.next());
							if(!(s3.next().equals("")))		club.setClub_ground(s3.next());
							if(!(s4.next().equals("")))		club.setClub_nickname(s4.next());
							if(!(s5.next().equals("")))		club.setClub_owner(s5.next());
							if(!(s6.next().equals("")))		club.setClub_chairman(s6.next());
							if(!(s7.next().equals("")))		club.setClub_manager(s7.next());
							if(!(s8.next().equals("")))		club.setClub_logo(s8.next());						
							clubDAO.update(club);
						} catch(Exception ex){
							ex.printStackTrace();
						}
					}*/

					text.setText("");

					for(JButton buttons : entityButtons){
						buttons.setEnabled(true);
					}
					for(JButton buttons : enterButtons){
						buttons.setEnabled(false);
					}
					for(JTextArea textAreas : attributes){
						textAreas.setText("");
					}
					frame.setVisible(true);
				}
			}
		);

		deleteButton.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent ae){

					if(appearButton.isEnabled()){
						Scanner s1 = new Scanner(attribute1.getText());
						Scanner s2 = new Scanner(attribute2.getText());
						Scanner s3 = new Scanner(attribute3.getText());
						try{
							Appear appear = new Appear();
							appear.setPlayer_id(s1.nextInt());
							appear.setSeason_id(s2.nextInt());
							appear.setGame_id(s3.nextInt());
							appearDAO.deleteByAppear(appear);
						} catch(Exception ex){
							ex.printStackTrace();
						}

						s1.close();
						s2.close();
						s3.close();
					}

					if(btlButton.isEnabled()){
						Scanner s1 = new Scanner(attribute1.getText());
						Scanner s2 = new Scanner(attribute2.getText());
						try{
							Belong_to_League btl = new Belong_to_League();
							btl.setLeague_id(s1.nextInt());
							btl.setClub_id(s2.nextInt());
							btlDAO.deleteByBTL(btl);
						} catch(Exception ex){
							ex.printStackTrace();
						}
						s1.close();
						s2.close();
					}

					if(contractButton.isEnabled()){
						Scanner s1 = new Scanner(attribute1.getText());
						Scanner s2 = new Scanner(attribute2.getText());
						Scanner s3 = new Scanner(attribute3.getText());
						try{
							Contract contract = new Contract();
							contract.setPlayer_id(s1.nextInt());
							contract.setClub_id(s2.nextInt());
							contract.setSeason_id(s3.nextInt());
							contractDAO.deleteByContract(contract);
						} catch(Exception ex){
							ex.printStackTrace();
						}						
						s1.close();
						s2.close();
						s3.close();
					}

					if(matchButton.isEnabled()){
						Scanner s1 = new Scanner(attribute1.getText());
						Scanner s2 = new Scanner(attribute2.getText());
						Scanner s3 = new Scanner(attribute3.getText());
						try{
							Match match = new Match();
							match.setGame_id(s1.nextInt());
							match.setClub_id(s2.nextInt());
							match.setSeason_id(s3.nextInt());
							matchDAO.deleteMatch(match);
						} catch(Exception ex){
							ex.printStackTrace();
						}
						s1.close();
						s2.close();
						s3.close();
					}

					if(playersButton.isEnabled()){
						Scanner s1 = new Scanner(attribute1.getText());
						try{
							playerDAO.delete(s1.nextInt());
						} catch(Exception ex){
							ex.printStackTrace();
						}
						s1.close();
					}

					if(seasonsButton.isEnabled()){
						Scanner s1 = new Scanner(attribute1.getText());
						try{
							seasonDAO.delete(s1.nextInt());
						} catch(Exception ex){
							ex.printStackTrace();
						}
						s1.close();
					}

					if(ppsButton.isEnabled()){
						Scanner s1 = new Scanner(attribute1.getText());
						Scanner s2 = new Scanner(attribute2.getText());
						try{
							Player_per_Season pps = new Player_per_Season();
							pps.setPlayer_id(s1.nextInt());
							pps.setSeason_id(s2.nextInt());
							ppsDAO.deleteByPPS(pps);
						} catch(Exception ex){
							ex.printStackTrace();
						}
						s1.close();
						s2.close();
					}

					if(clubsButton.isEnabled()){
						Scanner s1 = new Scanner(attribute1.getText());
						try{
							clubDAO.delete(s1.nextInt());
						} catch(Exception ex){
							ex.printStackTrace();
						}
						s1.close();
					}

					if(gameButton.isEnabled()){
						Scanner s1 = new Scanner(attribute1.getText());
						try{
							gameDAO.delete(s1.nextInt());
						} catch(Exception ex){
							ex.printStackTrace();
						}
						s1.close();
					}
					
					if(leaguesButton.isEnabled()){
						Scanner s1 = new Scanner(attribute1.getText());
						try{
							leagueDAO.delete(s1.nextInt());
						} catch(Exception ex){
							ex.printStackTrace();
						}
						s1.close();
					}

					if(userButton.isEnabled()){
						Scanner s1 = new Scanner(attribute1.getText());
						try{
							userDAO.delete(s1.nextInt());
						} catch(Exception ex){
							ex.printStackTrace();
						}
						s1.close();
					}
					
					text.setText("");

					for(JButton buttons : entityButtons){
						buttons.setEnabled(true);
					}
					for(JButton buttons : enterButtons){
						buttons.setEnabled(false);
					}
					for(JTextArea textAreas : attributes){
						textAreas.setText("");
					}
					frame.setVisible(true);
				}
			}
		);

		appearButton.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					try{
						List<Appear> appears = appearDAO.selectAll();
						String appearList = "";
						for(int i=0; i<appears.size(); i++){
							int playerId = appears.get(i).getPlayer_id();
							int seasonId = appears.get(i).getSeason_id();
							try{
								Player player = playerDAO.selectById(playerId);
								Season season = seasonDAO.selectById(seasonId);
								appearList += player.getPlayer_name() +" "+ season.getSeason_year() +" "+ appears.get(i).toString() + "\n";
							} catch(Exception ex){
								ex.printStackTrace();
							}
						}
						text.setText(appearList);

					} catch(Exception ex){
						ex.printStackTrace();
					}

					for(JButton buttons : entityButtons){
						buttons.setEnabled(false);
					}
					appearButton.setEnabled(true);
					for(JButton buttons : enterButtons){
						buttons.setEnabled(true);
					}

					frame.setVisible(true);			
				}
			}
		);

		btlButton.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					try{
						List<Belong_to_League> btls = btlDAO.selectAll();
						String btlList = "";
						for(int i=0; i<btls.size(); i++){
							int clubId = btls.get(i).getClub_id();
							int leagueId = btls.get(i).getLeague_id();
							try{
								Club club = clubDAO.selectById(clubId);
								League league = leagueDAO.selectById(leagueId);
								btlList += club.getClub_fullname() +" "+ league.getLeague_name() +" "+ btls.get(i).toString() + "\n";
							} catch(Exception ex){
								ex.printStackTrace();
							}
						}
						text.setText(btlList);
						
					} catch(Exception ex){
						ex.printStackTrace();
					}

					for(JButton buttons : entityButtons){
						buttons.setEnabled(false);
					}
					btlButton.setEnabled(true);
					for(JButton buttons : enterButtons){
						buttons.setEnabled(true);
					}

					frame.setVisible(true);
				}
			}
		);

		clubsButton.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					try{
						List<Club> clubs = clubDAO.selectAll();
						String clubList = "";
						for(int i=0; i<clubs.size(); i++){
							clubList += clubs.get(i).getClub_fullname() +" "+ clubs.get(i).toString() + "\n";
						}
						text.setText(clubList);
						
					} catch(Exception ex){
						ex.printStackTrace();
					}

					for(JButton buttons : entityButtons){
						buttons.setEnabled(false);
					}
					clubsButton.setEnabled(true);
					for(JButton buttons : enterButtons){
						buttons.setEnabled(true);
					}

					frame.setVisible(true);
				}
			}
		);

		contractButton.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					try{
						List<Contract> contracts = contractDAO.selectAll();
						String contractList = "";
						for(int i=0; i<contracts.size(); i++){
							int playerId = contracts.get(i).getPlayer_id();
							int clubId = contracts.get(i).getClub_id();
							int seasonId = contracts.get(i).getSeason_id();
							try{
								Player player = playerDAO.selectById(playerId);
								Club club = clubDAO.selectById(clubId);
								Season season = seasonDAO.selectById(seasonId);
								contractList += player.getPlayer_name() +" "+ club.getClub_fullname() +" "+ season.getSeason_year() + " " + contracts.get(i).toString() + "\n";
							} catch(Exception ex){
								ex.printStackTrace();
							}
						}
						text.setText(contractList);
						
					} catch(Exception ex){
						ex.printStackTrace();
					}

					for(JButton buttons : entityButtons){
						buttons.setEnabled(false);
					}
					contractButton.setEnabled(true);
					for(JButton buttons : enterButtons){
						buttons.setEnabled(true);
					}

					frame.setVisible(true);
				}
			}
		);

		gameButton.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					try{
						List<Game> games = gameDAO.selectAll();
						String gameList = "";
						for(int i=0; i<games.size(); i++){
							gameList += games.get(i).toString() + "\n";
						}
						text.setText(gameList);
						
					} catch(Exception ex){
						ex.printStackTrace();
					}

					for(JButton buttons : entityButtons){
						buttons.setEnabled(false);
					}
					gameButton.setEnabled(true);
					for(JButton buttons : enterButtons){
						buttons.setEnabled(true);
					}

					frame.setVisible(true);
				}
			}
		);

		leaguesButton.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					try{
						List<League> leagues = leagueDAO.selectAll();
						String leagueList = "";
						for(int i=0; i<leagues.size(); i++){
							leagueList += leagues.get(i).getLeague_name() +" "+ leagues.get(i).toString() + "\n";
						}
						text.setText(leagueList);
						
					} catch(Exception ex){
						ex.printStackTrace();
					}

					for(JButton buttons : entityButtons){
						buttons.setEnabled(false);
					}
					leaguesButton.setEnabled(true);
					for(JButton buttons : enterButtons){
						buttons.setEnabled(true);
					}

					frame.setVisible(true);
				}
			}
		);

		matchButton.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					try{
						List<Match> matches = matchDAO.selectAll();
						String matchList = "";
						for(int i=0; i<matches.size(); i++){
							int clubId = matches.get(i).getClub_id();
							try{
								Club club = clubDAO.selectById(clubId);
								matchList += club.getClub_fullname() +" "+ matches.get(i).toString() + "\n";
							} catch(Exception ex){
								ex.printStackTrace();
							}
						}
						text.setText(matchList);
						
					} catch(Exception ex){
						ex.printStackTrace();
					}

					for(JButton buttons : entityButtons){
						buttons.setEnabled(false);
					}
					matchButton.setEnabled(true);
					for(JButton buttons : enterButtons){
						buttons.setEnabled(true);
					}

					frame.setVisible(true);
				}	
			}
		);

		playersButton.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					try{
						List<Player> players = playerDAO.selectAll();
						String playerList = "";
						for(int i=0; i<players.size(); i++){
							playerList += players.get(i).getPlayer_name() + " " + players.get(i).toString() + "\n";
						}
						text.setText(playerList);
					} catch(Exception ex){
						ex.printStackTrace();
					}

					for(JButton buttons : entityButtons){
						buttons.setEnabled(false);
					}
					playersButton.setEnabled(true);
					for(JButton buttons : enterButtons){
						buttons.setEnabled(true);
					}

					frame.setVisible(true);			
				}	
			}
		);						

		seasonsButton.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					try{
						List<Season> seasons = seasonDAO.selectAll();
						String seasonList = "";
						for(int i=0; i<seasons.size(); i++){
							seasonList += seasons.get(i).getSeason_year() +" "+ seasons.get(i).toString() + "\n";
						}
						text.setText(seasonList);
						
					} catch(Exception ex){
						ex.printStackTrace();
					}

					for(JButton buttons : entityButtons){
						buttons.setEnabled(false);
					}
					seasonsButton.setEnabled(true);
					for(JButton buttons : enterButtons){
						buttons.setEnabled(true);
					}

					frame.setVisible(true);
				}
			}
		);

		ppsButton.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					try{
						List<Player_per_Season> ppses = ppsDAO.selectAll();
						String ppsList = "";
						for(int i=0; i<ppses.size(); i++){
							int playerId = ppses.get(i).getPlayer_id();
							int seasonId = ppses.get(i).getSeason_id();
							try{
								Player player = playerDAO.selectById(playerId);
								Season season = seasonDAO.selectById(seasonId);
								ppsList += player.getPlayer_name() +" "+ season.getSeason_year() +" "+ ppses.get(i).toString() + "\n";
							} catch(Exception ex){
								ex.printStackTrace();
							}
						}
						text.setText(ppsList);
						
					} catch(Exception ex){
						ex.printStackTrace();
					}

					for(JButton buttons : entityButtons){
						buttons.setEnabled(false);
					}
					ppsButton.setEnabled(true);
					for(JButton buttons : enterButtons){
						buttons.setEnabled(true);
					}

					frame.setVisible(true);
				}
			}
		);

		userButton.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					try{
						List<User> users = userDAO.selectAll();
						String userList = "";
						for(int i=0; i<users.size(); i++){
							userList += users.get(i).getUser_name() +" "+ users.get(i).toString() + "\n";
						}
						text.setText(userList);
						
					} catch(Exception ex){
						ex.printStackTrace();
					}

					for(JButton buttons : entityButtons){
						buttons.setEnabled(false);
					}
					userButton.setEnabled(true);
					for(JButton buttons : enterButtons){
						buttons.setEnabled(true);
					}

					frame.setVisible(true);
				}
			}
		);

		cancelButton.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					for(JButton buttons : entityButtons){
						buttons.setEnabled(true);
					}
					for(JButton buttons : enterButtons){
						buttons.setEnabled(false);
					}
					for(JTextArea textAreas : attributes){
						textAreas.setText("");
					}

					text.setText("");
					frame.setVisible(true);
				}
			}
		);	

		for(JButton buttons : entityButtons){
			panel.add(buttons);
		}
		panel.add(cancelButton);
	//	for(JTextArea textAreas : typeTexts){
	//		panel.add(textAreas);
	//	}
		for(JTextArea textAreas : attributes){
			panel.add(textAreas);
		}
		panel.add(adminMenu);
		for(JButton buttons : enterButtons){
			panel.add(buttons);
		}
		panel.add(sp);	
	}

}

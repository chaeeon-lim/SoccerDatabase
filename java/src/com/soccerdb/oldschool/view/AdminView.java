package com.soccerdb.oldschool.view;

import java.io.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;

import com.soccerdb.oldschool.db.dao.*;
import com.soccerdb.oldschool.db.entity.*;

public class AdminView {
	JLabel adminMenu = new JLabel("Administrator Menu");
	JButton insertButton = new JButton("Insert");
	JButton updateButton = new JButton("Update");
	JButton deleteButton = new JButton("Delete");
	JTextArea typeText = new JTextArea("", 1, 75);
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
		frame.setSize(900, 550);

/*		insertButton.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					for(JButton buttons : entityButtons){
						buttons.setEnabled(true);
					}
					frame.setVisible(true);
				}
			}
		);

		updateButton.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					for(JButton buttons : entityButtons){
						buttons.setEnabled(true);
					}
					frame.setVisible(true);
				}
			}
		);

		deleteButton.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					for(JButton buttons : entityButtons){
						buttons.setEnabled(true);
					}
					frame.setVisible(true);
				}
			}
		);
*/
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
					text.setText("");
					frame.setVisible(true);
				}
			}
		);	

		for(JButton buttons : entityButtons){
			panel.add(buttons);
		}
		panel.add(cancelButton);
		panel.add(typeText);
		panel.add(adminMenu);
		panel.add(insertButton);
		panel.add(updateButton);
		panel.add(deleteButton);
		panel.add(sp);	
	}

}

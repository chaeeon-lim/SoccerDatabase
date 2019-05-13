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

	public void showAdmin(JFrame frame, JPanel panel){
		frame.setSize(900, 550);

		insertButton.addActionListener(
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

		appearButton.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					try{
						List<Appear> appears = appearDAO.selectAll();

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
						String playersIDList = "";
						for(int i=0; i<players.size(); i++){
							playersIDList += players.get(i).getPlayer_name() + " " + players.get(i).getPlayer_id() + "\n";
						}
						text.setText(playersIDList);
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

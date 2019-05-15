package com.soccerdb.oldschool.view;

import java.io.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.Scanner;

import com.soccerdb.oldschool.db.dao.*;
import com.soccerdb.oldschool.db.entity.*;

public class UserView {
	JTextArea text = new JTextArea("", 20, 75);
	JScrollPane sp = new JScrollPane(text);
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
//	JTextArea searchText = new JTextArea("", 1, 75);
	JTextArea searchBy = new JTextArea("", 1, 60);
	JTextArea searchCondition = new JTextArea("", 1, 15);
	JButton searchButton = new JButton("Search");
	JButton orderButton = new JButton("Order");
	JButton topTenButton = new JButton("Top10");
	JButton cancelButton = new JButton("Cancel All");

	JButton[] entityButtons = {appearButton, btlButton, clubsButton, contractButton, gameButton, 
									leaguesButton, matchButton, playersButton, seasonsButton, ppsButton};

	SeasonDAO seasonDAO = new ImplSeasonDAO();
	LeagueDAO leagueDAO = new ImplLeagueDAO();
	ClubDAO clubDAO = new ImplClubDAO();
	PlayerDAO playerDAO = new ImplPlayerDAO();
	AppearDAO apearDAO = new ImplAppearDAO();
	BTLDAO btlDAO = new ImplBTLDAO();
	ContractDAO contractDAO = new ImplContractDAO();
	GameDAO gameDAO = new ImplGameDAO();
	MatchDAO matchDAO = new ImplMatchDAO();
	PPSDAO ppsDAO = new ImplPPSDAO();

	public void showUser(JFrame frame, JPanel panel){
		frame.setTitle("User Mode");
		frame.setSize(900, 550);

		seasonsButton.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					try{
						List<Season> seasons = seasonDAO.selectAll();
						String seasonsList = "";
						for(int i=0; i<seasons.size(); i++){
							seasonsList += seasons.get(i).toString() + "\n";
						}
						text.setText(seasonsList);
						searchButton.setEnabled(true);
					} catch(Exception ex){
						ex.printStackTrace();
					}
					for(JButton buttons : entityButtons){
						buttons.setEnabled(false);
					}
					seasonsButton.setEnabled(true);
				}
			}
		);

		leaguesButton.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					try{
						List<League> leagues = leagueDAO.selectAll();
						String leaguesList = "";
						for(int i=0; i<leagues.size(); i++){
							leaguesList += leagues.get(i).toString() + "\n";
						}
						text.setText(leaguesList);
						searchButton.setEnabled(true);
					} catch(Exception ex){
						ex.printStackTrace();
					}
					for(JButton buttons : entityButtons){
						buttons.setEnabled(false);
					}
					leaguesButton.setEnabled(true);
				}
			}
		);

		clubsButton.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					try{
						List<Club> clubs = clubDAO.selectAll();
						String clubsList = "";
						for(int i=0; i<clubs.size(); i++){
							clubsList += clubs.get(i).toString() + "\n";
						}
						text.setText(clubsList);
						searchButton.setEnabled(true);
					} catch(Exception ex){
						ex.printStackTrace();
					}
					for(JButton buttons : entityButtons){
						buttons.setEnabled(false);
					}
					clubsButton.setEnabled(true);
				}
			}
		);

		playersButton.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					try{
						List<Player> players = playerDAO.selectAll();
						String playersList = "";
						for(int i=0; i<players.size(); i++){
							playersList += players.get(i).toString() + "\n";
						}
						text.setText(playersList);
						searchButton.setEnabled(true);
					} catch(Exception ex){
						ex.printStackTrace();
					}
					for(JButton buttons : entityButtons){
						buttons.setEnabled(false);
					}
					playersButton.setEnabled(true);
				}
			}
		);

		appearButton.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					try{

					} catch(Exception ex){
						ex.printStackTrace();
					}
					for(JButton buttons : entityButtons){
						buttons.setEnabled(false);
					}
					appearButton.setEnabled(true);

				}
			}
		);

		btlButton.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					try{

					} catch(Exception ex){
						ex.printStackTrace();
					}
					for(JButton buttons : entityButtons){
						buttons.setEnabled(false);
					}
					btlButton.setEnabled(true);

				}
			}
		);

		contractButton.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					try{

					} catch(Exception ex){
						ex.printStackTrace();
					}
					for(JButton buttons : entityButtons){
						buttons.setEnabled(false);
					}
					contractButton.setEnabled(true);

				}
			}
		);

		gameButton.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					try{

					} catch(Exception ex){
						ex.printStackTrace();
					}
					for(JButton buttons : entityButtons){
						buttons.setEnabled(false);
					}
					gameButton.setEnabled(true);

				}
			}
		);

		matchButton.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					try{

					} catch(Exception ex){
						ex.printStackTrace();
					}
					for(JButton buttons : entityButtons){
						buttons.setEnabled(false);
					}
					matchButton.setEnabled(true);

				}
			}
		);

		ppsButton.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					try{

					} catch(Exception ex){
						ex.printStackTrace();
					}
					for(JButton buttons : entityButtons){
						buttons.setEnabled(false);
					}
					ppsButton.setEnabled(true);

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
					searchBy.setText("");
					searchCondition.setText("");
					frame.setVisible(true);
				}
			}
		);

		searchButton.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					Scanner s1 = new Scanner(searchBy.getText());
					Scanner s2 = new Scanner(searchCondition.getText());
					if(seasonsButton.isEnabled()){
						if(s1.next().equals("id")){
							try{
								Season season = seasonDAO.selectById(s2.nextInt());
								text.setText(season.toString());
							} catch(Exception ex){
								ex.printStackTrace();
							}
						}
					}
					
					if(playersButton.isEnabled()){
						if(s1.next().equals("nationality")){
							try{
								List<Player> players = playerDAO.selectByNationality(s2.next());
								String list = "";
								for(int i=0; i<players.size(); i++){
									list += players.get(i).toString() + "\n";
								}
								text.setText(list);
							} catch(Exception ex){
								ex.printStackTrace();
							}
						}
					}
/*					try{

					} catch(Exception ex){
						ex.printStackTrace();
					}*/
					for(JButton buttons : entityButtons){
						buttons.setEnabled(true);
					}
				}
			}
		);

		orderButton.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					try{

					} catch(Exception ex){
						ex.printStackTrace();
					}
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
		panel.add(searchBy);
		panel.add(searchCondition);
		panel.add(searchButton);
		panel.add(orderButton);
		panel.add(sp);
	}


}

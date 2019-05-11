package com.soccerdb.oldschool.view;

import java.io.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;

import com.soccerdb.oldschool.db.dao.*;
import com.soccerdb.oldschool.db.dao.*;
import com.soccerdb.oldschool.db.entity.*;

public class UserView {
	JTextArea text = new JTextArea("", 20, 75);
	JScrollPane sp = new JScrollPane(text);
	JButton seasonsButton = new JButton("Seasons");
	JButton leaguesButton = new JButton("Leagues");
	JButton clubsButton = new JButton("Clubs");
	JButton playersButton = new JButton("Players");
	JTextArea searchText = new JTextArea("", 1, 40);
	JButton searchButton = new JButton("Search");
	JButton topTenButton = new JButton("Top10");

	SeasonDAO seasonDAO = new ImplSeasonDAO();
	LeagueDAO leagueDAO = new ImplLeagueDAO();
	ClubDAO clubDAO = new ImplClubDAO();
	PlayerDAO playerDAO = new ImplPlayerDAO();

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
							seasonsList += Integer.toString(seasons.get(i).getSeason_year()) + "\n";
						}
						text.setText(seasonsList);
						searchButton.setEnabled(true);
					} catch(Exception ex){
						ex.printStackTrace();
					}
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
							leaguesList += leagues.get(i).getLeague_name() + "\n";
						}
						text.setText(leaguesList);
						searchButton.setEnabled(true);
					} catch(Exception ex){
						ex.printStackTrace();
					}
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
							clubsList += clubs.get(i).getClub_fullname() + "\n";
						}
						text.setText(clubsList);
						searchButton.setEnabled(true);
					} catch(Exception ex){
						ex.printStackTrace();
					}
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
							playersList += players.get(i).getPlayer_name() + "\n";
						}
						text.setText(playersList);
						searchButton.setEnabled(true);
					} catch(Exception ex){
						ex.printStackTrace();
					}
				}
			}
		);

		panel.add(seasonsButton);
		panel.add(leaguesButton);
		panel.add(clubsButton);
		panel.add(playersButton);
		panel.add(searchText);
		panel.add(searchButton);
		panel.add(topTenButton);
		panel.add(sp);
	}


}

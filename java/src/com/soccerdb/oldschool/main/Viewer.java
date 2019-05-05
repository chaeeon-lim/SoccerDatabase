package com.soccerdb.oldschool.main;

import java.io.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;

import com.soccerdb.oldschool.db.dao.PlayerDAO;
import com.soccerdb.oldschool.db.dao.ImplPlayerDAO;
import com.soccerdb.oldschool.db.entity.Player;

public class Viewer{
	PlayerDAO playerDAO = new ImplPlayerDAO();
	Player player = new Player();

	public static void login(JFrame frame){
		JPanel panel = new JPanel(new BorderLayout(5, 5));
	    JPanel label = new JPanel(new GridLayout(0, 1, 2, 2));
    	label.add(new JLabel("UserID", SwingConstants.RIGHT));
    	label.add(new JLabel("Password", SwingConstants.RIGHT));
    	panel.add(label, BorderLayout.WEST);

    	JPanel controls = new JPanel(new GridLayout(0, 1, 2, 2));
    	JTextField userid = new JTextField();
    	controls.add(userid);
    	JPasswordField password = new JPasswordField();
    	controls.add(password);
    	panel.add(controls, BorderLayout.CENTER);

    	JOptionPane.showMessageDialog(frame, panel, "login", JOptionPane.QUESTION_MESSAGE);

		if (userid.getText().equals("admin")){
			if ((new String(password.getPassword())).equals("db1234"))
				return;
			else
				System.exit(1);
		}
		else {
			System.exit(1);
		}
	}
	
	public void showDB(){
		JFrame frame = new JFrame("Old School Database");
//		login(frame);
		JPanel panel = new JPanel();

		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setSize(900, 500);

		frame.getContentPane().add(panel);

		JTextArea text = new JTextArea("", 20, 75);
		JScrollPane sp = new JScrollPane(text);

		JButton seasons = new JButton("Seasons");
		JButton clubs = new JButton("Clubs");
		JButton players = new JButton("Players");

		seasons.setSize(150,30);
		clubs.setSize(150,30);
		players.setSize(150,30);

		JTextArea searchText = new JTextArea("", 1, 40);
		JButton search = new JButton("Search");
		search.setSize(150,30);

		JButton insert = new JButton("Insert");
		insert.setSize(150,30);

		seasons.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
/*					try{
						List<Season> seasons = seasonDAO.selectName();
						String seasonsLists = "";
						for(int i=0; i<seasons.size(); i++){
							seasonsLists += seasons.get(i).getSeason_year() +"\n";
						}
						text.setText(seasonsLists);
						search.setEnabled(true);

					} catch(Exception ex){
						ex.printStackTrace();
					}*/
				}
			}
		);

		clubs.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
/*					try{
						List<Club> clubs = clubDAO.selectName();
						String clubsLists = "";
						for(int i=0; i<clubs.size(); i++){
							clubsLists += clubs.get(i).getClub_name() +"\n";
						}
						text.setText(clubsLists);
						search.setEnabled(true);

					} catch(Exception ex){
						ex.printStackTrace();
					}*/
				}
			}
		);

		players.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					try{
						List<Player> players = playerDAO.selectAll();
					//	Player players = playerDAO.selectById(1);
						String playersList = "";
					//	String playersList = players.toString();
						for(int i=0; i<players.size(); i++){
					//		playersList += players.get(i).toString() +"\n";
							playersList += players.get(i).getPlayer_name() + "\n";
						}
						text.setText(playersList);
						search.setEnabled(true);

					} catch(Exception ex){
						ex.printStackTrace();
					}
					
				}
			}
		);

		search.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					Scanner s = new Scanner(text.getText());
					String searchedText = searchText.getText();
					int id=0;
					while(s.hasNext()){
						String l = s.nextLine();
						id++;
						if(l.equals(searchedText)){
							try{
								Player players = playerDAO.selectById(id);
								text.setText(players.toString());
								search.setEnabled(true);
								break;
							} catch(Exception ex){
								ex.printStackTrace();
							}
//							Player players = playerDAO.selectById(id);
//							text.setText(players.toString());
//							search.setEnabled(true);
							break;
						}else{
							text.setText("Wrong input!");
							search.setEnabled(false);
						}
					}
				}
			}
		);

		insert.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					
				}
			}
		);

		panel.add(seasons);
		panel.add(clubs);
		panel.add(players);
		panel.add(searchText);
		panel.add(search);
		panel.add(insert);
		panel.add(sp);
		frame.setVisible(true);		

	}
}

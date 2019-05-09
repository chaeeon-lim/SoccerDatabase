package com.soccerdb.oldschool.view;

import java.io.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class MainView {
	JFrame frame;
	JPanel panel;	
	int mode;
	LoginView loginView = new LoginView();
	AdminView adminView = new AdminView();
	UserView userView = new UserView();

	public void showDB(){
		frame = new JFrame();
		mode = loginView.showLogin(frame);
		panel = new JPanel();

		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//		frame.setSize(600,400);
		frame.getContentPane().add(panel);

		if(mode==0)
			adminView.showAdmin(frame, panel);
		else if(mode==1)
			userView.showUser(frame, panel);
		else
			System.exit(1);

		frame.setVisible(true);
	}

/*
	public int showLogin(JFrame frame){
		JPanel loginPanel = new JPanel(new BorderLayout(5, 5));
		JPanel label = new JPanel(new GridLayout(0, 1, 2, 2));

		label.add(new JLabel("Account", SwingConstants.RIGHT));
		label.add(new JLabel("Password", SwingConstants.RIGHT));
		loginPanel.add(label, BorderLayout.WEST);

		JPanel controls = new JPanel(new GridLayout(0, 1, 2, 2));
		JTextField account = new JTextField();
		JPasswordField password = new JPasswordField();

		controls.add(account);
		controls.add(password);
		loginPanel.add(controls, BorderLayout.CENTER);

		JOptionPane.showMessageDialog(frame, loginPanel, "Login", JOptionPane.QUESTION_MESSAGE);

		if (account.getText().equals("admin")){
			if ((new String(password.getPassword())).equals("db1234"))
				return 0;
			else
				System.exit(1);
		}
		else if (account.getText().equals("juyoul")){
			if((new String(password.getPassword())).equals("123123"))
				return 1;
			else
				System.exit(1);
		}
		else{
			System.exit(1);
		}

		return -1;
	}

	public void showAdmin(JFrame frame, JPanel panel){
		frame.setTitle("Administrator Mode");
		frame.setSize(600, 400);

		JButton insert = new JButton("Insert");
		JButton update = new JButton("Update");
		JButton delete = new JButton("Delete");

		panel.add(insert);
		panel.add(update);
		panel.add(delete);
	}

	public void showUser(JFrame frame, JPanel panel){
		frame.setTitle("User Mode");
		frame.setSize(900, 550);

		JTextArea text = new JTextArea("", 20, 75);
		JScrollPane sp = new JScrollPane(text);

		JButton leagues = new JButton("Leagues");
		JButton clubs = new JButton("Clubs");
		JButton players = new JButton("Players");

		JTextArea searchText = new JTextArea("", 1, 40);
		JButton search = new JButton("Search");
		JButton topTen = new JButton("Top10");


		panel.add(leagues);
		panel.add(clubs);
		panel.add(players);
		panel.add(searchText);
		panel.add(search);
		panel.add(topTen);
		panel.add(sp);
	}
*/
}

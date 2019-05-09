package com.soccerdb.oldschool.view;

import java.io.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class UserView {
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

}

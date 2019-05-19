package com.soccerdb.oldschool.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.soccerdb.oldschool.control.AppearController;
import com.soccerdb.oldschool.control.BTLController;
import com.soccerdb.oldschool.control.ClubController;
import com.soccerdb.oldschool.control.ContractController;
import com.soccerdb.oldschool.control.ControllerInterface;
import com.soccerdb.oldschool.control.GameController;
import com.soccerdb.oldschool.control.LeagueController;
import com.soccerdb.oldschool.control.MatchController;
import com.soccerdb.oldschool.control.PPSController;
import com.soccerdb.oldschool.control.PlayerController;
import com.soccerdb.oldschool.control.SeasonController;


public class UserView implements ActionListener{
	JFrame frame;
	JPanel panel;
	
	public void showUser(JFrame _frame, JPanel _panel){
		frame = _frame;
		panel = _panel;
		frame.setTitle("User Mode");

		frame.setSize(900, 550);		
		
		seasonsButton.addActionListener(this);
		leaguesButton.addActionListener(this);
		playersButton.addActionListener(this);
		clubsButton.addActionListener(this);
		appearButton.addActionListener(this);
		btlButton.addActionListener(this);
		contractButton.addActionListener(this);
		gameButton.addActionListener(this);
		matchButton.addActionListener(this);
		ppsButton.addActionListener(this);

		orderButton.addActionListener(this);
		searchButton.addActionListener(this);
		//countButton.addActionListener(this);

		cancelButton.addActionListener(this);
	

		for(JButton buttons : entityButtons){
			panel.add(buttons);
		}
		panel.add(cancelButton);
		panel.add(attributeTextLabel);
		panel.add(byText);
		panel.add(conditionTextLabel);
		panel.add(conditionText);

	//	panel.add(moreLessText);
		panel.add(searchButton);
		panel.add(orderButton);
		panel.add(countButton);
		panel.add(sp);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		for(JButton buttons : entityButtons){
			buttons.setEnabled(false);
		}
		text.setText("");
		
		if(e.getSource().equals(playersButton)) {
			controller = PlayerController.getController();
			dataBox = controller.selectAll();
			playersButton.setEnabled(true);
			player_flag = true;
		}
  		else if(e.getSource().equals(seasonsButton)){
			controller = SeasonController.getController();
			dataBox = controller.selectAll();
			seasonsButton.setEnabled(true);
			season_flag = true;
		}
		else if(e.getSource().equals(leaguesButton)){
			controller = LeagueController.getController();
			dataBox = controller.selectAll();
			leaguesButton.setEnabled(true);
			league_flag = true;
		}
		else if(e.getSource().equals(clubsButton)){
			controller = ClubController.getController();
			dataBox = controller.selectAll();
			clubsButton.setEnabled(true);
			club_flag = true;
		}
		else if(e.getSource().equals(appearButton)){
			controller = AppearController.getController();
			dataBox = controller.selectAll();
			appearButton.setEnabled(true);
			appear_flag = true;
		}
		else if(e.getSource().equals(btlButton)){
			controller = BTLController.getController();
			dataBox = controller.selectAll();
			btlButton.setEnabled(true);
			btl_flag = true;
		}
		else if(e.getSource().equals(contractButton)){
			controller = ContractController.getController();
			dataBox = controller.selectAll();
			contractButton.setEnabled(true);
			contract_flag = true;
		}
		else if(e.getSource().equals(gameButton)){
			controller = GameController.getController();
			dataBox = controller.selectAll();
			gameButton.setEnabled(true);
			game_flag = true;
		}
		else if(e.getSource().equals(matchButton)){
			controller = MatchController.getController();
			dataBox = controller.selectAll();
			matchButton.setEnabled(true);
			match_flag = true;
		}
		else if(e.getSource().equals(ppsButton)){
			controller = PPSController.getController();
			dataBox = controller.selectAll();
			ppsButton.setEnabled(true);
			pps_flag = true;
		}
		else if(e.getSource().equals(searchButton)) {
			searchButtonListener();	
		}
		else if(e.getSource().equals(orderButton)){
			orderButtonListener();
		}
	//	else if(e.getSource().equals(countButton)){
	//		countButtonListener();
	//	}
		else if(e.getSource().equals(cancelButton)) {
			for(JButton buttons : entityButtons){
				buttons.setEnabled(true);
			}
			text.setText("");
			byText.setText("");
			conditionText.setText("");
			frame.setVisible(true);
			dataBox = "";
			flag_reset();
		}
		
		text.setText(dataBox);
	}

	void searchButtonListener() {
		scanner_flag = search_scanner_set();
		if(scanner_flag) {
			dataBox = controller.search(attribute, condition);
		} else {
			//System.out.println("no attribute");
			// handling case : attribute is blank
		}		
		
		text.setText(dataBox);
		scanner_free();
	}
	

	private void orderButtonListener() {

		scanner_flag = search_scanner_set();

		if(scanner_flag){
			dataBox = controller.order(attribute, condition);
		}
		text.setText(dataBox);
		scanner_free();		
	}
/*
	private void countButtonListener(){
		scanner_flag = search_scanner_set();

		if(scanner_flag){
		//	if(player_flag){
				dataBox = controller.count(attribute, condition);
		//	}
		}

		text.setText(dataBox);
		scanner_free();
	}*/

	
	boolean search_scanner_set() {
		s1 = new Scanner(byText.getText());
		s2 = new Scanner(conditionText.getText());
		if(s1.hasNext() && s2.hasNext()) {
			attribute = s1.nextLine();
			condition = s2.nextLine();

			return true;
		}
		return false;
	}
	
	void scanner_free() {
		s1.close();
		s2.close();
	}
	
	void flag_reset() {
		appear_flag = false;
		btl_flag = false;
		club_flag = false;
		contract_flag = false;
		game_flag = false;
		league_flag = false;
		match_flag = false;
		pps_flag = false;
		user_flag = false;
		player_flag = false;
		season_flag = false;
	}
	
	String attribute;
	String condition;
	
	String dataBox;
	

	boolean appear_flag = false;
	boolean btl_flag = false;
	boolean club_flag = false;
	boolean contract_flag = false;
	boolean game_flag = false;
	boolean league_flag = false;
	boolean match_flag = false;
	boolean pps_flag = false;
	boolean user_flag = false;
	boolean player_flag = false;
	boolean season_flag = false;
	boolean scanner_flag = false;
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
	JTextArea byText = new JTextArea("", 1, 60);
	JTextArea conditionText = new JTextArea("", 1, 15);
//	JTextArea moreLessText = new JTextArea("", 1, 5);
	JLabel attributeTextLabel = new JLabel("Attribute : ");
	JLabel conditionTextLabel = new JLabel("Condition : ");
	Scanner s1, s2;
	JButton searchButton = new JButton("Search");
	JButton orderButton = new JButton("Order");
	JButton countButton = new JButton("Count");
//	JButton topTenButton = new JButton("Top10");
	JButton cancelButton = new JButton("Cancel All");

	JButton[] entityButtons = {appearButton, btlButton, clubsButton, contractButton, gameButton, 
									leaguesButton, matchButton, playersButton, seasonsButton, ppsButton};

	ControllerInterface<?> controller;
	

}

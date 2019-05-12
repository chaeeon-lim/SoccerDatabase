package com.soccerdb.oldschool.view;

import com.soccerdb.oldschool.control.LoginController;

import java.io.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class LoginView  {
	JPanel loginPanel;
	JPanel label;
	JPanel controls;
	JTextField account;
	JPasswordField password;
	LoginController loginController;
	
	public int showLogin(JFrame frame){
		loginPanel = new JPanel(new BorderLayout(5, 5));
		label = new JPanel(new GridLayout(0, 1, 2, 2));

		label.add(new JLabel("Account", SwingConstants.RIGHT));
		label.add(new JLabel("Password", SwingConstants.RIGHT));
		loginPanel.add(label, BorderLayout.WEST);

		controls = new JPanel(new GridLayout(0, 1, 2, 2));
		account = new JTextField();
		password = new JPasswordField();

		controls.add(account);
		controls.add(password);
		loginPanel.add(controls, BorderLayout.CENTER);

		JOptionPane.showMessageDialog(frame, loginPanel, "Login", JOptionPane.QUESTION_MESSAGE);

		loginController = LoginController.getController();
		int mode = callController(account.getText(), password.getText());

		return mode;

	}

	public int callController(String account, String password){
		int mode = loginController.loginCheck(account, password);
		return mode;
	}
}
	
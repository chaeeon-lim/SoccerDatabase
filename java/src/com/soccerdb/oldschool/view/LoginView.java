package com.soccerdb.oldschool.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.soccerdb.oldschool.control.LoginController;

public class LoginView extends View {
		JFrame frame;
		JPanel panel;
		JPanel label;
		JPanel controls;
		JButton loginButton;
		JTextField userid;
		JPasswordField password;
		LoginController controller;
	
	public LoginView() {
		
	}
	@Override
	public void init() {
		// TODO Auto-generated method stub
		controller = LoginController.getController();
		frame = (JFrame) super.getParent();
		panel = super.basePanel;
	}
	
	@Override
	public void paint() {
		// TODO Auto-generated method stub
		label = new JPanel(new GridLayout(0, 1, 2, 2));
    	label.add(new JLabel("UserID", SwingConstants.RIGHT));
    	label.add(new JLabel("Password", SwingConstants.RIGHT));
    	panel.add(label, BorderLayout.WEST);

    	controls = new JPanel(new GridLayout(0, 1, 2, 2));
    	userid = new JTextField();
    	controls.add(userid);
    	password = new JPasswordField();
    	controls.add(password);
    	loginButton = new JButton("로그인");
    	
    	panel.add(loginButton,BorderLayout.SOUTH);
    	loginButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				callController(userid.getText(), password.getText());
				
			}
    		
    	});
    	panel.add(controls, BorderLayout.CENTER);

    	//JOptionPane.showMessageDialog(super.getParent(), super.basePanel, "login", JOptionPane.QUESTION_MESSAGE);
    	//new onButtonClickListener
	}
	
	public void callController(String id, String string) {
		controller.loginCheck(id, string);
		// TODO Auto-generated method stub
		
	}
	

}

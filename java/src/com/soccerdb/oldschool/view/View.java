package com.soccerdb.oldschool.view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public abstract class View extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6248790054350511581L;
	JPanel basePanel;

	public View(){
		
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("TestFrame");
		basePanel = new JPanel(new BorderLayout(5, 5));
		add(basePanel);
		init();
		
		paint();
		
		setVisible(true);
		
	}
	public abstract void init();
	
	public abstract void paint();
	
	
	
}

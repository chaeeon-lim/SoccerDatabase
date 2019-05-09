package com.soccerdb.oldschool.view;

import java.io.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class AdminView {
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

}

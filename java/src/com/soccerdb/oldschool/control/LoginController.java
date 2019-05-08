package com.soccerdb.oldschool.control;

import com.soccerdb.oldschool.db.dao.ImplUserDAO;
import com.soccerdb.oldschool.db.dao.UserDAO;
import com.soccerdb.oldschool.db.entity.User;

public class LoginController {
	private static LoginController controller;
	private User user;
	private static final UserDAO userDAO = new ImplUserDAO();
	
	static {
		try {
			if(controller == null) {
				controller = new LoginController();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
	public void loginCheck(String account, String string) {
		try {
			user = userDAO.selectByAccount(account);
			System.out.println("input_account : "+account);
			System.out.println("input_passwd : "+string.toString());
			System.out.println("db_account : "+user.getUser_account());
			System.out.println("db_passwd : "+user.getUser_password());
			if(user.getUser_account().equals(account)) {
				if(user.getUser_password().equals(string)) {//toCharArray().equals(string)){//.equals(password)) {
					if(account.equals("admin")) {
						//TODO Call View's method to paint AdminView.class
						// ex) view.paint(AdminView);
						System.out.println("it is ADMINISTRATOR");
					}
					else {
						//TODO Call View's method to paint MainView.class  
						// ex) view.paint(MainView);
						System.out.println("it is USER");
					}
				}
				else {
					//TODO Error handling when the password is incorrect
					System.out.println("Incorrect password");
				}
			}
			else {
				//TODO Error handling when the account does not exist.
				System.out.println("Incorrect ID");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static LoginController getController() {
		return controller;
	}
	
}

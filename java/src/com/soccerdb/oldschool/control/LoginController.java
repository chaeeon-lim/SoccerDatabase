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
	
	public void loginCheck(String account, String password) {
		try {
			user = userDAO.selectByAccount(account);
			if(!user.getUser_account().equals(null)) {
				if(user.getUser_password().equals(password)) {
					if(account.equals("admin")) {
						//TODO Call View's method to paint AdminView.class
						// ex) view.paint(AdminView);
					}
					else {
						//TODO Call View's method to paint MainView.class  
						// ex) view.paint(MainView);
					}
				}
				else {
					//TODO Error handling when the password is incorrect
				}
			}
			else {
				//TODO Error handling when the account does not exist.
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

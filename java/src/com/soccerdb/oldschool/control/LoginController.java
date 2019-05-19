package com.soccerdb.oldschool.control;

import com.soccerdb.oldschool.db.dao.ImplUserDAO;
import com.soccerdb.oldschool.db.dao.UserDAO;
import com.soccerdb.oldschool.db.entity.User;
import com.soccerdb.oldschool.view.*;

public class LoginController {
	private static LoginController controller;
	private User user;
	private static final UserDAO userDAO = new ImplUserDAO();
	LoginView loginView = new LoginView();
	AdminView adminView = new AdminView();
	UserView userView = new UserView();

	static {
		try {
			if(controller == null) {
				controller = new LoginController();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
	public int loginCheck(String account, String password){
		try{
			user = userDAO.searchUserAccount(account);

			if(user.getUser_account().equals(account)){
				if(user.getUser_password().equals(password)){
					if(account.equals("admin"))
						return 0;
					else 
						return 1;
				}
				else{
					//System.exit(1);
				}				
			}
			else{
				//System.exit(1);
			}
		} catch(Exception e){
			//System.exit(1);
		}

		return 1;
	}
	
	public static LoginController getController() {
		return controller;
	}
	
}

package com.soccerdb.oldschool.db.entity;

public class User {
	private int user_id;
	private String user_name;
	private String user_account;
	private String user_password;
	private String user_email;

	public User() {
	}

	public User(int user_id, String user_name, String user_account, String user_password, String user_email) {
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_account = user_account;
		this.user_password = user_password;
		this.user_email = user_email;
	}

	public int getUser_id() {
		return this.user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return this.user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_account() {
		return this.user_account;
	}

	public void setUser_account(String user_account) {
		this.user_account = user_account;
	}

	public String getUser_password() {
		return this.user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_email() {
		return this.user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}


	@Override
	public String toString() {
		return "{" +
			" user_id='" + getUser_id() + "'" +
			", user_name='" + getUser_name() + "'" +
			", user_account='" + getUser_account() + "'" +
			", user_password='" + getUser_password() + "'" +
			", user_email='" + getUser_email() + "'" +
			"}";
	}

}

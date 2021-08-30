/**
 * @author Yash Jha (51955989)
 */
package com.login.model;

//POJO  --  Plain Old JAVA Object
public class User {
	
	// Variables -- States
	private int userId;
	private String userName;
	private String password;
	
	// Methods -- Behaviors
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


}

/**
 * @author Yash Jha (51955989)
 */
package com.login.service;

import com.login.model.User;

public interface LoginService {
	
	//Pure Abstract Method = Method Signature = No body{}
	
	public abstract User create(User user);  //Save Data
	public abstract User readByUserIdAndPasswordService(User user);  //Save Data
	public abstract User update(User user);  //Save Data
	public abstract User delete(int userId);  //Save Data


}

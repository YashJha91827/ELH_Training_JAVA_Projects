/**
 * @author Yash Jha (51955989)
 */
package com.login.service;

import com.login.dao.LoginDao;
import com.login.dao.LoginDaoImpl;
import com.login.model.User;

public class LoginServiceImpl implements LoginService {

	@Override
	public User create(User user) {
		return null;
	}

	@Override
	public User readByUserIdAndPasswordService(User user) {

		// Handle by Database
		User userDummy = null;
		int userId= String.valueOf(user.getUserId()).length();
		int password= String.valueOf(user.getPassword()).length();
		if (user != null && userId>5 && password>5) {
			LoginDao loginDao = new LoginDaoImpl();
			userDummy = loginDao.readByUserIdAndPassword(user);
		}

		return userDummy;
	}

	@Override
	public User update(User user) {
		return null;
	}

	@Override
	public User delete(int userId) {
		return null;
	}

}

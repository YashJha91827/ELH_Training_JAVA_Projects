/**
 * @author Yash Jha (51955989)
 */
package com.login.dao;

import com.login.model.User;

public class LoginDaoImpl implements LoginDao {

	@Override
	public User create(User user) {
		return null;
	}

	@Override
	public User readByUserIdAndPassword(User user) {
		// No Database

		if (user.getUserId() == 123456 && user.getPassword().equals("yashjha")) {
			user.setUserName("Yash Jha");
		}
		if (user.getUserId() == 654321 && user.getPassword().equals("password")) {
			user.setUserName("Swati Randhawa");
		}
		return user;
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

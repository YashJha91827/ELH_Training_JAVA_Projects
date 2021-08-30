/**
 * @author Yash Jha (51955989)
 */
package com.login.dao;

import com.login.model.User;

//Pure Abstract Method = Method Signature = No body{}
//Data Access Object == JDBC == Database
public interface LoginDao {

	public abstract User create(User user);// Save Data

	public abstract User readByUserIdAndPassword(User user);// Save Data

	public abstract User update(User user); // Save Data

	public abstract User delete(int userId); // Save Data

}

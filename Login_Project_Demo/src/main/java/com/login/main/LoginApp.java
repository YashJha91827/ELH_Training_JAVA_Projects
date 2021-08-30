/**
 * @author Yash Jha (51955989)
 */
package com.login.main;

import java.util.Scanner;

import com.login.model.User;
import com.login.service.LoginService;
import com.login.service.LoginServiceImpl;

public class LoginApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Login Application");
		System.out.println();
		System.out.println("Please enter your User-ID and Password below for Login :- ");
		System.out.println();
		System.out.println("Enter your User ID : ");
		int id = input.nextInt();// userId

		System.out.println("Enter your Password : ");
		String pwd = input.next();// password

		LoginService loginService = new LoginServiceImpl();
		User user = new User();
		user.setUserId(id);
		user.setPassword(pwd);

		User ans = loginService.readByUserIdAndPasswordService(user);
		if (ans != null) {
			System.out.println();
			System.out.println("WELCOME " + ans.getUserName());
		}

	}

}

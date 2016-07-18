/**
 * 
 */
package es.sacyl.demo.user.controller;

import java.util.UUID;

import es.sacyl.demo.user.domain.User;
import es.sacyl.demo.user.service.interfaces.UserService;

/**
 * @author isidromerayo
 *
 */
public class UserController {

	private UserService userService;

	/**
	 * 
	 * @param userService
	 */
	public UserController(UserService userService) {
		this.userService = userService;
	}

	public UserController() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @return Long
	 */
	public Long getUserCount() {
		return userService.getUserCount();
	}

	/**
	 * 
	 * @param user
	 * @return String
	 */
	public String createUserId(User user) {
		return String.format("%s_%s", user.getSurname(), UUID.randomUUID().toString());
	}

	/**
	 * 
	 * @param user
	 * @return
	 */
	public String getGreetingText(User user) {
		return String.format(getGreetingFormat(), user.getFirstName(), user.getSurname());
	}

	/**
	 * 
	 * @return
	 */
	private String getGreetingFormat() {
		return "Hello %s %s";
	}
}

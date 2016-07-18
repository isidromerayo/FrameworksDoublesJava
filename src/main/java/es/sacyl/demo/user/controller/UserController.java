/**
 * 
 */
package es.sacyl.demo.user.controller;

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

	/**
	 * 
	 * @return Long
	 */
	public Long getUserCount() {
		return userService.getUserCount();
	}
}

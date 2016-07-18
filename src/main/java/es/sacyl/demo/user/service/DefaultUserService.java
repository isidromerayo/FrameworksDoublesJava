/**
 * 
 */
package es.sacyl.demo.user.service;

import es.sacyl.demo.user.domain.User;
import es.sacyl.demo.user.service.interfaces.UserService;

/**
 * @author isidromerayo
 *
 */
public class DefaultUserService implements UserService {
	@Override
	public User getUserById(Long userId) {
		return null;
	}

	@Override
	public void updateUserDetails(User newUserDetails) {
	}

	@Override
	public void createUser(User user) {
	}

	@Override
	public Long getUserCount() {
		throw new UnsupportedOperationException("Not implemented");
	}
}

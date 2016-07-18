package es.sacyl.demo.user.service.interfaces;

import es.sacyl.demo.user.domain.User;

public interface UserService {

	User getUserById(Long userId);

	void updateUserDetails(User newUserDetails);

	void createUser(User user);

	Long getUserCount();

}

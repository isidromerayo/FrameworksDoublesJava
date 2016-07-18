/**
 * 
 */
package es.sacyl.unit.demo.user.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import es.sacyl.demo.user.controller.UserController;
import es.sacyl.demo.user.service.DefaultUserService;

/**
 * @author isidromerayo
 *
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(UserController.class)
public class UserControllerTest {

	private DefaultUserService mockUserService;
	private UserController userController;

	@Test
	public void testGetUserCount() {
		mockUserService = PowerMockito.mock(DefaultUserService.class);
		PowerMockito.when(mockUserService.getUserCount()).thenReturn(100L);
		userController = new UserController(mockUserService);
		assertEquals(100L, userController.getUserCount().longValue());
	}
}

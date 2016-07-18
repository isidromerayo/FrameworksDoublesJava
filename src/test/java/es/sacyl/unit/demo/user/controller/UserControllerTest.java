/**
 * 
 */
package es.sacyl.unit.demo.user.controller;

import static org.junit.Assert.assertEquals;

import java.util.UUID;

import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import es.sacyl.demo.user.controller.UserController;
import es.sacyl.demo.user.domain.User;
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
	public void getUserCount() {
		mockUserService = PowerMockito.mock(DefaultUserService.class);
		PowerMockito.when(mockUserService.getUserCount()).thenReturn(100L);
		userController = new UserController(mockUserService);
		assertEquals(100L, userController.getUserCount().longValue());
	}

	@Test
	public void mockStatic() throws Exception {
		PowerMock.mockStaticPartial(UUID.class, "randomUUID");
		EasyMock.expect(UUID.randomUUID()).andReturn(UUID.fromString("067e6162-3b6f-4ae2-a171-2470b63dff00"));
		PowerMock.replayAll();
		UserController userController = new UserController();
		Assert.assertTrue(userController.createUserId(getNewUser()).contains("067e6162-3b6f-4ae2-a171-2470b63dff00"));
		PowerMock.verifyAll();
	}

	private User getNewUser() {
		User user = new User();
		user.setFirstName("Code");
		user.setSurname("Geeks");
		return user;
	}
}

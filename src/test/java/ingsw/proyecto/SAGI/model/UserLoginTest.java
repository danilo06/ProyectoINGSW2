package ingsw.proyecto.SAGI.model;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

public class UserLoginTest extends TestCase {
	
	UserLogin userLogin = new UserLogin();
	
	@Test
	public void testUserValidateFail() {
		userLogin.setUser("danilo06");
		userLogin.setPassword("root");
		assertFalse(userLogin.userValidate("sadasdasdasdas", "root"));
		System.out.println("No lo hace");
	}

	@Test
	public void testUserValidate() {
		userLogin.setUser("danilo06");
		userLogin.setPassword("root");
		assertTrue(userLogin.userValidate("danilo06", "root"));
		System.out.println("Si lo hace");
	}
	
}

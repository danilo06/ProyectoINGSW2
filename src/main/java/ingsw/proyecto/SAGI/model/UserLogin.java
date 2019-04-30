package ingsw.proyecto.SAGI.model;

public class UserLogin {
	
	private String password;
	private String user;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	/**
	 * @param password
	 * @param user
	 */
	public UserLogin(String user, String password ) {
		this.password = password;
		this.user = user;
	}
	
	

	
}

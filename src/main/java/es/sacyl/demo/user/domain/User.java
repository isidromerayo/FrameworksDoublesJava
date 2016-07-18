/**
 * 
 */
package es.sacyl.demo.user.domain;

/**
 * Class representing User entity.
 * 
 * @author isidromerayo
 *
 */
public class User {

	private String firstName;
	private String surname;
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}
	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

}

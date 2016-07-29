/**
 * 
 */
package es.sacyl.demo.mockito.privateMethod;

import java.util.Date;

/**
 * @author isidromerayo
 *
 */
public class MockPrivateMethodExample {
	/**
	 * 
	 * @return String
	 */
	public String getDetails() {
		return "Mock private method example: " + iAmPrivate();
	}

	private String iAmPrivate() {
		return new Date().toString();
	}
}

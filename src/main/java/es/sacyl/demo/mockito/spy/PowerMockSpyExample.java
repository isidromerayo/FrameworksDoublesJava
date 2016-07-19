/**
 * 
 */
package es.sacyl.demo.mockito.spy;

import java.util.Date;

/**
 * @author isidromerayo
 *
 */
public class PowerMockSpyExample {
	/**
	 * 
	 * @return String
	 */
	public String getCurrentDateAsString() {
		return new Date().toGMTString();
	}
}

/**
 * 
 */
package es.sacyl.demo.mockito.constructor;

import java.util.Calendar;

/**
 * @author isidromerayo
 *
 */
public class SimpleClass {
	@SuppressWarnings("deprecation")
	public String getMeCurrentDateAsString() {
		return Calendar.getInstance().getTime().toGMTString();

	}
}

/**
 * 
 */
package es.sacyl.demo.mockito.constructor;

/**
 * @author isidromerayo
 *
 */
public class PowerMockConstructorExample {
	/**
	 * 
	 * @return String
	 */
	public String getMeSimpleObject() {
		SimpleClass simpleClass = new SimpleClass();

		String returnValue = simpleClass.getMeCurrentDateAsString();
		return returnValue;
	}
}

/**
 * 
 */
package es.sacyl.demo.mockito.finalClass;

/**
 * @author isidromerayo
 *
 */
public class FinalClazzUser {

	private SimpleFinalClazz simpleFinalClazz;

	/**
	 * 
	 * @param simpleFinalClazz
	 */
	public FinalClazzUser(SimpleFinalClazz simpleFinalClazz) {
		this.simpleFinalClazz = simpleFinalClazz;
	}

	/**
	 * 
	 * @return String
	 */
	public String getMeSomething() {
		return "Get Me Something " + simpleFinalClazz.simpleFinalMethod();
	}
}

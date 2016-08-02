/**
 * 
 */
package es.sacyl.demo.mockito.voidMethod;

/**
 * @author isidromerayo
 *
 */
public class VoidMethodClass {

	public void voidMethodThrowingExcetion(boolean check) {
		if (check) {
			throw new IllegalArgumentException();
		}
	}

	public void someVoidMethod() {

	}

	public void methodWhichThrowException() throws Exception {
		throw new Exception();
	}
}

package es.sacyl.unit.demo.mockito.voidMethod;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import es.sacyl.demo.mockito.voidMethod.VoidMethodClass;

public class VoidMethodClassTest {

	private VoidMethodClass mock;

	@Test
	public void doNothing() {
		VoidMethodClass mockObject = Mockito.mock(VoidMethodClass.class);
		// doNothing().doThrow(new IllegalArgumentException()).when(mockObject).someVoidMethod();

		// does nothing the first time:
		mockObject.someVoidMethod();

		// throws IllegalArgumentException the next time:
		mockObject.someVoidMethod();
		Map map = new HashMap();
		Map spy = Mockito.spy(map);

		// let's make clear() do nothing
		Mockito.doNothing().when(spy).clear();

		spy.put("one", "1");

		// clear() does nothing, so the map still contains "one", "1"
		spy.clear();
	}

	@Test(expected = Exception.class)
	public void doThrow() throws Exception {
		VoidMethodClass mockObject = Mockito.mock(VoidMethodClass.class);
		Mockito.doThrow(new Exception()).when(mockObject).methodWhichThrowException();
		mockObject.methodWhichThrowException();
	}

	@Test
	public void testVoidMethodThrowingException() {
		mock = Mockito.mock(VoidMethodClass.class);
		Mockito.doThrow(new IllegalArgumentException()).when(mock).voidMethodThrowingExcetion(false);
		mock.voidMethodThrowingExcetion(true);
		Mockito.doThrow(new IllegalArgumentException()).when(mock).voidMethodThrowingExcetion(true);
		try {
			mock.voidMethodThrowingExcetion(true);
			Assert.fail();
		} catch (IllegalArgumentException e) {

		}

	}
}

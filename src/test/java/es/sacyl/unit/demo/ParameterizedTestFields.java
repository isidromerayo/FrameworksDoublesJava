/**
 * 
 */
package es.sacyl.unit.demo;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import es.sacyl.demo.MyClass;

/**
 * @author isidromerayo
 *
 */
@RunWith(Parameterized.class)
public class ParameterizedTestFields {

	@Parameter
	public int m1;
	@Parameter(value = 1)
	public int m2;

	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { { 1, 2 }, { 5, 3 }, { 121, 4 } };
		return Arrays.asList(data);
	}

	@Test
	public void testMultiplyException() {
		MyClass tester = new MyClass();
		assertEquals("Result", m1 * m2, tester.multiply(m1, m2));
	}

}

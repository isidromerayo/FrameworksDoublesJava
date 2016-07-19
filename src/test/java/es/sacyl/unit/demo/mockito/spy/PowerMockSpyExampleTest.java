/**
 * 
 */
package es.sacyl.unit.demo.mockito.spy;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import es.sacyl.demo.mockito.spy.PowerMockSpyExample;

/**
 * @author isidromerayo
 *
 */
@RunWith(PowerMockRunner.class)
// contains static method
@PrepareForTest(PowerMockSpyExample.class)
public class PowerMockSpyExampleTest {
	@Test
	public void testGetCurrentDateAsString() {
		PowerMockSpyExample spy = PowerMockito.spy(new PowerMockSpyExample());

		Mockito.when(spy.getCurrentDateAsString()).thenReturn("Test Date");
		String actual = spy.getCurrentDateAsString();
		Assert.assertEquals("Test Date", actual);
		Mockito.verify(spy, Mockito.times(1)).getCurrentDateAsString();
	}
}

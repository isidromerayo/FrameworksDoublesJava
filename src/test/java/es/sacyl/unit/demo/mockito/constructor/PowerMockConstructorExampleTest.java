/**
 * 
 */
package es.sacyl.unit.demo.mockito.constructor;

import static org.easymock.EasyMock.expect;
import static org.junit.Assert.assertEquals;
import static org.powermock.api.easymock.PowerMock.expectNew;
import static org.powermock.api.easymock.PowerMock.replay;
import static org.powermock.api.easymock.PowerMock.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.annotation.Mock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import es.sacyl.demo.mockito.constructor.PowerMockConstructorExample;
import es.sacyl.demo.mockito.constructor.SimpleClass;

/**
 * @author isidromerayo
 *
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(PowerMockConstructorExample.class)
public class PowerMockConstructorExampleTest {

	@Mock
	private SimpleClass mockSimpleClass;

	private PowerMockConstructorExample instance;

	@Test
	public void mockConstructor() throws Exception {
		instance = new PowerMockConstructorExample();
		expectNew(SimpleClass.class).andReturn(mockSimpleClass);

		expect(mockSimpleClass.getMeCurrentDateAsString()).andReturn("Mock Result");

		replay(SimpleClass.class, mockSimpleClass);
		String value = instance.getMeSimpleObject();
		verify(SimpleClass.class, mockSimpleClass);
		assertEquals("Mock Result", value);
	}
}

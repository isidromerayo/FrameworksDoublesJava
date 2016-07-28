package es.sacyl.unit.demo.mockito.staticMethod;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import es.sacyl.demo.mockito.staticMethod.AccountHolder;
import es.sacyl.demo.mockito.staticMethod.AccountManager;
import es.sacyl.demo.mockito.staticMethod.AccountSummary;
import es.sacyl.demo.mockito.staticMethod.Statement;

@RunWith(PowerMockRunner.class)
public class AccountManagerStaticMethodExampleTest {

	private AccountHolder accountHolder = new AccountHolder("Joe", "123");

	@PrepareForTest({ AccountManager.class })
	@Test
	public void stubStaticMethodToGetMiniStatement() {
		long balance = 9999L;
		AccountSummary accountSummary = new AccountSummary(accountHolder, balance);
		// Call mockStatic AccountManager.class to enable static mocking
		PowerMockito.mockStatic(AccountManager.class);

		// Stub static method AccountManager.getSummary
		PowerMockito.when(AccountManager.getSummary(accountHolder)).thenReturn(new AccountSummary(accountHolder, 9999));

		// Run
		Statement statement = accountHolder.getMiniStatement();

		// Verify the account summary details are correct
		assertEquals(accountSummary.getAccountHolder(), statement.getAccountSummary().getAccountHolder());
		assertEquals(accountSummary.getCurrentBalance(), statement.getAccountSummary().getCurrentBalance());
	}

}

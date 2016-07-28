/**
 * 
 */
package es.sacyl.demo.mockito.staticMethod;

/**
 * @author isidromerayo
 *
 */
public class AccountManager {
	/**
	 * 
	 * @param accountHolder
	 * @return AccountSummary
	 */
	public static AccountSummary getSummary(AccountHolder accountHolder) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param accountHolder
	 * @return Transaction[]
	 */
	public static Transaction[] getTransactions(AccountHolder accountHolder) {
		throw new UnsupportedOperationException();
	}

}

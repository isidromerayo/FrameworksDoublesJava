/**
 * 
 */
package es.sacyl.demo.mockito.staticMethod;

/**
 * @author isidromerayo
 *
 */
public class AccountSummary {
	private AccountHolder accountHolder;
	private long currentBalance;

	/**
	 * 
	 * @param accountHolder
	 * @param currentBalance
	 */
	public AccountSummary(AccountHolder accountHolder, long currentBalance) {
		this.accountHolder = accountHolder;
		this.currentBalance = currentBalance;
	}

	/**
	 * 
	 * @return AccountHolder
	 */
	public AccountHolder getAccountHolder() {
		return accountHolder;
	}

	/**
	 * 
	 * @return long
	 */
	public long getCurrentBalance() {
		return currentBalance;
	}
}

/**
 * 
 */
package es.sacyl.demo.mockito.staticMethod;

/**
 * @author isidromerayo
 *
 */
public class Statement {
	private AccountSummary accountSummary;
	private Transaction[] transactions;

	/**
	 * 
	 * @param accountSummary
	 * @param transactions
	 */
	public Statement(AccountSummary accountSummary, Transaction[] transactions) {
		this.accountSummary = accountSummary;
		this.transactions = transactions;
	}

	/**
	 * 
	 * @return AccountSummary
	 */
	public AccountSummary getAccountSummary() {
		return accountSummary;
	}

	/**
	 * 
	 * @return Transaction[]
	 */
	public Transaction[] getTransactions() {
		return transactions;
	}
}

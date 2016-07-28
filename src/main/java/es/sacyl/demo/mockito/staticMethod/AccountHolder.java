/**
 * 
 */
package es.sacyl.demo.mockito.staticMethod;

/**
 * @author isidromerayo
 *
 */
public class AccountHolder {
	private String name;
	private String accountNumber;

	/**
	 * 
	 * @param name
	 * @param accountNumber
	 */
	public AccountHolder(String name, String accountNumber) {
		this.name = name;
		this.accountNumber = accountNumber;
	}

	/**
	 * 
	 * @return String
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @return String
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * 
	 * @return Statement
	 */
	public Statement getMiniStatement() {
		AccountSummary accountSummary = AccountManager.getSummary(this);
		Transaction[] transactions = AccountManager.getTransactions(this);
		return new Statement(accountSummary, transactions);
	}
}

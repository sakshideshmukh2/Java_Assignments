package com.sakshi.transaction;

public class Transaction {

	int transacionId;
	String transactionName;
	long transactionFromAccount;
	long transactionToAccount;
	double transactionAmount;
	String transactionDate;

	public int getTransacionId() {
		return transacionId;
	}

	public void setTransacionId(int transacionId) {
		this.transacionId = transacionId;
	}

	public String getTransactionName() {
		return transactionName;
	}

	public void setTransactionName(String transactionName) {
		this.transactionName = transactionName;
	}

	public long getTransactionFromAccount() {
		return transactionFromAccount;
	}

	public void setTransactionFromAccount(long transactionFromAccount) {
		this.transactionFromAccount = transactionFromAccount;
	}

	public long getTransactionToAccount() {
		return transactionToAccount;
	}

	public void setTransactionToAccount(long transactionToAccount) {
		this.transactionToAccount = transactionToAccount;
	}

	public double getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	@Override
	public String toString() {
		return "Transaction [transacionId=" + transacionId + ", transactionName=" + transactionName
				+ ", transactionFromAccount=" + transactionFromAccount + ", transactionToAccount="
				+ transactionToAccount + ", transactionAmount=" + transactionAmount + ", transactionDate="
				+ transactionDate + "]";
	}

	public Transaction(int transacionId, String transactionName, long transactionFromAccount, long transactionToAccount,
			double transactionAmount, String transactionDate) {
		super();
		this.transacionId = transacionId;
		this.transactionName = transactionName;
		this.transactionFromAccount = transactionFromAccount;
		this.transactionToAccount = transactionToAccount;
		this.transactionAmount = transactionAmount;
		this.transactionDate = transactionDate;
	}

	public Transaction(String transactionName, long transactionFromAccount, long transactionToAccount,
			double transactionAmount, String transactionDate) {
		super();
		this.transactionName = transactionName;
		this.transactionFromAccount = transactionFromAccount;
		this.transactionToAccount = transactionToAccount;
		this.transactionAmount = transactionAmount;
		this.transactionDate = transactionDate;
	}

	public Transaction() {
		super();
	}

}
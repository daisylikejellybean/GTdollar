package gtdollar.com.test.contract;

import gtdollar.com.test.User;

public class TransactionRequest {
	private String email;
	private String transferee;
	private double amount;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTransferee() {
		return transferee;
	}
	public void setTransferee(String transferee) {
		this.transferee = transferee;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}


}

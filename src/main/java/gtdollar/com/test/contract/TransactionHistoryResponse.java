package gtdollar.com.test.contract;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import gtdollar.com.test.Transaction;

@JsonInclude(Include.NON_NULL)
public class TransactionHistoryResponse {
	private String errorMessage;
	private Boolean isSucess = false;
	private ArrayList<Transaction> transactions = null;

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getIsSucess() {
		return isSucess;
	}

	public void setIsSucess(Boolean isSucess) {
		this.isSucess = isSucess;
	}

	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(ArrayList<Transaction> transactions) {
		this.transactions = transactions;
	}

}

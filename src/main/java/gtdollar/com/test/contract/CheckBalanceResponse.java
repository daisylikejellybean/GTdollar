package gtdollar.com.test.contract;

import static org.hamcrest.CoreMatchers.nullValue;

import javax.validation.constraints.Null;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import gtdollar.com.test.User;

@JsonInclude(Include.NON_NULL)
public class CheckBalanceResponse {
	private String errorMessage;
	private Boolean isSucess = false;
	private Double balance=null;

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean isSucess() {
		return isSucess;
	}

	public void setSucess(Boolean isSucess) {
		this.isSucess = isSucess;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(User user) {
		balance=user.getBalance() ;
	}

}

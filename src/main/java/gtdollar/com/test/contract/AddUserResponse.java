package gtdollar.com.test.contract;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class AddUserResponse {
 private String errorMessage;
 private Boolean isSucess = false;
 private Double balance = null;

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

 public void setBalance(Double balance) {
  this.balance = balance;
 }

}
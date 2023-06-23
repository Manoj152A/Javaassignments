package com.Task11.Bankaccount;

/*Create a class called BankAccount that has private variables
accountNumber, balance, and customerName. Create public methods
 to access and modify these variables,
 such as getAccountNumber(), getBalance(),
  getCustomerName(), setAccountNumber(),
  setBalance(), and setCustomerName().
 */
public class BankAccount {
    private String accountNumber;
    private Double balance;
    private String customerName;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
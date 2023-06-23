package com.task3.bank;

public class Savingsaccount extends BankAccount{
    double MinimumBalance=500;
    double AccountBalance=4000;
    int withdrawBalance;
    int balance;
    public void withdraw(int withdrawAmount)
    {
        if (withdrawAmount > 0.0 && withdrawAmount > balance)
        {
            System.out.println("Withdrawal amount exceeded account balance");
            return;
        }

        balance = balance - withdrawAmount;
    }

}

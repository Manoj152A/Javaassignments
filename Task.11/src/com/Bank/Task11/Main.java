package com.Bank.Task11;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();
        bankAccount.setAccountNumber(123456789);
        bankAccount.setBalance(5000.00);
        bankAccount.setCoustmerName("Manoj Mandava");

        System.out.println("Account number:"+ bankAccount.getAccountNumber());
        System.out.println("Balance:"+bankAccount.getBalance());
        System.out.println("Name:"+bankAccount.getCoustmerName());
    }

}

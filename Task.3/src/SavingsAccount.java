public class SavingsAccount extends Bankaccount{

    double minimumbalance=500;
    double balance=4000;



    public void withdraw(int withdrawAmount ) {
        if (withdrawAmount >minimumbalance)
            System.out.println("The transaction is declined the withdrawal amount is greater than minimum balance");
        else {
            balance = balance - withdrawAmount;
        }


    }}

public class Main {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount();


        account.withdraw(400);


        System.out.println("Remaining balance: " + account.balance);
    }
}

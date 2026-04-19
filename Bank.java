public class Bank {

    public void processAccounts(Account[] accounts){
        for (Account a : accounts){
            System.out.println("BALANCE: " + a.getBalance());
            a.deposit(100.00);
            a.withdraw(50.0);
            System.out.println("Updated balance: " + a.getBalance());
        }

    }
}

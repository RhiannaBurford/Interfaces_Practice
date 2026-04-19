public class SavingsAccount implements Account, Describable{

    private double balance;
    private double interestRate;

    public SavingsAccount(double balance, double interestRate){
        this.balance = balance;
        this.interestRate = interestRate;
    }

    @Override 
    public double getBalance(){
        return balance;
    }

    @Override
    public void deposit(double amount){
        balance = balance + amount;
    }

    @Override
    public boolean withdraw(double amount){
        double difference = balance - amount;
        if (difference < 0){
            return false; // No overdraft
        }
        else {
            balance = difference;
            return true;
        }
    }


    @Override
    public String getAccountType(){
        return "Savings Account";
    }

    public void applyInterest(){
        balance = balance + (balance * interestRate);
    }
}

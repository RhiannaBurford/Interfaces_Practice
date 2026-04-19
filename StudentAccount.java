public class StudentAccount implements Account, Describable{

    private double balance;

    public StudentAccount(double balance){
        this.balance = balance;
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
        return "Student Account";
    }
}

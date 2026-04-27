public class CardPayment implements PaymentMethod{

    private double fee = 1.50;

    @Override
    public void pay(double amount){
        System.out.println("Paid " + (amount + fee) + " using card.");
    }

}

public class SMSNotifier implements Notifier{

    private int phoneNum;

    public SMSNotifier(int phoneNum){
        this.phoneNum = phoneNum;
    }

    @Override
    public void send(String message){
        System.out.println("Sending text to " + phoneNum + ": " + message);
    }
}

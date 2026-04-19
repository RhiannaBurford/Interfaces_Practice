public class NotificationService{

    public void sendAll(Notifier[] notifiers, String message){
        for (Notifier n : notifiers){
            n.send(message);
        }
    }
}

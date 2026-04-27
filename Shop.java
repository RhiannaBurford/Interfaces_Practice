public class Shop {


    public void processAll(PaymentMethod[] objects){

        for (int i = 0; i < objects.length; i++){
            objects[i].pay(100.0);
        }
    }
}

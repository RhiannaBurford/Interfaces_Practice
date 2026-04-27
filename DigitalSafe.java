public class DigitalSafe implements Movable{

    private boolean isLocked;

    @Override
    public void lock(){
        isLocked = true;
    }

    @Override
    public void unlock(){
        isLocked = false;
    }


    public void checkStatus(){
        if (isLocked){
            System.out.println("Safe is locked.");
        }
        else {
            System.out.println("Safe is NOT locked.");
        }
    }
}

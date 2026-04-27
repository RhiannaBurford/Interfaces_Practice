public class AllInOneMachine implements Printer, Scanner{

    @Override
    public void printDocument(String text){
        System.out.println("Printing.... " + text);
    }

    @Override
    public String scanDocument(){
        String test = "hello";
        System.out.println("Scanned document.");
        return test;
    }
}

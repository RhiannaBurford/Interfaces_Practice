public class GermanToEnglish implements Uebersetzer{

    // Es sind keine privaten Attribute erforderlich

    @Override
    public String translate(String wort){
        if (wort.equals("die Wiedervereinigung")){
            return "reunification";
        }
        else if (wort.equals("Erdkunde")){
            return "geography";
        }
        else if (wort.equals("die Grenze")){
            return "border";
        }
        else {
            return "unknown";
        }
    }
}

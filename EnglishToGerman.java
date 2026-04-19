public class EnglishToGerman implements Uebersetzer{

    @Override
    public String translate(String wort) {
        if (wort.equals("house")) {
            return "das Haus";
        } else if (wort.equals("cat")) {
            return "die Katze";
        } else if (wort.equals("dog")) {
            return "der Hund";
        } else if (wort.equals("car")) {
            return "das Auto";
        } else if (wort.equals("tree")){
            return "der Baum";
        } else {
            return "unbekannt"; // Es ist ein ziemlich einfacher Übersetzer, aber gute Uebung
        }
    }
}

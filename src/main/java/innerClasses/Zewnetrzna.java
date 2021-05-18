package innerClasses;

public class Zewnetrzna {
    private String poleKlasy;
    private static String poleKlasyStatyczne;

    public Zewnetrzna(String poleKlasy) {
        this.poleKlasy = poleKlasy;
    }




    static class WewnetrznaKlasaStatyczna{
        int cos;

        void metoda(){
            poleKlasyStatyczne = "asdas";

        }
    }


    class WewnetrznaKlasa{
        //
    }
}

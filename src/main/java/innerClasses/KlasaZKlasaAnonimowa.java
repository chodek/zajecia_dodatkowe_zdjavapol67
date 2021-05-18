package innerClasses;

import functionalInterfaces.SomeFunctionalInterfaceWithVoidMethod;
import interfaces.MyClass;
import interfaces.Singing;

public class KlasaZKlasaAnonimowa {
    public static void main(String[] args) {

        Singing zmiennaTypuInterfejsu0 = new MyClass();

        Singing zmiennaTypuInterfejsu = new Singing() {
            @Override
            public String returnString(String given) {
                return given + "hahahaa";
            }
        };

        Singing zmiennaTypuInterfejsu2 = (s) -> s + " !!!";
        System.out.println(zmiennaTypuInterfejsu2.returnString("ala"));


        Singing zmiennaTypuInterfejsu3 = (s) -> {
            s = s.toLowerCase();
            return s + " ";
        };


        SomeFunctionalInterfaceWithVoidMethod zmiennatypuInterfejsu4 = (s, l) -> {
            System.out.println(s + (l+1));
        };



        //SomeFunctionalInterfaceWithVoidMethod zmiennatypuInterfejsu5 = () -> System.out.println("Jestem w lambdzie");

    }
}

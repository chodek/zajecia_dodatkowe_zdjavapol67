package functionalInterfaces;

import interfaces.Singing;

public class MethodReferences {

    public static void main(String[] args) {


        // Aby uzyc referencji do metody, lambda musi posiadac tylko jeden argument, a takze:
        StringConsumer lambda1 = s -> System.out.println(s);

        // a) argument wejsciowy lambdy, jest argumentem metody do ktorej chcesz zrobic refencje:
        StringConsumer lambda2 = System.out::println;

        // b) na argumencie wejsciowym lambdy wywolywana jest bezargumentowa metoda
        StringConsumer lambda3 = String::length;


        lambda1.consume("Ala");
        lambda2.consume("Ala");
        lambda3.consume("Ala");





    }
}

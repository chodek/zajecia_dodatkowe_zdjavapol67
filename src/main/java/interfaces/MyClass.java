package interfaces;

public class MyClass implements Singing {

    @Override
    public String returnString(String given) {
        return "myClass";
    }


    public void scream(){
        System.out.println("Uuuu!");
    }



}

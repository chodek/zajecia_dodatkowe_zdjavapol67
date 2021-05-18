package comparing;

public class Author implements Comparable<Author> {

    private int age;
    private String name;
    private String surname;


    public Author(int age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }


    @Override
    public int compareTo(Author o) {
        int result = this.surname.compareTo(o.surname);
        if (result == 0){
            result = Integer.compare(this.age, o.age);
        }
        return result;
    }
}

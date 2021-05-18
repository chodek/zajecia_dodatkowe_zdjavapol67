package comparing;

import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args) {

       /* showSort();
        showCompareTo();  */

        String alabama = "Alabama";
        String zofia = "Zofia";

        Comparator myOwnComparator = new MyOwnComparator();
        System.out.println(myOwnComparator.compare(alabama, zofia));

        String[] strings = {alabama, zofia};

        Arrays.sort(strings, myOwnComparator);

    }

    private static void showCompareTo() {
        Set<BigDecimal> bigDecimalSet = new TreeSet<>();
        bigDecimalSet.add(new BigDecimal("1.0"));
        bigDecimalSet.add(new BigDecimal("1.00"));
        System.out.println(bigDecimalSet);

    }

    private static void showSort() {
        Author first = new Author(10,"Jan", "Brzechwa");
        Author second = new Author(50,"Tomasz", "Rozek");
        Author third = new Author(1,"Jan", "Brzechwa");

        Author[] authors = {first, second, third};
        Arrays.sort(authors);

        int[] ints = {100,2,23};
        Arrays.sort(ints);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}

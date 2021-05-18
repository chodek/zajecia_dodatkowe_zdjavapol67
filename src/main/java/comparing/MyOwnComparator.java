package comparing;

import java.util.Comparator;

public class MyOwnComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return Integer.compare(o1.length(), o2.length());

        // return o1.length() - o2.length(); dzialalo by tak samo jakl linijka powyzej
    }
}

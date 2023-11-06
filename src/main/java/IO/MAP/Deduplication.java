package IO.MAP;

import java.util.HashSet;
import java.util.Iterator;

public class Deduplication {
    public static void main(String args[]) {
        HashSet<String> uniqueStrings = new HashSet<>();

        String[] stringsArray = {"apple", "banana", "apple", "cherry"};

        for (String str : stringsArray) {
            uniqueStrings.add(str);
        }
        System.out.println("Unique Strings: ");

        Iterator<String> iterator = uniqueStrings.iterator();
                while (iterator.hasNext()) {
                String uniqueString = iterator.next();
                System.out.println(uniqueString);


        }

    }
}
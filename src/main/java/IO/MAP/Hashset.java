package IO.MAP;

import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        System.out.println("HashSet Elements before adding duplicate : "+set);

        set.add(3);


        System.out.println("HashSet Elements after adding duplicate : "+set);




    }
}

package org.example.IO.MAP;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class TreeSetExample {

        public static void main(String[] args)
        {

            Set<Integer> sortedSet = new TreeSet<Integer>();

            sortedSet.add(14);
            sortedSet.add(22);
            sortedSet.add(29);
            sortedSet.add(2);

            System.out.println(sortedSet);


            Iterator<Integer> i = sortedSet.iterator();
            while (i.hasNext())
                System.out.println(i.next());

        }
}





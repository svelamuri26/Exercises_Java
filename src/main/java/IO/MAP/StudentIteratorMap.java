package IO.MAP;

import java.util.HashMap;
import java.util.Map;

public class StudentIteratorMap {

        public static void main(String[] args) {
           HashMap<Integer, String> studentMap = new HashMap<>();


            studentMap.put(10, "Phillip");
            studentMap.put(11, "Martin");
            studentMap.put(12, "Dustin");


            for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
                int studentId = entry.getKey();
                String studentName = entry.getValue();
                System.out.println("Student ID: " + studentId + ", Student Name: " + studentName);
            }



            studentMap.put(14,"Joan");
            studentMap.put(13,"Ruki");

            studentMap.remove(13);

            System.out.println(studentMap);

            for (Map.Entry<Integer, String> e : studentMap.entrySet())

                System.out.println(e.getKey() + " " + e.getValue());

        }


}

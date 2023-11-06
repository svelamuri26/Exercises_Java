package IO.MAP;


import java.util.HashMap;

public class StudentDetails {
    public static void main(String[] args) {

        HashMap<Integer, String> studentMap = new HashMap<>();


        studentMap.put(1, "Liam");
        studentMap.put(2, "Shelly");
        studentMap.put(3, "Missy");

        System.out.println("Student Details : " + studentMap);

        int studentId = 2;

        if (studentMap.containsKey(studentId)) {
            String studentName = studentMap.get(studentId);
            System.out.println("Student ID " + studentId + " belongs to " + studentName);
        } else {
            System.out.println("Student with ID " + studentId + " not found in the map.");
        }



    }
}


package IO.MiniProject_Employee;

import java.util.HashSet;
import java.util.Objects;

class Employee {

    private String name;
    private int employeeID;
    private String department;
    private String jobTitle;
    private int managerID;

    public Employee(String name, int employeeID, String department, String jobTitle, int managerID) {
        this.name = name;
        this.employeeID = employeeID;
        this.department = department;
        this.jobTitle = jobTitle;
        this.managerID = managerID;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getManagerID() {
        return managerID;
    }

    public void setManagerID(int managerID) {
        this.managerID = managerID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeID == employee.employeeID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeID);
    }

}


    public class EmployeeManagementSystem {
        public static void main(String[] args) {

            HashSet<Employee> employeeSet = new HashSet<>();

            Employee emp1 = (new Employee("Sai", 001, "IT", "Engineer", 100));
            Employee emp2 = (new Employee("Antje", 002, "HR", "Manager", 200));
            Employee emp3 = (new Employee("Joan", 003, "Finance", "Accountant", 300));
            Employee emp4 = (new Employee("Martin", 004, "IT", "Admin", 400));
            Employee emp5 = (new Employee("Dustin", 005, "Finance", "Research", 500));

            employeeSet.add(emp1);
            employeeSet.add(emp2);
            employeeSet.add(emp3);
            employeeSet.add(emp4);
            employeeSet.add(emp5);


            Employee duplicateEmployee = new Employee("Martin", 002, "Sales", "Sales Manager", 200);
            employeeSet.add(duplicateEmployee);

            System.out.println("Unique Employees in the HashSet:");
            for (Employee employee : employeeSet) {
                System.out.println("ID: " + employee.getEmployeeID() + ", Name: " + employee.getName());
            }

        }

    }






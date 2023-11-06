package org.example.IO.MiniProject_Employee;

import java.util.*;
import java.util.stream.Collectors;


class Employee1 {
    private String name;
    private int employeeID;
    private String department;
    private String jobTitle;
    private int managerID;

    public Employee1(String name, int employeeID, String department, String jobTitle, int managerID) {
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
        Employee1 employee = (Employee1) o;
        return employeeID == employee.getEmployeeID();
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeID);
    }
}
class Employee_Management {
    private Map<Integer, Employee1> employeeMap = new HashMap<>();
    private Set<Employee1> employeeSet = new HashSet<>();

        public void addEmployee(Employee1 employee) {
        employeeMap.put(employee.getEmployeeID(), employee);
        employeeSet.add(employee);
    }

    public Employee1 getEmployeeByID(int employeeID) {
        return employeeMap.get(employeeID);
    }

    public void removeEmployeeByID(int employeeID) {
        Employee1 employee = employeeMap.remove(employeeID);
        if (employee != null) {
            employeeSet.remove(employee);
        }
    }

    public List<Employee1> filterEmployeesByDepartment(String department) {
        return employeeSet.stream()
                .filter(employee -> employee.getDepartment().equals(department))
                .collect(Collectors.toList());
    }

    public List<Employee1> filterEmployeesByJobTitle(String jobTitle) {
        return employeeSet.stream()
                .filter(employee -> employee.getJobTitle().equals(jobTitle))
                .collect(Collectors.toList());
    }

    public List<Employee1> filterEmployeesByManager(int managerID) {
        return employeeSet.stream()
                .filter(employee -> employee.getManagerID() == managerID)
                .collect(Collectors.toList());
    }

    public boolean updateEmployeeInformation(String name, int employeeID, String newDepartment,
                                             String newJobTitle, int newManagerID) {
        Employee1 employee = employeeMap.get(employeeID);
        if (employee == null) {
            return false;
        }
        if (newManagerID != employeeID && employeeMap.get(newManagerID) == null) {
            return false;
        }
        employee.setDepartment(newDepartment);
        employee.setJobTitle(newJobTitle);
        employee.setManagerID(newManagerID);

        return true;
    }

    public int getTotalEmployeeCount() {
        return employeeSet.size();
    }
    private Map<String, Long> getEmployeeCountPerDepartment() {
            return null;
    }




    public static void main(String[] args) {
        Employee_Management employeeDetails = new Employee_Management();

        Employee1 emp1 = new Employee1("Sai", 001, "IT", "Engineer", 100);
        Employee1 emp2 = new Employee1("Antje", 002, "HR", "Manager", 200);
        Employee1 emp3 = new Employee1("Joan", 003, "Finance", "Accountant", 300);
        Employee1 emp4 = new Employee1("Martin", 004, "IT", "Admin", 400);
        Employee1 emp5 = new Employee1("Dustin", 005, "Finance", "Research", 500);

        employeeDetails.addEmployee(emp1);
        employeeDetails.addEmployee(emp2);
        employeeDetails.addEmployee(emp3);
        employeeDetails.addEmployee(emp4);
        employeeDetails.addEmployee(emp5);

        System.out.println("Unique Employees in the HashSet:");
        for (Employee1 employee : employeeDetails.employeeSet) {
            System.out.println("ID: " + employee.getEmployeeID() + ", Name: " + employee.getName());
        }

        Employee1 retrievedEmployee = employeeDetails.getEmployeeByID(004);
        if (retrievedEmployee != null) {
            System.out.println("Retrieved Employee: " + retrievedEmployee.getName());
        } else {
            System.out.println("Employee not found.");
        }

        employeeDetails.removeEmployeeByID(001);

        Employee1 deletedEmployee = employeeDetails.getEmployeeByID(002);
        if (deletedEmployee != null) {
            System.out.println("Deleted Employee: " + deletedEmployee.getName());
        } else {
            System.out.println("Employee not found.");
        }

        List<Employee1> hrEmployees = employeeDetails.filterEmployeesByDepartment("HR");
        System.out.println("HR Employees:");
        for (Employee1 employee : hrEmployees) {
            System.out.println("ID: " + employee.getEmployeeID() + ", Name: " + employee.getName());
        }

        List<Employee1> engineers = employeeDetails.filterEmployeesByJobTitle("Engineer");
        System.out.println("Engineers:");
        for (Employee1 employee : engineers) {
            System.out.println("ID: " + employee.getEmployeeID() + ", Name: " + employee.getName());
        }

        List<Employee1> managerEmployees = employeeDetails.filterEmployeesByManager(200);
        System.out.println("Employees Managed by Manager with ID 200:");
        for (Employee1 employee : managerEmployees) {
            System.out.println("ID: " + employee.getEmployeeID() + ", Name: " + employee.getName());
        }
        boolean updated = employeeDetails.updateEmployeeInformation("Vasista ",007, "IT", "Senior Engineer", 700);
        if (updated) {
            System.out.println("Employee information updated successfully.");
        } else {
            System.out.println("Failed to update employee information.");
        }

        Employee1 updatedEmployee = employeeDetails.getEmployeeByID(001);
        System.out.println("Updated Employee Information:");
        System.out.println("ID: " + updatedEmployee.getEmployeeID() + ", Name: " + updatedEmployee.getName());
        System.out.println("Department: " + updatedEmployee.getDepartment());
        System.out.println("Job Title: " + updatedEmployee.getJobTitle());
        System.out.println("Manager ID: " + updatedEmployee.getManagerID());

        int totalEmployees = employeeDetails.getTotalEmployeeCount();
        System.out.println("Total Employees: " + totalEmployees);


        Map<String, Long> employeesPerDepartment = employeeDetails.getEmployeeCountPerDepartment();
        System.out.println("Employees per Department:");
        for (Map.Entry<String, Long> entry : employeesPerDepartment.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }


}

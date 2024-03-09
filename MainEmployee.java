public class MainEmployee {
    public static void main(String[] args) {

        // Creating an object of the class Employee
        Employee employee = new Employee();

        // Setting the attributes
        employee.setFullName("Riya Sharma");
        employee.setAge(25);
        employee.setSalary(600.25);
        employee.setDepartment("IT");

        // Printing values
        employee.printEmployeeDetails();
    }
}
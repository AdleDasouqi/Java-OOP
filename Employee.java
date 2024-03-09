public class Employee {
    // Properties or attributes of the Employee class
    String fullName;
    int age;
    double salary;
    String department;
    
    // methods to set firstName, age, salary and departmenet of the Employee class
    public void setFullName(String fullName) {
        this.fullName = fullName ;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void printEmployeeDetails() {
        System.out.println("Employee Details:");
        System.out.println("Full Name: " + this.fullName);
        System.out.println("Age: " + this.age);
        System.out.println("Salary: " + this.salary);
        System.out.println("Departmenet: " +this.department);
    }
}

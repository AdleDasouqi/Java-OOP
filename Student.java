public class Student {
    // Instance Variables
    int studentage;
    double studentGrade;

    // Constructor to initialize the Student object.
    public Student(String fullName) { // This constructor has one parameter, fullName.
        System.out.println("Student Details: ");
        System.out.println("Full Name: " + fullName);
    }

    // Setter 
    public void setAge(int age) {
        studentage = age;
    }

    // Getter
    public int getAge() {
        System.out.println("Age: " + studentage);
        return studentage;
    }

    public void setGrade(double grade) {
        studentGrade = grade;
    }

    public double getGrade() {
        System.out.println("Grade: " + studentGrade);
        return studentGrade;
    }
}

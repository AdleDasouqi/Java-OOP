public class GetterandSetter {
    // Instance Variables
    int studentage;
    double studentGrade;

    // Constructor to initialize the Student object.
    public GetterandSetter(String fullName) { // This constructor has one parameter, fullName.
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

    public static void main(String[] args) {
        // Object Creation
        GetterandSetter objStudent = new GetterandSetter("Rama Gupta");

        // Call class method to set student age
        objStudent.setAge(20);

        // You can access instance variable as follows as well
        System.out.println("Age: " + objStudent.studentage);

        // Call class method to set student grade
        objStudent.setGrade(90.2);

        // Call class method to get student grade
        objStudent.getGrade();
    }
}

/* 
 * Note 🧑🏻‍💻
 * When dealing with instance variables (also known as properties or attributes), 
   you typically use getter and setter methods to access and modify their values. 
   However, there are two main ways to print the value of an instance variable:
   1- Using Getter Method: 
   * This is the recommended approach and follows the principle of encapsulation, 
     where the internal state of an object is accessed or modified through 
     its public methods (getters and setters).

   * Getter methods provide a controlled way to access the value of an instance 
     variable, ensuring data integrity and encapsulation.

   2- Directly Accessing Instance Variable:
   * you can also access instance variables directly within the class where they 
     are declared (including within getter and setter methods).

   * While it's possible to access instance variables directly, it's generally 
     not recommended because it breaks encapsulation.
*/
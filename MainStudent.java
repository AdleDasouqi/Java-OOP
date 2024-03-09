public class MainStudent {
    public static void main(String[] args) {
        // Object Creation
        Student objStudent = new Student("Rama Gupta");

        // Call class method to set student age
        objStudent.setAge(20);

        // You can access instance variable as follows as well
        System.out.println("Age: " + objStudent.studentage);

        // Call class method to set student grade
        objStudent.setGrade(90.2);

        // Call class method to get student grade
        objStudent.getGrade();
        
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
    }
}

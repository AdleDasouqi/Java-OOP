public class Aggergation {
    public static void main(String[] args) {
        Address address = new Address(5, "Amman", "Irbid", "Jordan");

        Student student = new Student(10, "Lara", address);

        System.out.println("Studnet Number: " + student.id);
        System.out.println("Student Name: " + student.studentName);
        System.out.println("Street: " + student.address.street); 
        System.out.println("City: " + student.address.city);
        System.out.println("Country: " + student.address.country);
    }
}

class Address {
    int street;
    String city;
    String state;
    String country;

    Address(int street, String city, String state, String country) {
        this.street = street;
        this.state = state;
        this.country = country;
    }
}

class Student {
    int id;
    String studentName;

    Address address;

    Student(int id, String studentName, Address address) {
        this.id = id;
        this.studentName = studentName;
        this.address = address;
    }
}

/*
 * Note 🧑🏻‍💻
 * Aggregation refers to a relationship between two classes where one class contains an instance 
   of another class as a member variable. This relationship implies a "has-a" relationship, 
   meaning that one class has another class as a part of its structure.
   Aggregation helps in reusing the code.
   Aggregation is a one way directed relationship that precisely expresses HAS-A relationship between classes.
*/
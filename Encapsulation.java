public class Encapsulation {
    public static void main(String[] args) {
        Book book = new Book("Effective Java", "Joshua Bloch", 2001);
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Year: " + book.getYear());

        System.out.println();

        WriteOnlyData data = new WriteOnlyData();
        data.setData(10);
        System.out.println("Data was set successfully.");
    }
}

class Person {
    private String name;
    private int age;

    public String getname() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }
}

// Encapsulation: Read-Only Class
class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }
}

// Encapsulation: Write-Only
class WriteOnlyData {
    private int data;

    public void setData(int data) {
        this.data = data;
    } 
}

/* 
 * Note 🧑🏻‍💻
 * Encapsulation is a mechanism of wrapping the data (variables) and code acting 
   on the data (methods) together as a single unit. In encapsulation, the variables of 
   a class will be hidden from other classes, and can be accessed only through the methods 
   of their current class. Therefore, it is also known as data hiding

* Encapsulation: Read-Only Class
  A read-only class can have only getter methods to get the values of the attributes, there should not be any setter method.

* Encapsulation: Write-Only
  A write-only class can have only setter methods to set the values of the attributes, there should not be any getter method.

*/
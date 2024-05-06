public class Overriding {
    public static void main(String[] args) {
        // Animal reference and object
        Animal animal = new Animal();
        // Animal reference but Dog object
        Animal dog = new Dog(); // Dynamic Binding	 

        animal.move();
        dog.move();
    }
}

class Animal {
    public void move() {
        System.out.println("Animals can move");
    }
}

class Dog extends Animal {
   
    @Override
    public void move() {
        // invokes the super class method
        super.move();
        System.out.println("Dogs can walk and run");
    }
}
    
    /*
     * compile time error the Animal class doesn't have a method by the name of bark.
    @Override
    public void bark() {
        System.out.println("Dogs can bark");
    }
    */

/*
 * Note: 🧑🏻‍💻
 * Method overriding allows us to achieve run-time polymorphism and is used for writing specific definitions 
   of a subclass method that is already defined in the superclass. 
   The method is superclass and overridden method in the subclass should have the same declaration signature 
   such as parameters list, type, and return type.

 * Usage of Java Method Overriding
   1. Method overriding is used for achieving run-time polymorphism.
   2. Method overriding is used for writing specific definition of a subclass method (this method is known as the overridden method).
 
* Method and Constructor Overriding
  Each class has a different name and the constructor's name is the same as the class name. 
  Thus, we cannot override a constructor as they cannot have the same name.

* Method Overriding: Using the super Keyword
  When invoking a superclass version of an overridden method the super keyword is used.

* Dynaimc Binding
  Dynamic binding refers to the process in which linking between method call and method implementation 
  is resolved at run time (or, a process of calling an overridden method at run time).
  Dynamic binding is also known as run-time polymorphism or late binding.
*/
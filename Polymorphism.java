public class Polymorphism {
    public static void main(String[] args) {
      // deer, animal, vagetarian and object are reference variables refer to the same Deer object.
      Deer deer = new Deer();
      Animal animal = deer;
      Vegetarian vegetarian = deer;
      Object object = deer;

      System.out.println(deer instanceof Deer);
      System.out.println(animal instanceof Deer);
      System.out.println(vegetarian instanceof Deer);
      System.out.println(object instanceof Deer);

      System.out.println();

      // Compile time polymorphism
      Addition add = new Addition();

      // Calling the overloaded methods
      int result = add.addition(5, 5);
      System.out.println("Addition of two integers: " + result);

      result = add.addition(5, 1, 2);
      System.out.println("Addition of three numbers: " + result);

      double resultDouble = add.addition(1.2, 2.2);
      System.out.println("Addition of two doubles: " + resultDouble);

      // Run time polymorphism
      // Vehicle vehicleCar = new Car();
      // Vehicle vehicleBike = new Bike();

      // vehicleCar.displayInfo();
      // vehicleBike.displayInfo();
    }
}

interface Vegetarian {
  // Some code ...
}

class Animal {
  // Some code...
}

// The Deer class is considered to be polymorphic since this has multiple inheritance.
class Deer extends Animal implements Vegetarian {
  /* 
   * A Deer IS-A Animal
   * A Deer IS-A Vertararian
   * A Deer IS-A Deer
   * A Deer IS-A Object
  */
}

// Compile time polymorphism
class Addition {
  // This occurs when there are multiple methods with the same name but different parameters in the same class.
  public int addition(int num1, int num2) {
    return num1 + num2;
  }

  public int addition(int num1, int num2, int num3) {
    return num1 + num2 + num3;
  }

  public double addition(double num1, double num2) {
    return num1 + num2;
  }
}

// Run time polymorphism
class Vehicle {
  public void displayInfo() {
    System.out.println("Some vehicles are there");
  }
}

class Car extends Vehicle {
  // Method overriding
  @Override
  public void displayInfo() {
    System.out.println("I have a Car");
  }
}

class Bike extends Vehicle {
  @Override
  public void displayInfo() {
    System.out.println("I have a Bike");
  }
}

/*
 * Note: 🧑🏻‍💻
 * Polymorphism is the ability of an object to take on many forms. 
   The most common use of polymorphism in OOP occurs when a parent class reference 
   is used to refer to a child class object. 
 
 * Types of Java Polymorphism
   1. Compile Time Polymorphism
      Is also known as static polymorphism and it is implemented by method overloading.

   2. Run Time Polymorphism
      Is also known as dynamic method dispatch and it is implemented by the method overriding.
*/
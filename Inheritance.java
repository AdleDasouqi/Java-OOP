public class Inheritance { 
    // Some Code...
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        Math calcMath = new Math(0);
        calcMath.addition(num1, num2);
        calcMath.subtraction(num1, num2);
        calcMath.multipliction(num1, num2);

        System.out.println();

        System.out.println("Super Keyword");
        calcMath.childMethod();

        System.out.println();

        System.out.println("Invoking Superclass Constructor");
        calcMath.getNumber();

        System.out.println();

        System.out.println("instance operator");
        System.out.println(calcMath instanceof Calculation);

        System.out.println();

        System.out.println("implements keyword with interface");
        
        newMath newCal = new newMath();
        System.out.println(newCal instanceof newMath);
    }
}

// Java Single Inheritance
class Calculation {
    int result;
    int number;

    Calculation(int number) {
        this.number = number;
    }

    public void getNumber() {
        System.out.println("The value of the variable named number in super class is: " + number);
    }

    public void addition(int num1, int num2) {
        result = num1 + num2;
        System.out.println("The sum of the given numbers = " + result);
    }

    public void display() {
        System.out.println("This is the display method of supercalss");
    }

    public void subtraction(int num1, int num2) {
        result = num1 - num2;
        System.out.println("The difference between the given numbers = " + result);
    }
}

class Math extends Calculation  { 
    Math(int number) {
        super(number);
    }

    public void multipliction(int num1, int num2) {
        result = num1 * num2;
        System.out.println("The product of the gien numbers = " + result);
    }

    public void display() {
        System.out.println("This is the display method of subclass");
    }

    public void childMethod() {
        // Instantiating subclass
        Math calculationMath = new Math(0);

        // Invoking the display() method of child class
        calculationMath.display();

        // Invoking the display() method of superclass
        super.display();
    }
}

interface Eexponential {
    // Some code...
}

class newMath implements Eexponential {
    // Some code...
}

// Multilevel Inheritance
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Labardor extends Dog { 
    void color() {
        System.out.println("Labardor is brown in color");
    }
}

// Java Hierarchical Inheritance
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

class Puppy extends Animal {
    void play() {
        System.out.println("Puppy is playing");
    }
}

/* 
 * Note 🧑🏻‍💻
 * Inheritance is a process where one class acquires the properties (methods and attributes) of another.
   The class which inherits the properties of other is known as subclass (derived class, child class) 
   and the class whose properties are inherited is known as superclass (base class, parent class).
   
 * Need of Java Inheritance
   1. Code Reusability
   2. Extensibility
   3. Implantation of Method Overriding
   4. Achieving Abstraction 
 
 * Java Inheritance: The super Keyword
   The super keyword is similar to this keyword.
   1. It is used to differentiate the members of superclass from the members of subclass, if they have same names.
   2. It is used to invoke the superclass constructor from subclass.
 
 * Invoking Superclass Constructor
   If a class is inheriting the properties of another class, the subclass automatically acquires the default constructor of the superclass.
   But if you want to call a parameterized constructor of the superclass, you need to use the super keyword as shown below.

*  implements keyword is used with classes to inherit the properties of an interface. Interfaces can never be extended by a class.

* Types of Java Inheritance
  there are mainly three types of inheritances 
  1. Single 
  2. Multilevel
  3. Hierarchical
*/
public class Abstraction {
  public static void main(String[] args) {
    /* Following is not allowed and would raise error */
    // Phone smartPhone = new Phone("Apple", "Iphone XS", "Gold");

    SmartPhone smartPhone = new SmartPhone("Apple", "Iphone XS", "Gold");
    smartPhone.makeCall("+962 790000000");
    smartPhone.sendMessage("+962 791000000", "Hello there!");
  }
}

abstract class Phone {
  private String brand;
  private String model;
  private String color;

  public Phone(String brand, String model, String color) {
    System.out.println("Constructing a Phone");
    this.brand = brand;
    this.model = model;
    this.color = color;
  }

  public void makeCall(String phoneNumber) {
    System.out.println("Calling " + phoneNumber + " from " + brand + " " + model);
  }

  public abstract void sendMessage(String phoneNumber, String message);

  public String toString() {
    return brand + " " + model + " " + color;
  }

  public String getBrand() {
    return brand;
  }

  public String getModel() {
    return model;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}

class SmartPhone extends Phone {

  public SmartPhone(String brand, String model, String color) {
    super(brand, model, color);
    System.out.println("Constructing a Smartphone");
  }

  @Override 
  public void sendMessage(String phoneNumber, String message) {
    System.out.println("Sending message " + message + " to " + phoneNumber + " using " + getBrand() + " " + getModel());
  }
}

/** 
 * Note: 🧑🏻‍💻
 * Abstraction is a process of hiding the implementation details from the user, only the 
   functionality will be provided to the user.
   The remote control serves as an abstraction layer between the user and the television, 
   providing a simplified interface while hiding the implementation details of TV operation. 
   This abstraction makes it easier for users to interact with the TV without needing to 
   understand its internal mechanisms.

   - Abstract classes may or may not contain abstract methods.
   - If a class has at least one abstract method, then the class must be declared abstract.
   - If a class is declared abstract, it cannot be instantiated.
*/


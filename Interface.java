public class Interface {
  public static void main(String[] args) {
    AsusLaptop myLaptop = new AsusLaptop();

    myLaptop.powerOn();
    myLaptop.openLid();
    myLaptop.connectToWifi();
    myLaptop.closeLid();
    myLaptop.powerOff();

    // Static method called from the interface
    Laptop.chargingStatus();
  }
}

/* 
 * Note: 🧑🏻‍💻
 * interface is a reference type, similar to a class, that can contain only constants,
   method signatures, default methods, static methods, and nested types. 
   Interfaces cannot contain instance fields or constructors, and they cannot contain 
   implementation code for methods other than default and static methods.
   Unless the class that implements the interface is abstract, all the methods of the interface need to be defined in the class.
*/


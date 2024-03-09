public class Car {
    // Instance variables or attributes of the Car class
    final String carName = "Mercedes";

    public final void engineCar() {
        // Final method definition
    }

    /* 
     * Note 🧑🏻‍💻
     * final keyword is used to denote that a variable, method, or class cannot be
       changed or overridden after it has been initialized or declared.
       The final keyword is useful when you want a variable to always store the same value
       The final keyword is called a "modifier". 
     
    * Final Methods: When applied to a method, it means that the method cannot be 
      overridden by subclasses. This is often used to prevent subclasses 
      from changing the behavior of certain methods.
    
    * Final Classes: When applied to a class, it means that the class cannot be subclassed 
      (i.e., it cannot have subclasses). This is often used to prevent inheritance 
      and subclassing for classes that should not be extended.
    */
}

class Engine extends Car {
    String type;
    // This will cause a compile-time error
}




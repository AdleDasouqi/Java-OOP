class DefaultAccessModifier {
    // Default access modifier - accessible only within the same package
    void defaultMethod() {
        System.out.println("This is a default method");
    }
}

public class AccessModifier {
    // Public access modifier - accessible from any other class
    public void publicMethod() {
        System.out.println("This is a public method");
    }
}

class PrivateAccessModifier {
    // Private access modifier - accessible only within the same class
    private void privateMethod() {
        System.out.println("This is a private method");
    }

    public void accessPrivateMethod() {
        // Private method called from within the class
        privateMethod();
    }
}

class ProtectedAccessModifier {
    // Protected access modifier - accessible within the same package and by subclasses
    protected void protectedMethod() {
        System.out.println("This is a protected method");
    }
}

// Subclass of protected
class Subclass extends ProtectedAccessModifier {
    void acessProtectedMethod() {
        protectedMethod();
    }
}


/* 
 * Note 🧑🏻‍💻
 * The access modifiers in Java are used to specify the scope of the variables, data members, 
   methods, classes, or constructors. These help to restrict and secure the access 
   (or, level of access) of the data.
   There are four level of access:
   1. default -> Visible to the package, no modifiers are needed.

   2. private -> Visible to the class only.
      Class and interfaces cannot be private.

   3. protected -> Visible to the package and all subclasses.
      Variables, methods, and constructors, which are declared protected in a superclass can be accessed 
      only by the subclasses in other package or any class within the package of the protected members' class.

   4. public -> Visible to the world.
      A class, method, constructor, interface, etc. declared public can be accessed from any other class.

 * Tips 
   1. Methods declared public in a superclass also must be public in all subclasses.

   2. Methods declared protected in a superclass must either be protected or public in subclasses; 
   they cannot be private.

   3. Methods declared private are not inherited at all, so there is no rule for them.
*/
public class Number {
    //Accessing Java Class Methods
    public int minimum(int number1, int number2) {
        int minNumber;
        if(number1 > number2) {
            minNumber = number2;
        } else {
            minNumber = number1;
        }
        // Return the manimum number
        return minNumber;
    }
}

class MaximumNumber {
    // Instance variable
    int maxNumber;

    public int findMaxNumber(int maxNumber, int minNumber) {
        if(this.maxNumber > minNumber) {
            maxNumber = minNumber;
        } else {
            minNumber = maxNumber;
        }
        // Return the maximum number
        return maxNumber;
    }

    /* 
     * Note 🧑🏻‍💻
     * this Keyword which is used as a reference to the object of the current class, 
       with in an instance method or a constructor.
       Using this you can refer the members of a class such as constructors, 
       variables and methods.
       Differentiate the instance variables from local variables if they have same names, 
       within a constructor or a method.
     * The keyword this is used only within instance methods or constructors.
    */
}

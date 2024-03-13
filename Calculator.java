public class Calculator {
    /*
     * Creating a static method
     * Static method to add two numbers
    */
    static int add(int x, int y) {
        int sum = x + y;
        return sum;
    }

    // Creating a public method
    public int multiply(int x, int y) {
        int sum = x * y;
        return sum;
    }
    
    public static void main(String[] args) {
        // Using static method (Option 1)
        System.out.println("Sum = " + add(4, 5));

        // Invoke add method directly using class name (Option 2)
        int sum = Calculator.add(5, 10);
        System.out.println("Sum = " + sum);

        // Using public instance method
        Calculator multiply = new Calculator();
        System.out.println("Product = " + multiply.multiply(4, 4));
    }
}

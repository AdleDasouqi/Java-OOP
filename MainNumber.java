public class MainNumber {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 7;

        Number objNumber = new Number();
        // Accessing and calling methods of Number class.
        int minimumNumber = objNumber.minimum(number1, number2);
        System.out.println("Minimum Value = " + minimumNumber);

        int maxNumber = 20;
        int minNumber = 17;
       
        MaximumNumber objMaximumNumber = new MaximumNumber();

        // Accessing and calling methods of Number class with static keyword.
        int maximumNumber = objMaximumNumber.findMaxNumber(maxNumber, minNumber);
        System.out.println("Maximum Value: " + maximumNumber);
    }
}

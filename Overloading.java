public class Overloading {
    public static void main(String[] args) {
        System.out.println(Calculate.product(2, 2));
        System.out.println(Calculate.product(2, 4, 2));
    }
}

class Calculate {
    public static int product(int num1, int num2) {
        return num1 * num2;
    } 

    public static int product(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }
}

/*
 * Note: 🧑🏻‍💻
 * Method overloading refers to the ability to define multiple methods with the same name in a class 
   but with different parameters. These methods can have the same name but must have different parameter lists. 
   Method overloading improves the code readability and reduces code redundancy. Method overloading also helps 
   to achieve compile-time polymorphism. 
*/

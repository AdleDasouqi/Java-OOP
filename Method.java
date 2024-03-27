public class Method {

    public static int maxFunction(int num1, int num2) {
        int maxnum;
        if(num1 > num2) {
            maxnum = num1;
        } else {
            maxnum = num2;
        }

        return maxnum;
    }


    public static void main(String[] args) {
        int num1 = 6, num2 = 10;
        int result = maxFunction(num1, num2);
        System.out.println("Maximum Value = " + result);
    }
    
    /* 
     * Note 🧑🏻‍💻
     * method is a collection of statements that are grouped together to perform an operation.
       When you call the System.out.println() method, for example, the system actually executes 
       several statements in order to display a message on the console.
    */
}
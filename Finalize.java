public class Finalize {
    // Finalize method
    @Override 
    protected void finalize() throws Throwable {
        System.out.println("Finalizing Object");
    }

    public static void main(String[] args) {
        // Create an object
        Finalize objFinalize = new Finalize();

        // Set the object to null
        objFinalize = null;

        // Call garbage collector
        System.gc();
    }
}
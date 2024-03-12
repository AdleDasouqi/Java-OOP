public class Fruit {
    // Instance Variables
    private String name;
    private String color;
    private double weight;

    // Default Constructor
    public Fruit() {
        // Call parameterized constructor with default values 
        this("Unknown", "Unknown", 0.0);
    }

    public Fruit(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    // Getter methods
    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public double getWeight() {
        return this.weight;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    } 

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    } 

    // Method to print fruit information
    public void displayFruitInfo() {
        System.out.println("Fruit Name: " + this.name);
        System.out.println("Color: " + this.color);
        System.out.println("Wieght: " + this.weight + " grams");
    }

    public static void main(String[] args) {
        // Create fruit object using parameterized constructor
        Fruit mango = new Fruit("Mango", "Orange", 150.0);

        // Display fruit information
        mango.displayFruitInfo();
    }
}

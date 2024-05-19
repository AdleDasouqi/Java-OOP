public class AsusLaptop implements Laptop {
    // Implementing the abstract methods
    @Override
    public void powerOn() {
        System.out.println("Asus Laptop is powering on.");
    }

    @Override 
    public void powerOff() {
        System.out.println("Asus Laptop is powering off.");
    }

    @Override
    public void openLid() {
        System.out.println("Asus Laptop lid is opened.");
    }

    @Override
    public void closeLid() {
        System.out.println("Asus Laptop lid is closed.");
    }

    // Overriding the default method
    @Override
    public void connectToWifi() {
        System.out.println("Asus Laptop is connencting to Wifi using custom configuration.");
    }
}

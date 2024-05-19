public interface Laptop {
    // Abstract methods
    void powerOn();
    void powerOff();
    void openLid();
    void closeLid();
    
    // Default method
    default void connectToWifi() {
        System.out.println("Connecting to WiFi using default configuration.");
    }

    // Static method
    static void chargingStatus() {
        System.out.println("Charging status: Battery is charging.");
    }
}

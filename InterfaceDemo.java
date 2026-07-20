// Interface for basic bicycle operations
interface Bicycle {

    int MAX_SPEED = 67; // By default: public static final

    void setBrake(int decrement);

    void speedUp(int increment);
}

// Interface for horn features
interface HornBicycle {

    void blowHorn5();

    void blowHorn87();
}

// Class implementing multiple interfaces
class AvonCycle implements Bicycle, HornBicycle {

    // Normal class method
    void blowHorn() {
        System.out.println("Pee Pee Poo Poo!");
    }

    // Implementing Bicycle interface methods
    @Override
    public void setBrake(int decrement) {
        System.out.println("Applying Brake...");
    }

    @Override
    public void speedUp(int increment) {
        System.out.println("Increasing Speed...");
    }

    // Implementing HornBicycle interface methods
    @Override
    public void blowHorn5() {
        System.out.println("Main Tera Hero Hoon!");
    }

    @Override
    public void blowHorn87() {
        System.out.println("Chaddi Yamla Pagla Deewana O Rabba!");
    }
}

// Main Class
public class InterfaceDemo {

    public static void main(String[] args) {

        AvonCycle myCycle = new AvonCycle();

        myCycle.blowHorn();
        myCycle.setBrake(8);
        myCycle.speedUp(9);

        // Interface variables are public, static and final
        System.out.println("Maximum Speed : " + myCycle.MAX_SPEED);

        myCycle.blowHorn5();
        myCycle.blowHorn87();

        // Interface Reference
        Bicycle cycle = new AvonCycle();
        cycle.speedUp(5);
        cycle.setBrake(2);
    }
}

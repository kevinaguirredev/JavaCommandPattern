package VendorClasses.Fans;

public class CeilingFan {

    //these static variables denote the available speeds for the fan
    public static final int HIGH = 3;

    public static final int MEDIUM = 2;

    public static final int LOW = 1;

    public static final int OFF = 0;

    private String location;

    //this class now holds the state of the current speed of the fan
    private int speed;

    private static final String CEILINGFAN_POSTFIX = "fan";

    public CeilingFan(String location) {

        this.location = location;
        speed = OFF;
    }

    public void high() {

        speed = HIGH;
        System.out.println(getLocation() + "'s speed is set to HIGH.");
    }

    public void medium() {

        speed = MEDIUM;
        System.out.println(getLocation() + "'s speed is set to MEDIUM.");
    }

    public void low() {

        speed = LOW;
        System.out.println(getLocation() + "'s speed is set to LOW.");
    }

    public void on() {

        speed = LOW;
        System.out.println(getLocation() + "'s is on!");
        System.out.println(getLocation() + "'s speed is set to LOW.");
    }

    public void off() {

        speed = OFF;
        System.out.println(getLocation() + "'s is off!");
    }

    public int getSpeed() {

        return this.speed;
    }

    private String getLocation() {

        return this.location + " " + CEILINGFAN_POSTFIX;
    }
}

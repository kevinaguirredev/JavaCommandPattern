package VendorClasses.Fans;

public class CeilingFan {

    private String location;

    private static final String CEILINGFAN_POSTFIX = "fan";

    public CeilingFan(String location) {

        this.location = location;
    }

    public void on() {

        System.out.println(getLocation() + "'s is on!");
    }

    public void off() {

        System.out.println(getLocation() + "'s is off!");
    }

    private String getLocation() {

        return this.location + CEILINGFAN_POSTFIX;
    }
}

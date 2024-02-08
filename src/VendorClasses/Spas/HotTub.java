package VendorClasses.Spas;

public class HotTub {

    private String location;

    private static final String HOTTUB_PREFIX = "hot tub";

    public HotTub(String location) {

        this.location = location;
    }

    public void on() {

        System.out.println(getLocation() + "is on!");
    }

    public void off() {

        System.out.println(getLocation() + "is off!");
    }

    private String getLocation() {

        return this.location + " " + HOTTUB_PREFIX + " ";
    }
}

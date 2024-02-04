package VendorClasses.Lights;

public class Light {

    private String location;

    private static final String LIGHT_POSTFIX = "light";

    public Light(String location) {

        this.location = location;
    }

    public void on() {

        System.out.println(getLocation() + "'s is on!");
    }

    public void off() {

        System.out.println(getLocation() + "'s is off!");
    }

    private String getLocation() {

        return this.location + LIGHT_POSTFIX;
    }

}

package VendorClasses.Garage;

public class GarageDoor {

    private String location;

    public GarageDoor(String location) {

        this.location = location;
    }

    public void up() {

        System.out.println(getLocation() + " going up...");
    }

    public void down() {

        System.out.println(getLocation() + " going down!");
    }

    public void stop() {

        System.out.println(getLocation() + " has stopped!");
    }

    public void lightOn() {

        System.out.println(getLocation() + " light is on!");
    }

    public void lightOff() {

        System.out.println(getLocation() + " light is off!");
    }

    public String getLocation() {

        return this.location;
    }
}

package VendorClasses.Stereos;

public class Stereo {

    private String location;

    private static final String STEREO_POSTFIX = "stereo";

    public Stereo(String location) {

        this.location = location;
    }

    public void on() {

        System.out.println(getLocation()  + "is on!");
    }

    public void off() {

        System.out.println(getLocation() + "is off!");
    }

    public void setCd() {

        System.out.println(getLocation() + "'s CD was set!");
    }

    public void setDvd() {

        System.out.println(getLocation() + "'s DVD was set!");
    }

    public void setRadio() {

        System.out.println(getLocation() + "'s Radio was set!");
    }

    public void setVolume(int volumeNumber) {

        System.out.println(getLocation() + "'s Volume was set to: " + volumeNumber + "!");
    }

    private String getLocation() {

        return this.location + " " + STEREO_POSTFIX + " ";
    }
}

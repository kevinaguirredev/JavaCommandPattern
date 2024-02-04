package CommandObjects.Stereos;

import Interfaces.Command;
import VendorClasses.Stereos.Stereo;

public class StereoOffCommand implements Command {

    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {

        this.stereo = stereo;
    }

    @Override
    public void execute() {

        this.stereo.off();
    }
}

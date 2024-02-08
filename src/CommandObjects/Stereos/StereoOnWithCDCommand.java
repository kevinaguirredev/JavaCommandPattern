package CommandObjects.Stereos;

import Interfaces.Command;
import VendorClasses.Stereos.Stereo;

public class StereoOnWithCDCommand implements Command {

    private Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {

        this.stereo = stereo;
    }

    @Override
    public void execute() {

//        this.stereo.on();
//        this.stereo.setCd();
//        this.stereo.setVolume(11);
    }

    @Override
    public void undo() {

        this.stereo.off();
    }
}

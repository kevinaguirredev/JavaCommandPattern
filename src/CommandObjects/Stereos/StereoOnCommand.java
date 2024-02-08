package CommandObjects.Stereos;

import Interfaces.Command;
import VendorClasses.Stereos.Stereo;

public class StereoOnCommand implements Command {

    private Stereo stereo;

    public StereoOnCommand(Stereo stereo) {

        this.stereo = stereo;
    }

    @Override
    public void execute() {

        this.stereo.on();
    }

    @Override
    public void undo() {

        this.stereo.off();
    }
}

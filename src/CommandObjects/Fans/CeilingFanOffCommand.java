package CommandObjects.Fans;

import Interfaces.Command;
import VendorClasses.Fans.CeilingFan;

public class CeilingFanOffCommand implements Command {

    private CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {

        this.ceilingFan = ceilingFan;
    }


    @Override
    public void execute() {
        this.ceilingFan.off();
    }
}

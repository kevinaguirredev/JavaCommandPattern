package CommandObjects.Fans;

import Interfaces.Command;
import VendorClasses.Fans.CeilingFan;

public class CeilingFanOnCommand implements Command {

    private CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {

        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {

        this.ceilingFan.on();
    }
}

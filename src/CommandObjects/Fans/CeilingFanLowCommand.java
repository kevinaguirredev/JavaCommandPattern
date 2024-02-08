package CommandObjects.Fans;

import Interfaces.Command;
import VendorClasses.Fans.CeilingFan;

public class CeilingFanLowCommand implements Command {

    private CeilingFan ceilingFan;

    private int prevSpeed = 0;

    public CeilingFanLowCommand(CeilingFan ceilingFan) {

        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {

        this.prevSpeed = this.ceilingFan.getSpeed();
        this.ceilingFan.low();
    }

    @Override
    public void undo() {

        if (prevSpeed == CeilingFan.HIGH) {
            this.ceilingFan.high();
        } else if (prevSpeed == CeilingFan.MEDIUM) {
            this.ceilingFan.medium();
        } else if (prevSpeed == CeilingFan.LOW) {
            this.ceilingFan.low();
        } else if (prevSpeed == CeilingFan.OFF) {
            this.ceilingFan.off();
        }
    }
}

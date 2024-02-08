package CommandObjects.Spas;

import Interfaces.Command;
import VendorClasses.Spas.HotTub;

public class HotTubOnCommand implements Command {

    private HotTub hotTub;

    public HotTubOnCommand(HotTub hotTub) {

        this.hotTub = hotTub;
    }

    @Override
    public void execute() {

        this.hotTub.on();
    }

    @Override
    public void undo() {

        this.hotTub.off();
    }
}

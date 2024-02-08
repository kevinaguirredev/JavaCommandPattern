package CommandObjects.Spas;

import Interfaces.Command;
import VendorClasses.Spas.HotTub;

public class HotTubOffCommand implements Command {

    private HotTub hotTub;

    public HotTubOffCommand(HotTub hotTub) {

        this.hotTub = hotTub;
    }

    @Override
    public void execute() {

        this.hotTub.off();
    }

    @Override
    public void undo() {

        this.hotTub.on();
    }
}

package CommandObjects.Lights;

import Interfaces.Command;
import VendorClasses.Lights.Light;

public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {

        this.light = light;
    }

    public void execute() {

        this.light.on();
    }

    //undoes executes last action by turning light off
    @Override
    public void undo() {

        this.light.off();
    }

}

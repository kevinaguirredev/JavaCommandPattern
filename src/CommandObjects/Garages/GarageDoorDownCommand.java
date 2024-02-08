package CommandObjects.Garages;

import Interfaces.Command;
import VendorClasses.Garages.GarageDoor;

public class GarageDoorDownCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {

        this.garageDoor = garageDoor;
    }

    //Execute method carries out request or responds
    @Override
    public void execute() {

        this.garageDoor.up();
    }

    @Override
    public void undo() {

        this.garageDoor.down();
    }

}

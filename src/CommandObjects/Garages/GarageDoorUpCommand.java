package CommandObjects.Garages;

import Interfaces.Command;
import VendorClasses.Garages.GarageDoor;

public class GarageDoorUpCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {

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

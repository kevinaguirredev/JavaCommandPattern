package CommandObjects.Garages;

import Interfaces.Command;
import VendorClasses.Garage.GarageDoor;

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

}

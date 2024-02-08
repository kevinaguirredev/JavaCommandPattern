package CommandObjects;

import Interfaces.Command;

public class NoCommand implements Command {

    public NoCommand() {
        //empty constructor
    }

    @Override
    public void execute() {

        System.out.println("I do nothing!");
    }

    @Override
    public void undo() {

    }


}

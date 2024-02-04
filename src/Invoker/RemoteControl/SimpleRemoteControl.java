package Invoker.RemoteControl;

import Interfaces.Command;

public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl() {

        //empty constructor
    }

    //set Command object on the Simple Remote Control
    public void setCommand (Command command) {

        this.slot = command;
    }

    //this is the invoker method that passes control to the slot object which will direct the receiver of request
    public void buttonWasPressed() {

        //request made by invoker
        this.slot.execute();
    }
}

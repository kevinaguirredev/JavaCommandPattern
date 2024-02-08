package Invoker.RemoteControl;

import CommandObjects.NoCommand;
import Interfaces.Command;

public class RemoteControlWithUndo {

    Command[] onCommands;
    Command[] offCommands;

    //added this instance variable to hold the last command performed
    Command undoCommand;

    //RemoteControl invoker constructor method to initialize and instantiate off/on command arrays
    public RemoteControlWithUndo() {

        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();

        for (int counter = 0; counter < onCommands.length; counter++) {

            onCommands[counter] = noCommand;
            offCommands[counter] = noCommand;
        }

        //set undoCommand instance variable to null object (see NoCommand.java)
        undoCommand = noCommand;
    }

    //setCommand method to set slot in remote control with off/on command
    public void setCommand(int slot, Command onCommand, Command offCommand) {

        if (slot < 0 || slot > 6) {

            throw new IllegalArgumentException("Slot number must be from 0 to 6");
        }

        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {

        if (slot < 0 || slot > 6) {

            throw new IllegalArgumentException("Slot number must be from 0 to 6");
        }

        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {

        if (slot < 0 || slot > 6) {

            throw new IllegalArgumentException("Slot number must be from 0 to 6");
        }

        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {

        undoCommand.undo();
    }

    @Override
    public String toString() {

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n------ Remote Control ------\n");

        for (int counter = 0; counter < onCommands.length; counter++) {

            stringBuffer.append("[slot " + counter + "] " + onCommands[counter].getClass().getName() + "    " + offCommands[counter].getClass().getName() + "\n");
        }

        return stringBuffer.toString();
    }
}

import CommandObjects.Fans.CeilingFanOffCommand;
import CommandObjects.Fans.CeilingFanOnCommand;
import CommandObjects.Garages.GarageDoorDownCommand;
import CommandObjects.Garages.GarageDoorUpCommand;
import CommandObjects.Lights.LightOffCommand;
import CommandObjects.Lights.LightOnCommand;
import CommandObjects.Stereos.StereoOffCommand;
import CommandObjects.Stereos.StereoOnWithCDCommand;
import Invoker.RemoteControl.RemoteControl;
import VendorClasses.Fans.CeilingFan;
import VendorClasses.Garage.GarageDoor;
import VendorClasses.Lights.Light;
import VendorClasses.Stereos.Stereo;

public class Main {

    //Client code
    public static void main(String[] args) {

        //this is your invoker object
        RemoteControl remoteControl = new RemoteControl();

        //these are your worker classes which carry out the actual tasks
        Light livingRoomLight = new Light("Living room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living room");
        GarageDoor garageDoor = new GarageDoor("Garage");
        Stereo stereo = new Stereo("Living room");

        //Encapsulated requests created by this client
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        //register command objects with invoker
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(3, stereoOnWithCD, stereoOff);

        System.out.println(remoteControl.toString());

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);

        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);

        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);

    }

}
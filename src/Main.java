import CommandObjects.Fans.CeilingFanHighCommand;
import CommandObjects.Fans.CeilingFanMediumCommand;
import CommandObjects.Fans.CeilingFanOffCommand;
import CommandObjects.Lights.LightOffCommand;
import CommandObjects.Lights.LightOnCommand;
import CommandObjects.Macros.MacroCommand;
import CommandObjects.Spas.HotTubOffCommand;
import CommandObjects.Spas.HotTubOnCommand;
import CommandObjects.Stereos.StereoOffCommand;
import CommandObjects.Stereos.StereoOnCommand;
import CommandObjects.Televisions.TelevisionOffCommand;
import CommandObjects.Televisions.TelevisionOnCommand;
import Interfaces.Command;
import Invoker.RemoteControl.RemoteControlWithUndo;
import VendorClasses.Fans.CeilingFan;
import VendorClasses.Lights.Light;
import VendorClasses.Spas.HotTub;
import VendorClasses.Stereos.Stereo;
import VendorClasses.Televisions.Television;

public class Main {
    //Client code
//    public static void main(String[] args) {
//
//        this is your invoker object
//        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
//
//        CeilingFan ceilingFan = new CeilingFan("Living Room");
//
//        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
//        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
//        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
//
//        remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
//        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);
//
//        remoteControl.onButtonWasPushed(0);
//        remoteControl.offButtonWasPushed(0);
//
//        System.out.println(remoteControl);
//
//        remoteControl.undoButtonWasPushed();
//        remoteControl.onButtonWasPushed(1);
//
//        System.out.println(remoteControl);
//
//        remoteControl.undoButtonWasPushed();
//    }

    public static void main(String[] args) {

        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light light = new Light("Living Room");
        Television tv = new Television("Living Room");
        Stereo stereo = new Stereo("Living Room");
        HotTub hotTub = new HotTub("Living Room");

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        TelevisionOnCommand tvOnCommand = new TelevisionOnCommand(tv);
        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        HotTubOnCommand hotTubOnCommand = new HotTubOnCommand(hotTub);

        LightOffCommand lightOffCommand = new LightOffCommand(light);
        TelevisionOffCommand tvOffCommand = new TelevisionOffCommand(tv);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        HotTubOffCommand hotTubOffCommand = new HotTubOffCommand(hotTub);

        Command[] partyOn = { lightOnCommand, tvOnCommand, stereoOnCommand, hotTubOnCommand };
        Command[] partyOff = { lightOffCommand, tvOffCommand, stereoOffCommand, hotTubOffCommand };

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On ---");

        System.out.println("Get ready to partay!");
        remoteControl.onButtonWasPushed(0);

        System.out.println("--- Pushing Macro Off ---");
        remoteControl.offButtonWasPushed(0);
    }
}
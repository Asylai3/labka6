package Part2;

public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        Thermostat thermostat = new Thermostat();

        Command lightOn = new TurnOnLightCommand(livingRoomLight);
        Command setTemp = new SetThermostatCommand(thermostat, 22);

        SmartHomeRemoteControl remote = new SmartHomeRemoteControl();
        remote.assign("A", lightOn);
        remote.assign("B", setTemp);

        remote.pressButton("A");
        remote.pressButton("B");

        System.out.println("Undo last command:");
        remote.undoLast();
    }
}


package Part2;

public class Thermostat {
    private int currentTemp = 22;
    private int prevTemp = 22;

    public void setTemperature(int temperature) {
        prevTemp = currentTemp;
        currentTemp = temperature;
        System.out.println("[Thermostat] Setting temperature to " + currentTemp + "°C");
    }
    public void revertTemperature() {
        currentTemp = prevTemp;
        System.out.println("[Thermostat] Reverting to previous temperature: " + currentTemp + "°C");
    }
}


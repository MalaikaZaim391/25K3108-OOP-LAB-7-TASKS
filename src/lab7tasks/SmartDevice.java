package lab7tasks;

public class SmartDevice {
    void turnOn(){
        System.out.println("Turning on Smart Devices...");
    }
}

class SmartLight extends SmartDevice {
    @Override
    void turnOn(){
        System.out.println("Turning on Smart Lights...");
    }
}

class SmartFan extends SmartDevice {
    @Override
    void turnOn(){
        System.out.println("Turning on Smart Fans...");
    }
}

class SmartAC extends SmartDevice {
    @Override
    void turnOn(){
        System.out.println("Turning on Smart AC...");
    }
}

class main8{
    public static void main(String[] args) {
        SmartDevice Arr[] = {new SmartLight(), new SmartFan(), new SmartAC() };
        for (SmartDevice device : Arr) {
            device.turnOn();
        }

    }
}

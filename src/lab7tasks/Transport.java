package lab7tasks;

public class Transport {
    void fare(){
        System.out.println("Calculating Transport Fare...");
    }
}

class Bus extends Transport{
    @Override
    void fare(){
        double base_fare = 200;
        //40% discount
        double fare2 = 0.6 * base_fare;
        System.out.println("Bus Fare: " + fare2);
    }
}

class Train extends Transport{
    @Override
    void fare(){
        double base_fare = 200;
        //20% discount
        double fare2 = 0.8 * base_fare;
        System.out.println("Train Fare: " + fare2);
    }
}

class Taxi extends Transport{
    @Override
    void fare(){
        double base_fare = 200;
        //5% discount
        double fare2 = 0.95 * base_fare;
        System.out.println("Taxi Fare: " + fare2);
    }
}

class main6{
    public static void main(String[] args) {
        Transport bus = new Bus();
        Transport train = new Train();
        Transport taxi = new Taxi();

        bus.fare();
        train.fare();
        taxi.fare();

    }
}
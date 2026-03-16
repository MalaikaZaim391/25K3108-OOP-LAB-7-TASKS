package lab7tasks;

public class Ride {
    void calculateFare(double distance){
        System.out.println("Calculating Fare for " + distance + " km...");
    }
}

class BikeRide extends Ride {
    @Override
    void calculateFare(double distance) {
        double ratePerKm = 50;
        double fare = distance * ratePerKm;
        System.out.println("Bike Ride Fare: $" + fare);
    }
}

class CarRide extends Ride {
    @Override
    void calculateFare(double distance) {
        double ratePerKm = 150;
        double fare = distance * ratePerKm;
        System.out.println("Car Ride Fare: $" + fare);
    }
}

class LuxuryRide extends Ride {
    @Override
    void calculateFare(double distance) {
        double ratePerKm = 350;
        double fare = distance * ratePerKm;
        System.out.println("Luxury Ride Fare: $" + fare);
    }
}

class main9{
    public static void main(String[] args) {

        Ride bikeRide = new BikeRide();
        Ride carRide = new CarRide();
        Ride luxuryRide = new LuxuryRide();

        bikeRide.calculateFare(10);
        carRide.calculateFare(10);
        luxuryRide.calculateFare(10);

    }
}
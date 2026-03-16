package lab7tasks;

public class Restaurant {
    void calculateDeliveryFee(double distance) {
        System.out.println("Calculating Delivery Fee for " + distance + "km ...");
    }
}

class FastFoodRestaurant extends Restaurant {
    @Override
    void calculateDeliveryFee(double distance) {
        double base_d_fee = 200;
        double fee = distance * base_d_fee;
        System.out.println("Fast Food Delivery Fee: " + fee);
    }
}

class CafeRestaurant extends Restaurant {
    @Override
    void calculateDeliveryFee(double distance){
        double base_d_fee = 350;
        //20% discount on base delivery charges
        double fee = distance * base_d_fee;
        System.out.println("Cafe Delivery Fee: " + fee);
    }
}

class FineDiningRestaurant extends Restaurant {
    @Override
    void calculateDeliveryFee(double distance){
        double base_d_fee = 600;
        //5% discount on base delivery charges
        double fee = distance * base_d_fee;
        System.out.println("Fine Dining Delivery Fee: " + fee);
    }
}

class main7{
    public static void main(String[] args) {
        Restaurant fastFood =  new FastFoodRestaurant();
        Restaurant cafe = new CafeRestaurant();
        Restaurant fineDining = new FineDiningRestaurant();

        fastFood.calculateDeliveryFee(10);
        cafe.calculateDeliveryFee(10);
        fineDining.calculateDeliveryFee(10);

    }
}

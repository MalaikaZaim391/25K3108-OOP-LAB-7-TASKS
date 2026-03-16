package lab7tasks;

public class Payment {
    void processPayment(){
        System.out.println("PROCESSING PAYMENT");
    }
}

class CreditCard extends Payment{
    @Override
    void processPayment(){
        System.out.println("PROCESSING CREDIT CARD PAYMENT");
    }
}

class DebitCard extends Payment{
    @Override
    void processPayment(){
        System.out.println("PROCESSING DEBIT CARD PAYMENT");
    }
}

class PayPal extends Payment{
    @Override
    void processPayment(){
        System.out.println("PROCESSING PAYPAL PAYMENT");
    }
}


class main3{
    public static void main(String[] args) {
        Payment cc =  new CreditCard();
        Payment dc =  new DebitCard();
        Payment pp =  new PayPal();

        cc.processPayment();
        dc.processPayment();
        pp.processPayment();

    }
}



package lab7tasks;

public class Notification {
    void send(){
        System.out.println("Sending Notifications...");
    }
}

class EmailNotification extends Notification{
    @Override
    void send(){
        System.out.println("Email Notification Sent");
    }
}

class SMSNotification extends Notification{
    @Override
    void send(){
        System.out.println("SMS Notification Sent");
    }
}

class PushNotification extends Notification{
    @Override
    void send(){
        System.out.println("Push Notification Sent");
    }
}

class main5{
    public static void main(String[] args) {
        Notification not2 = new EmailNotification();
        Notification not3 = new SMSNotification();
        Notification not4 = new PushNotification();

        not2.send();
        not3.send();
        not4.send();

    }
}

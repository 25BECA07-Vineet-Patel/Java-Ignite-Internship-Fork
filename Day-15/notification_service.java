interface NotificationService {
    void sendMessage();
}

class EmailNotification implements NotificationService {

    @Override
    public void sendMessage() {
        System.out.println("Email Notification Sent");
    }
}

class SMSNotification implements NotificationService {

    @Override
    public void sendMessage() {
        System.out.println("SMS Notification Sent");
    }
}

class OrderService {

    NotificationService notificationService;

    OrderService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    void placeOrder() {
        System.out.println("Order Confirmed");
        notificationService.sendMessage();
    }
}

public class notification_service {
    public static void main(String[] args) {

        EmailNotification email = new EmailNotification();

        OrderService order1 = new OrderService(email);
        order1.placeOrder();

        System.out.println();

        SMSNotification sms = new SMSNotification();

        OrderService order2 = new OrderService(sms);
        order2.placeOrder();
    }
}
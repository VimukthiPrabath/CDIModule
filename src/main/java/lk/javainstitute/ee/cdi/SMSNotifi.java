package lk.javainstitute.ee.cdi;


import jakarta.enterprise.context.ApplicationScoped;
import lk.javainstitute.ee.annotation.SMS;

@SMS
@ApplicationScoped
public class SMSNotifi implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("SMS Notifi: Sendding SMS"+message);
    }
}

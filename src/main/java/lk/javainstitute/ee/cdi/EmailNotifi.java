package lk.javainstitute.ee.cdi;


import jakarta.enterprise.context.ApplicationScoped;
import lk.javainstitute.ee.annotation.Email;

@Email
@ApplicationScoped
public class EmailNotifi implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("SMS Notifi: Sendding eMail"+message);
    }
}

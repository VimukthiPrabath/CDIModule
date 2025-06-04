package lk.javainstitute.ee.ejb.remote;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import lk.javainstitute.ee.annotation.Email;
import lk.javainstitute.ee.cdi.NotificationService;

import java.rmi.RemoteException;

@Stateless
public class UserRegistrationSessionBean implements UserRegistration {

    @Inject
    @Email
    private NotificationService notificationService;


    @Override
    public void registerUser(String firstName, String lastName, String email, String password) {
     notificationService.sendNotification("Hello " + firstName + " " + lastName + " " + email);
    }
}

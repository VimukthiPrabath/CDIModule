package lk.javainstitute.ee.ejb.remote;


import jakarta.ejb.Remote;

import java.rmi.RemoteException;

@Remote
public interface UserRegistration {

    void registerUser( String firstName, String lastName, String email, String password );
}

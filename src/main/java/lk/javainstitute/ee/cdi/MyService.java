package lk.javainstitute.ee.cdi;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;

//@ApplicationScoped
@RequestScoped
public class MyService {
    public void doSomthing() {
        System.out.println("MyService doSomthing"+ this);
    }
}

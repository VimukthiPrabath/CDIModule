package lk.javainstitute.ee.ejb;

import jakarta.ejb.Startup;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import lk.javainstitute.ee.cdi.MyService;
import lk.javainstitute.ee.ejb.remote.AppSetting;

@Stateless
public class AppSettingsSessionBean implements AppSetting {


    @Inject
    private MyService myService;

    @Override
    public String getName() {
        myService.doSomthing();
        return "CDI Module App Setting";
    }

    @Override
    public String getVersion() {
        return "1.0";
    }

    @Override
    public String getDescription() {
        return "This is the App Setting Bean";
    }
}

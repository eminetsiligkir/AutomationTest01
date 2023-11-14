package util;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
    driverFactory driverFactory = new driverFactory();
    propertiesFactory propertiesFactory = new propertiesFactory();

    @Before
    public void before(){
        driverFactory.initDriver(propertiesFactory.getBrowser());
    }
    @After
    public void after(){
        driverFactory.closeDriver();
    }
}

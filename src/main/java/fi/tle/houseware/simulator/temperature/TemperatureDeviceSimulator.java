package fi.tle.houseware.simulator.temperature;

import fi.tle.houseware.common.TemperatureDevice;
import fi.tle.houseware.common.TemperatureInformation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/**
 * Created by toni on 28.5.2015.
 */
public class TemperatureDeviceSimulator implements TemperatureDevice {


    public List<TemperatureInformation> getTemperatureInformations() throws Exception {
        double value = new Random().nextDouble()*24;

        TemperatureInformation temperatureInformation = new TemperatureInformation("Alatalli", value);

        List rv = new ArrayList<TemperatureInformation>();
        rv.add(temperatureInformation);
        return rv;
    }
}

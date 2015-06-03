package fi.tle.houseware.simulator.temperature;

import fi.tle.houseware.common.TemperatureInformation;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by toni on 3.6.2015.
 */
public class TemperatureDeviceSimulatorTest {

    @org.junit.Test
    public void testGetTemperatureInformations() throws Exception {

        TemperatureDeviceSimulator simulator = new TemperatureDeviceSimulator();
        List<TemperatureInformation> temperatureInformations = simulator.getTemperatureInformations();
        assertEquals(1,temperatureInformations.size());

        System.out.println(temperatureInformations.get(0).getLocation()+" "+temperatureInformations.get(0).getTemperature());
        assertTrue("Testing lower limit", temperatureInformations.get(0).getTemperature() > 0);
        assertTrue(temperatureInformations.get(0).getTemperature() < 24);

    }
}
package fi.tle.houseware.common;

/**
 * Created by toni on 28.5.2015.
 */
public class TemperatureInformation {
    private String location;
    private Double temperature;

    public TemperatureInformation(String location, Double temperature) {
        this.location = location;
        this.temperature = temperature;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

package fi.tle.houseware.common;

/**
 * Created by toni on 28.5.2015.
 */
public class DeviceImpl implements Device {
    private String name;
    private String description;
    private DeviceType type;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public DeviceType getType() {
        return type;
    }
}

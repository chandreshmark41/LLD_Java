package design_patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class VehicleRegistry {

    private static Map<String,Vehicle> mapVehicles = new HashMap<>();
    static {
        mapVehicles.put("FZ", new Bike("149 cc", "V3", 99000,false));
        mapVehicles.put("Fronx", new Car("999 cc","Alpha",110000,true,false));
    }

    public Vehicle getVehicle(String vehicle) throws CloneNotSupportedException {
        return mapVehicles.get(vehicle).clone();
    }
}

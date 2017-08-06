/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.traccar.obd.featureslib;

import java.util.Map;
import javax.sql.DataSource;
import org.traccar.Config;
import car.traccar.obd.datalib.DataManagerCar;
import car.traccar.obd.Obd;
import org.traccar.model.Position;

/**
 *
 * @author phndavid
 */
public class Context {

    private static DataManagerCar dataManager;

    public Context(Config config, DataSource dataSource) throws Exception {
        dataManager = new DataManagerCar(config, dataSource);
    }

    public static DataManagerCar getDataManager() {
        return dataManager;
    }

    public void getAttributesPosition(Position position) {
        System.out.println("EJECUTO Attr");
        Obd obd = new Obd();
        Map<String, Object> attr = position.getAttributes();
        obd.setServerTime(position.getServerTime());
        obd.setDeviceTime(position.getDeviceTime());
        obd.setFixTime(position.getFixTime());
        obd.setValid(position.getValid());
        obd.setDeviceId(position.getDeviceId()); // deviceId
        obd.setLatitude(position.getLatitude()); // latidude
        obd.setLongitude(position.getLongitude()); // longitude
        obd.setAltitude(position.getAltitude()); // altidude
        obd.setSpeed(position.getSpeed()); // speed Km/h
        System.out.println("***OBD ATTRIBUTES***");
        Double hdop = (Double) attr.get(Position.KEY_HDOP); // hdop
        System.out.println("HDOP: " + hdop);
        obd.setHdop(0);
        Boolean ignition = (Boolean) attr.get(Position.KEY_IGNITION); // ignition
        System.out.println("Ignition: " + ignition);
        obd.setIgnition(false);
        Double status = (Double) attr.get(Position.KEY_STATUS); // status
        System.out.println("Status: " + status);
        obd.setStatus(0);
        Double odometer = (Double) attr.get(Position.KEY_OBD_ODOMETER); // odometer
        System.out.println("Odometer: " + odometer);
        obd.setOdometer(0);
        obd.setAdc0(0.0);
        obd.setAdc1(0.0);
        obd.setAdc2(0.0);
        obd.setAdc3(0.0);
        Double geofence = (Double) attr.get(Position.KEY_GEOFENCE); // geofenceIn
        System.out.println("geofence: " + geofence);
        obd.setGeofenceIn(0.0);
        obd.setGeofenceAlarm(0.0);
        obd.setCoolantTemperature(0.0);
        Double rpm = (Double) attr.get(Position.KEY_RPM); // rpm
        System.out.println("RPM: " + rpm);
        obd.setRpm(0);
        Double obdSpeed = (Double) attr.get(Position.KEY_OBD_SPEED); // obdSpeed
        System.out.println("obdSpeed: " + obdSpeed);
        obd.setObdSpeed(0);
        obd.setFuelConsumption(0);
        Double vin = (Double) attr.get(Position.KEY_VIN); // vin
        System.out.println("Vin: " + vin);
        obd.setVin(0);

        Double event = (Double) attr.get(Position.KEY_EVENT); // vin
        System.out.println("Event: " + event);
        obd.setEvent(0);

        String ip = (String) attr.get(Position.KEY_IP);
        System.out.println("IP: " + ip);
        obd.setIp(ip);

        Double distance = (Double) attr.get(Position.KEY_DISTANCE);
        System.out.println("distance: " + distance);
        obd.setDistance(distance);

        Double totalDistance = (Double) attr.get(Position.KEY_TOTAL_DISTANCE);
        System.out.println("totalDistance: " + totalDistance);
        obd.setTotalDistance(totalDistance);
        obd.setCourse(0);

        try {
            dataManager.addObd(obd);
            System.out.println("GUARDO BIEN");
        } catch (Exception e) {
            System.out.print("Error Context Carhola: " + e);
        }

    }
}

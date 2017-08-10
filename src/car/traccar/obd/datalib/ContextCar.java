/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.traccar.obd.datalib;

import java.util.Map;
import javax.sql.DataSource;
import org.traccar.Config;
import car.traccar.obd.Obd;
import org.traccar.helper.Log;
import org.traccar.model.Position;

/**
 *
 * @author Nelson David Padilla H.
 */
public class ContextCar {

    private static DataManagerCar dataManagerCar;

    public ContextCar(Config config, DataSource dataSource) throws Exception {
        dataManagerCar = new DataManagerCar(config, dataSource);
    }

    public static DataManagerCar getDataManager() {
        return dataManagerCar;
    }

    public void decodeToObd(Position position) {
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
        Double hdop = (Double) attr.get(Position.KEY_HDOP); // hdop
        obd.setHdop(hdop != null ? hdop : 0);
        Boolean ignition = (Boolean) attr.get(Position.KEY_IGNITION); // ignition
        obd.setIgnition(ignition != null ? ignition : false);
        Double status = (Double) attr.get(Position.KEY_STATUS); // status
        obd.setStatus(status != null ? status : 0);
        Double odometer = (Double) attr.get(Position.KEY_OBD_ODOMETER); // odometer
        obd.setOdometer(odometer != null ? odometer : 0);
        obd.setAdc0(0.0);
        obd.setAdc1(0.0);
        obd.setAdc2(0.0);
        obd.setAdc3(0.0);
        Double geofence = (Double) attr.get(Position.KEY_GEOFENCE); // geofenceIn
        obd.setGeofenceIn(geofence != null ? geofence : 0);
        obd.setGeofenceAlarm(0.0);
        obd.setCoolantTemperature(0.0);
        Double rpm = (Double) attr.get(Position.KEY_RPM); // rpm
        obd.setRpm(rpm != null ? rpm : 0);
        Double obdSpeed = (Double) attr.get(Position.KEY_OBD_SPEED); // obdSpeed
        obd.setObdSpeed(obdSpeed != null ? obdSpeed : 0);
        obd.setFuelConsumption(0);
        Double vin = (Double) attr.get(Position.KEY_VIN); // vin
        obd.setVin(vin != null ? vin : 0);
        Double event = (Double) attr.get(Position.KEY_EVENT); // vin
        obd.setEvent(event != null ? event : 0);
        String ip = (String) attr.get(Position.KEY_IP);
        obd.setIp(ip);
        Double distance = (Double) attr.get(Position.KEY_DISTANCE);
        obd.setDistance(distance);
        Double totalDistance = (Double) attr.get(Position.KEY_TOTAL_DISTANCE);
        obd.setTotalDistance(totalDistance);
        obd.setCourse(0);
        try {
            dataManagerCar.addObd(obd);
        } catch (Exception error) {
            Log.debug("Error decode Obd " + error);
        }

    }
}

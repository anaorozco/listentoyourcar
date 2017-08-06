/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.traccar.obd;

import java.util.Date;
import org.traccar.model.Message;

/**
 *
 * @author phndavid
 */
public class Obd extends Message {

    private Date serverTime;

    public Date getServerTime() {
        if (serverTime != null) {
            return new Date(serverTime.getTime());
        } else {
            return null;
        }
    }

    public void setServerTime(Date serverTime) {
        if (serverTime != null) {
            this.serverTime = new Date(serverTime.getTime());
        } else {
            this.serverTime = null;
        }
    }

    private Date deviceTime;

    public Date getDeviceTime() {
        if (deviceTime != null) {
            return new Date(deviceTime.getTime());
        } else {
            return null;
        }
    }

    public void setDeviceTime(Date deviceTime) {
        if (deviceTime != null) {
            this.deviceTime = new Date(deviceTime.getTime());
        } else {
            this.deviceTime = null;
        }
    }

    private Date fixTime;

    public Date getFixTime() {
        if (fixTime != null) {
            return new Date(fixTime.getTime());
        } else {
            return null;
        }
    }

    public void setFixTime(Date fixTime) {
        if (fixTime != null) {
            this.fixTime = new Date(fixTime.getTime());
        } else {
            this.fixTime = null;
        }
    }

    private boolean valid;

    public boolean getValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }
    private double latitude;

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    private double longitude;

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    private double altitude; // value in meters

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    private double speed; // value in knots

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    private double hdop;

    public double getHdop() {
        return hdop;
    }

    public void setHdop(double hdop) {
        this.hdop = hdop;
    }

    private boolean ignition;

    public boolean getIgnition() {
        return this.ignition;
    }

    public void setIgnition(boolean ignition) {
        this.ignition = ignition;
    }

    private double status;

    public double getStatus() {
        return this.status;
    }

    public void setStatus(double status) {
        this.status = status;
    }

    private double odometer;

    public double getOdometer() {
        return this.odometer;
    }

    public void setOdometer(double odometer) {
        this.odometer = odometer;
    }

    private double adc0;

    public double getAdc0() {
        return this.adc0;
    }

    public void setAdc0(double adc0) {
        this.adc0 = adc0;
    }

    private double adc1;

    public double getAdc1() {
        return this.adc1;
    }

    public void setAdc1(double adc1) {
        this.adc1 = adc1;
    }

    private double adc2;

    public double getAdc2() {
        return this.adc2;
    }

    public void setAdc2(double adc2) {
        this.adc2 = adc2;
    }

    private double adc3;

    public double getAdc3() {
        return this.adc3;
    }

    public void setAdc3(double adc3) {
        this.adc3 = adc3;
    }

    private double geofenceIn;

    public double getGeofenceIn() {
        return this.geofenceIn;
    }

    public void setGeofenceIn(double geofenceIn) {
        this.geofenceIn = geofenceIn;
    }

    private double geofenceAlarm;

    public double getGeofenceAlarm() {
        return this.geofenceAlarm;
    }

    public void setGeofenceAlarm(double geofenceAlarm) {
        this.geofenceAlarm = geofenceAlarm;
    }

    private double coolantTemperature;

    public double getCoolantTemperature() {
        return this.coolantTemperature;
    }

    public void setCoolantTemperature(double coolantTemperature) {
        this.coolantTemperature = coolantTemperature;
    }

    private double rpm;

    public double getRpm() {
        return this.rpm;
    }

    public void setRpm(double rpm) {
        this.rpm  = rpm;
    }

    private double obdSpeed;

    public double getObdSpeed() {
        return obdSpeed;
    }

    public void setObdSpeed(double obdSpeed) {
        this.obdSpeed = obdSpeed;
    }

    private double fuelConsumption;

    public double getFuelConsumption() {
        return this.fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    private double vin;

    public double getVin() {
        return vin;
    }

    public void setVin(double vin) {
        this.vin = vin;
    }

    private double event;

    public double getEvent() {
        return this.event;
    }

    public void setEvent(double event) {
        this.event = event;
    }

    private String ip;

    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    private double distance;

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    private double totalDistance;

    public double getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(double totalDistance) {
        this.totalDistance = totalDistance;
    }

    private double course;

    public double getCourse() {
        return this.course;
    }

    public void setCourse(double course) {
        this.course = course;
    }
}

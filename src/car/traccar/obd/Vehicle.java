/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.traccar.obd;

import org.traccar.model.Message;

/**
 *
 * @author Nelson David Padilla H.
 */
public class Vehicle extends Message {

    private String license;

    public String getLicense() {
        return this.license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    private String model;

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    private String status;

    public String getStatus() {
        return this.status;
    }

    public void setString(String status) {
        this.status = status;
    }

    private String category;

    public String getCategory() {
        return this.category;
    }

    private String ecodrive;

    public String getEcodrive() {
        return this.ecodrive;
    }

    public void setEcodrive(String ecodrive) {
        this.ecodrive = ecodrive;
    }

    private double emission;

    public double getEmission() {
        return this.emission;
    }

    public void setEmission(double emission) {
        this.emission = emission;
    }
}

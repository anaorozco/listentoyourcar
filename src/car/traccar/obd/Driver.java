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
public class Driver extends Message {

    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String lastName;

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String birthDate;

    public String getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    private String drivingBehaviour;

    public String getDrivingBehaviour() {
        return this.drivingBehaviour;
    }

    public void setDrivingBehaviour(String drivingBehaviour) {
        this.drivingBehaviour = drivingBehaviour;
    }
}

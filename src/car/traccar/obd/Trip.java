/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.traccar.obd;

import org.traccar.model.Message;

/**
 *
 * @author phndavid
 */
public class Trip extends Message {

    private double startPoint;

    public double getStartPoint() {
        return this.startPoint;
    }

    public void setStartPoint(double startPoint) {
        this.startPoint = startPoint;
    }

    private double endPoint;

    public double getEndPoint() {
        return this.endPoint;
    }

    public void setEndPoint(double endPoint) {
        this.endPoint = endPoint;
    }

}

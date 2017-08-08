/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.traccar.obd.datalib;

import java.sql.SQLException;
import java.util.Date;
import javax.sql.DataSource;
import org.traccar.Config;
import car.traccar.obd.Driver;
import car.traccar.obd.Obd;
import car.traccar.obd.Trip;
import car.traccar.obd.Vehicle;
import org.traccar.database.QueryBuilder;
import org.traccar.helper.Log;


/**
 *
 * @author phndavid
 */
public class DataManagerCar {

    private final Config config;

    private DataSource dataSource;

     public DataManagerCar(Config config, DataSource dataSource) throws Exception {
        this.config = config;
        this.dataSource = dataSource;
    }

    private String getQuery(String key) {
        String query = config.getString(key);
        if (query == null) {
            Log.info("Query not provided: " + key);
        }
        return query;
    }

    public Obd getObd(long obdId) throws SQLException {
        return QueryBuilder.create(dataSource, getQuery("database.selectObd"))
                .setLong("id", obdId)
                .executeQuerySingle(Obd.class);
    }

    public void addObd(Obd obd) throws SQLException {
        obd.setId(QueryBuilder.create(dataSource, getQuery("database.insertObd"), true)
                .setDate("now", new Date())
                .setObject(obd)
                .executeUpdate());
    }

    public Vehicle getVehicle(long vehicleId) throws SQLException {
        return QueryBuilder.create(dataSource, getQuery("database.selectVehicle"))
                .setLong("id", vehicleId)
                .executeQuerySingle(Vehicle.class);
    }

    public void addVehicle(Vehicle vehicle) throws SQLException {
        vehicle.setId(QueryBuilder.create(dataSource, getQuery("database.insertVehicle"), true)
                .setDate("now", new Date())
                .setObject(vehicle)
                .executeUpdate());
    }

    public Trip getTrip(long tripId) throws SQLException {
        return QueryBuilder.create(dataSource, getQuery("database.selectTrip"))
                .setLong("id", tripId)
                .executeQuerySingle(Trip.class);
    }

    public void addTrip(Trip trip) throws SQLException {
        trip.setId(QueryBuilder.create(dataSource, getQuery("database.insertTrip"), true)
                .setDate("now", new Date())
                .setObject(trip)
                .executeUpdate());
    }

    public Driver getDriver(long driverId) throws SQLException {
        return QueryBuilder.create(dataSource, getQuery("database.selectDriver"))
                .setLong("id", driverId)
                .executeQuerySingle(Driver.class);
    }

    public void addDriver(Driver driver) throws SQLException {
        driver.setId(QueryBuilder.create(dataSource, getQuery("database.insertDriver"), true)
                .setDate("now", new Date())
                .setObject(driver)
                .executeUpdate());
    }
}

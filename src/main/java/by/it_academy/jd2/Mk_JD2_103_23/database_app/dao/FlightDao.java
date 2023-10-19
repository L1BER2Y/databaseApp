package by.it_academy.jd2.Mk_JD2_103_23.database_app.dao;

import by.it_academy.jd2.Mk_JD2_103_23.database_app.core.dto.Airport;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.core.dto.Flight;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.dao.api.IAirportDao;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.dao.api.IFlightDao;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FlightDao implements IFlightDao {
    private final static String GET_ALL_FLIGHTS = "SELECT flight_id, flight_no, scheduled_departure, scheduled_departure_local, scheduled_arrival, scheduled_arrival_local, scheduled_duration, departure_airport, departure_airport_name, departure_city, arrival_airport, arrival_airport_name, arrival_city, status, aircraft_code, actual_departure, actual_departure_local, actual_arrival, actual_arrival_local, actual_duration FROM bookings.flights_v;";

    private final DataSource dataSource;

    public FlightDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    @Override
    public List<Flight> getAll() {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stm = conn.prepareStatement(GET_ALL_FLIGHTS);
             ResultSet rs = stm.executeQuery();)
        {
            List<Flight> data = new ArrayList<>();
            while (rs.next()){
                Flight item = new Flight();
                item.setFlightId(rs.getString("flight_id"));
                item.setFlightNo(rs.getString("flight_no"));
                item.setScheduledDeparture(rs.getString("scheduled_departure"));
                item.setScheduledDepartureLocal(rs.getString("scheduled_departure_local"));
                item.setScheduledArrival(rs.getString("scheduled_arrival"));
                item.setScheduledArrivalLocal(rs.getString("scheduled_arrival_local"));
                item.setScheduledDuration(rs.getString("scheduled_duration"));
                item.setDepartureAirport(rs.getString("departure_airport"));
                item.setDepartureAirportName(rs.getString("departure_airport_name"));
                item.setDepartureCity(rs.getString("departure_city"));
                item.setArrivalAirport(rs.getString("arrival_airport"));
                item.setArrivalAirportName(rs.getString("arrival_airport_name"));
                item.setArrivalCity(rs.getString("arrival_city"));
                item.setStatus(rs.getString("status"));
                item.setAircraftCode(rs.getString("aircraft_code"));
                item.setActualDeparture(rs.getString("actual_departure"));
                item.setActualDepartureLocal(rs.getString("actual_departure_local"));
                item.setActualArrival(rs.getString("actual_arrival"));
                item.setActualArrivalLocal(rs.getString("actual_arrival_local"));
                item.setActualDuration(rs.getString("actual_duration"));

                data.add(item);
            }

            return data;

        } catch (SQLException e){
            throw new IllegalStateException("Ошибка получения информации о аэропортах", e);
        }
    }
}

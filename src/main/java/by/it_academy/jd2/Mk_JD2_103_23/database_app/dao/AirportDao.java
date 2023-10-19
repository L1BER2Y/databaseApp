package by.it_academy.jd2.Mk_JD2_103_23.database_app.dao;

import by.it_academy.jd2.Mk_JD2_103_23.database_app.core.dto.Airport;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.dao.api.IAirportDao;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AirportDao implements IAirportDao {
    private final static String GET_ALL_AIRPORTS = "SELECT airport_code, airport_name, city, coordinates, timezone FROM bookings.airports;";

    private final DataSource dataSource;

    public AirportDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    @Override
    public List<Airport> getAll() {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stm = conn.prepareStatement(GET_ALL_AIRPORTS);
             ResultSet rs = stm.executeQuery();)
        {
            List<Airport> data = new ArrayList<>();
            while (rs.next()){
                Airport item = new Airport();
                item.setAirportCode(rs.getString("airport_code"));
                item.setAirportName(rs.getString("airport_name"));
                item.setCity(rs.getString("city"));
                item.setCoordinates(rs.getString("coordinates"));
                item.setTimezone(rs.getString("timezone"));

                data.add(item);
            }

            return data;

        } catch (SQLException e){
            throw new IllegalStateException("Ошибка получения информации о аэропортах", e);
        }
    }
}

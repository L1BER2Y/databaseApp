package by.it_academy.jd2.Mk_JD2_103_23.database_app.dao;

import by.it_academy.jd2.Mk_JD2_103_23.database_app.core.dto.Aircraft;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.dao.api.IAircraftDao;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AircraftDao implements IAircraftDao {
    private final static String GET_ALL_AIRCRAFTS = "SELECT aircraft_code, model, range FROM bookings.aircrafts;";

    private final DataSource dataSource;

    public AircraftDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    @Override
    public List<Aircraft> getAll() {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stm = conn.prepareStatement(GET_ALL_AIRCRAFTS);
             ResultSet rs = stm.executeQuery();)
        {
            List<Aircraft> data = new ArrayList<>();
            while (rs.next()){
                Aircraft item = new Aircraft();
                item.setAircraftCode(rs.getString("aircraft_code"));
                item.setModel(rs.getString("model"));
                item.setRange(rs.getInt("range"));

                data.add(item);
            }

            return data;

        } catch (SQLException e){
            throw new IllegalStateException("Ошибка получения информации о самолётах", e);
        }
    }
}

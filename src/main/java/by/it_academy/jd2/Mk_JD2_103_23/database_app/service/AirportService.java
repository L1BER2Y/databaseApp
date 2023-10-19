package by.it_academy.jd2.Mk_JD2_103_23.database_app.service;

import by.it_academy.jd2.Mk_JD2_103_23.database_app.core.dto.Airport;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.dao.api.IAirportDao;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.service.api.IAirportService;

import java.util.List;

public class AirportService implements IAirportService {
    private final IAirportDao dao;

    public AirportService(IAirportDao dao) {
        this.dao = dao;
    }


    @Override
    public List<Airport> getAll() {
        return this.dao.getAll();
    }
}

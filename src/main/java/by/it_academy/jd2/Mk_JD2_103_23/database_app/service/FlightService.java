package by.it_academy.jd2.Mk_JD2_103_23.database_app.service;

import by.it_academy.jd2.Mk_JD2_103_23.database_app.core.dto.Airport;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.core.dto.Flight;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.dao.api.IAirportDao;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.dao.api.IFlightDao;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.service.api.IAirportService;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.service.api.IFlightService;

import java.util.List;

public class FlightService implements IFlightService {
    private final IFlightDao dao;

    public FlightService(IFlightDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Flight> getAll() {
        return this.dao.getAll();
    }
}

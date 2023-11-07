package by.it_academy.jd2.Mk_JD2_103_23.database_app.service;

import by.it_academy.jd2.Mk_JD2_103_23.database_app.core.dto.Airport;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.core.dto.Filter;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.core.dto.Flight;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.core.dto.PageFormat;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.dao.api.IFlightDao;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.service.api.IFlightService;

import java.util.List;
import java.util.stream.Collectors;

public class FlightService implements IFlightService {
    private final IFlightDao dao;

    public FlightService(IFlightDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Flight> getAll() {
        return this.dao.getAll().stream()
                .map(flightEntity -> new Flight(flightEntity.getFlightId(), flightEntity.getFlightNo(), flightEntity.getScheduledDeparture(),
                        flightEntity.getScheduledDepartureLocal(), flightEntity.getScheduledArrival(), flightEntity.getScheduledArrivalLocal(),
                        flightEntity.getScheduledDuration(), flightEntity.getDepartureAirport(), flightEntity.getDepartureAirportName(),
                        flightEntity.getDepartureCity(), flightEntity.getArrivalAirport(), flightEntity.getArrivalAirportName(),
                        flightEntity.getArrivalCity(), flightEntity.getStatus(), flightEntity.getAircraftCode(), flightEntity.getActualDeparture(),
                        flightEntity.getScheduledDepartureLocal(), flightEntity.getActualArrival(), flightEntity.getActualArrivalLocal(),
                        flightEntity.getActualDuration()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Flight> getPage(PageFormat pageFormat) {
        return this.dao.getPage(pageFormat).stream()
                .map(flightEntity -> new Flight(flightEntity.getFlightId(), flightEntity.getFlightNo(), flightEntity.getScheduledDeparture(),
                        flightEntity.getScheduledDepartureLocal(), flightEntity.getScheduledArrival(), flightEntity.getScheduledArrivalLocal(),
                        flightEntity.getScheduledDuration(), flightEntity.getDepartureAirport(), flightEntity.getDepartureAirportName(),
                        flightEntity.getDepartureCity(), flightEntity.getArrivalAirport(), flightEntity.getArrivalAirportName(),
                        flightEntity.getArrivalCity(), flightEntity.getStatus(), flightEntity.getAircraftCode(), flightEntity.getActualDeparture(),
                        flightEntity.getScheduledDepartureLocal(), flightEntity.getActualArrival(), flightEntity.getActualArrivalLocal(),
                        flightEntity.getActualDuration()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Flight> getPage(Filter filter, PageFormat pageFormat) {
        return this.dao.getPage(filter, pageFormat).stream()
                .map(flightEntity -> new Flight(flightEntity.getFlightId(), flightEntity.getFlightNo(), flightEntity.getScheduledDeparture(),
                        flightEntity.getScheduledDepartureLocal(), flightEntity.getScheduledArrival(), flightEntity.getScheduledArrivalLocal(),
                        flightEntity.getScheduledDuration(), flightEntity.getDepartureAirport(), flightEntity.getDepartureAirportName(),
                        flightEntity.getDepartureCity(), flightEntity.getArrivalAirport(), flightEntity.getArrivalAirportName(),
                        flightEntity.getArrivalCity(), flightEntity.getStatus(), flightEntity.getAircraftCode(), flightEntity.getActualDeparture(),
                        flightEntity.getScheduledDepartureLocal(), flightEntity.getActualArrival(), flightEntity.getActualArrivalLocal(),
                        flightEntity.getActualDuration()))
                .collect(Collectors.toList());
    }
}

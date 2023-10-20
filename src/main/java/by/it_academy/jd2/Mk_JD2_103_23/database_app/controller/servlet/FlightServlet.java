package by.it_academy.jd2.Mk_JD2_103_23.database_app.controller.servlet;

import by.it_academy.jd2.Mk_JD2_103_23.database_app.core.dto.Filter;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.core.dto.Flight;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.core.dto.PageFormat;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.service.api.IFlightService;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.service.factory.FlightServiceFactory;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@WebServlet(urlPatterns = "/flights")
public class FlightServlet extends HttpServlet {
    private static final String PAGE_PARAM = "page";
    private static final String SIZE_PARAM = "size";
    private static final String SCHEDULED_DEPARTURE_PARAM = "scheduled_departure";
    private static final String SCHEDULED_ARRIVAL_PARAM = "scheduled_arrival";
    private static final String DEPARTURE_AIRPORT_PARAM = "departure_airport";
    private static final String ARRIVAL_AIRPORT_PARAM = "arrival_airport";
    private static final String STATUS_PARAM = "status";
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
    private final IFlightService service = FlightServiceFactory.getInstance();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String scheduledDepartureRaw = req.getParameter(SCHEDULED_DEPARTURE_PARAM);
        LocalDate scheduledDeparture = null;
        if(scheduledDepartureRaw != null && !scheduledDepartureRaw.isBlank()){
            scheduledDeparture = LocalDate.parse(scheduledDepartureRaw, formatter);
        }

        String scheduledArrivalRaw = req.getParameter(SCHEDULED_ARRIVAL_PARAM);
        LocalDate scheduledArrival = null;
        if(scheduledArrivalRaw != null && !scheduledArrivalRaw.isBlank()){
            scheduledArrival = LocalDate.parse(scheduledArrivalRaw, formatter);
        }

        String departureAirport = req.getParameter(DEPARTURE_AIRPORT_PARAM);
        String arrivalAirport = req.getParameter(ARRIVAL_AIRPORT_PARAM);
        String status = req.getParameter(STATUS_PARAM);

        String pageRaw = req.getParameter(PAGE_PARAM);
        int page;
        if(pageRaw == null || pageRaw.isBlank()){
            page = 1;
        } else {
            page = Integer.parseInt(pageRaw);
        }
        String sizeRaw = req.getParameter(SIZE_PARAM);
        int size;
        if(sizeRaw == null || sizeRaw.isBlank()){
            size = 50;
        } else {
            size = Integer.parseInt(sizeRaw);
        }

        Filter filter = new Filter(scheduledDeparture, scheduledArrival, departureAirport, arrivalAirport, status);
        PageFormat pageFormat = new PageFormat(page, size);

        List<Flight> allFlight = this.service.getPage(filter, pageFormat);
        req.setAttribute("allFlight", allFlight);
        req.getRequestDispatcher("/ui/flights.jsp").forward(req, resp);
    }
}

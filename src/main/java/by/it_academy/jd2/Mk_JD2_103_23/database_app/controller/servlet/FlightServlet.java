package by.it_academy.jd2.Mk_JD2_103_23.database_app.controller.servlet;

import by.it_academy.jd2.Mk_JD2_103_23.database_app.core.dto.Flight;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.service.api.IFlightService;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.service.factory.FlightServiceFactory;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/flights")
public class FlightServlet extends HttpServlet {
    private final IFlightService service = FlightServiceFactory.getInstance();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Flight> allFlight = this.service.getAll();
        req.setAttribute("allFlight", allFlight);
        req.getRequestDispatcher("/ui/flights.jsp").forward(req, resp);
    }
}

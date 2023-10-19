package by.it_academy.jd2.Mk_JD2_103_23.database_app.controller.servlet;

import by.it_academy.jd2.Mk_JD2_103_23.database_app.core.dto.Aircraft;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.service.api.IAircraftService;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.service.factory.AircraftServiceFactory;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/aircrafts")
public class AircraftServlet extends HttpServlet {
    private final IAircraftService service = AircraftServiceFactory.getInstance();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Aircraft> allAircraft = this.service.getAll();
        req.setAttribute("allAircraft", allAircraft);
        req.getRequestDispatcher("/ui/aircrafts.jsp").forward(req, resp);
    }
}

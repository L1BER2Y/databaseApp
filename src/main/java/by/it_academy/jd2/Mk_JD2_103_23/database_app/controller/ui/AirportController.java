package by.it_academy.jd2.Mk_JD2_103_23.database_app.controller.ui;

import by.it_academy.jd2.Mk_JD2_103_23.database_app.core.dto.Airport;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.service.api.IAirportService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
@Controller
@RequestMapping("/airports")
public class AirportController{

    private final IAirportService service;

    public AirportController(IAirportService service) {
        this.service = service;
    }

    @GetMapping
    public String doGet(Model model) {
        List<Airport> data = this.service.getAll();
        model.addAttribute("data", data);
        return "airports";
    }
}
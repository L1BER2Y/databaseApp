package by.it_academy.jd2.Mk_JD2_103_23.database_app.controller.ui;

import by.it_academy.jd2.Mk_JD2_103_23.database_app.core.dto.Aircraft;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.service.api.IAircraftService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;
@Controller
@RequestMapping("/aircrafts")
public class AircraftController {

    private final IAircraftService service;

    public AircraftController(IAircraftService service) {
        this.service = service;
    }

    @GetMapping
    protected String get(Model model) {
        List<Aircraft> data = this.service.getAll();
        model.addAttribute("data", data);
        return "aircrafts";
    }
}
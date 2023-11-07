package by.it_academy.jd2.Mk_JD2_103_23.database_app.controller.ui;

import by.it_academy.jd2.Mk_JD2_103_23.database_app.core.dto.Filter;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.core.dto.Flight;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.core.dto.PageFormat;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.service.api.IFlightService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@Controller
@RequestMapping("/flights")
public class FlightController {

    private final IFlightService service;

    public FlightController(IFlightService service) {
        this.service = service;
    }

    @GetMapping
    public String list(
            Model model,
            Filter filter,
            @RequestParam(defaultValue = "1") Integer page,
            @RequestParam(defaultValue = "50") Integer size
    ) {
        PageFormat pageFormat = new PageFormat(page, size);

        List<Flight> data = this.service.getPage(filter, pageFormat);
        model.addAttribute("data", data);
        return "flights";
    }
}

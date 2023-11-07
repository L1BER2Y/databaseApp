package by.it_academy.jd2.Mk_JD2_103_23.database_app.controller.api;

import by.it_academy.jd2.Mk_JD2_103_23.database_app.core.dto.Filter;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.core.dto.Flight;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.core.dto.PageFormat;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.service.api.IFlightService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/flights")
public class FlightRestController {

    private final IFlightService service;

    public FlightRestController(IFlightService service) {
        this.service = service;
    }

    @GetMapping
    public List<Flight> list(Filter filter,
                             @RequestParam(defaultValue = "1") Integer page,
                             @RequestParam(defaultValue = "50") Integer size
    ) {
        PageFormat pageFormat = new PageFormat(page, size);

        return this.service.getPage(filter, pageFormat);
    }
}
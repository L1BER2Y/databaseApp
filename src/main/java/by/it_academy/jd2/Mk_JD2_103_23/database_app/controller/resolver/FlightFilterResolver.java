package by.it_academy.jd2.Mk_JD2_103_23.database_app.controller.resolver;

import by.it_academy.jd2.Mk_JD2_103_23.database_app.core.dto.Filter;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FlightFilterResolver implements HandlerMethodArgumentResolver {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");

    private static final String SCHEDULED_DEPARTURE_PARAM = "scheduled_departure";
    private static final String SCHEDULED_ARRIVAL_PARAM = "scheduled_arrival";
    private static final String DEPARTURE_AIRPORT_PARAM = "departure_airport";
    private static final String ARRIVAL_AIRPORT_PARAM = "arrival_airport";
    private static final String STATUS_PARAM = "status";

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.getDeclaringClass().equals(Filter.class);
    }

    @Override
    public Object resolveArgument(MethodParameter parameter,
                                  ModelAndViewContainer mavContainer,
                                  NativeWebRequest req,
                                  WebDataBinderFactory binderFactory) throws Exception {

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

        Filter filter = new Filter(scheduledDeparture, scheduledArrival, departureAirport, arrivalAirport, status);


        return filter;
    }
}

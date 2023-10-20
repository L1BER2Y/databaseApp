package by.it_academy.jd2.Mk_JD2_103_23.database_app.dao.api;

import by.it_academy.jd2.Mk_JD2_103_23.database_app.core.dto.Filter;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.core.dto.Flight;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.core.dto.PageFormat;

import java.util.List;

public interface IFlightDao {
    List<Flight> getAll();

    List<Flight> getPage(PageFormat pageFormat);
    List<Flight> getPage(Filter filter, PageFormat pageFormat);
}

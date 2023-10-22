package by.it_academy.jd2.Mk_JD2_103_23.database_app.dao.api;

import by.it_academy.jd2.Mk_JD2_103_23.database_app.core.dto.Filter;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.core.dto.PageFormat;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.dao.entity.FlightEntity;

import java.util.List;

public interface IFlightDao {
    List<FlightEntity> getAll();

    List<FlightEntity> getPage(PageFormat pageFormat);
    List<FlightEntity> getPage(Filter filter, PageFormat pageFormat);
}

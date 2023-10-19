package by.it_academy.jd2.Mk_JD2_103_23.database_app.dao.api;

import by.it_academy.jd2.Mk_JD2_103_23.database_app.core.dto.Aircraft;

import java.util.List;

public interface IAircraftDao {
    List<Aircraft> getAll();
}

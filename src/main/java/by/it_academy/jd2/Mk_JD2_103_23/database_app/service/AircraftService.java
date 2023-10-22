package by.it_academy.jd2.Mk_JD2_103_23.database_app.service;

import by.it_academy.jd2.Mk_JD2_103_23.database_app.core.dto.Aircraft;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.dao.api.IAircraftDao;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.service.api.IAircraftService;
import java.util.List;
import java.util.stream.Collectors;

public class AircraftService implements IAircraftService {
    private final IAircraftDao dao;

    public AircraftService(IAircraftDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Aircraft> getAll() {
        return this.dao.getAll().stream()
                .map(aircraftEntity -> new Aircraft(aircraftEntity.getAircraftCode(), aircraftEntity.getModel(), aircraftEntity.getRange()))
                .collect(Collectors.toList());
    }

}

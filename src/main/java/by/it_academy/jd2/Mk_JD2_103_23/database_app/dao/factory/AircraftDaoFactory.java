package by.it_academy.jd2.Mk_JD2_103_23.database_app.dao.factory;

import by.it_academy.jd2.Mk_JD2_103_23.database_app.dao.AircraftDao;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.dao.api.IAircraftDao;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.dao.data_source.DBDataSource;

public class AircraftDaoFactory {
    private static volatile IAircraftDao instance;

    private AircraftDaoFactory() {
    }

    public static IAircraftDao getInstance() {
        if(instance == null){
            synchronized (AircraftDaoFactory.class){
                if(instance == null){
                    instance = new AircraftDao(DBDataSource.getInstance());
                }
            }
        }
        return instance;
    }
}

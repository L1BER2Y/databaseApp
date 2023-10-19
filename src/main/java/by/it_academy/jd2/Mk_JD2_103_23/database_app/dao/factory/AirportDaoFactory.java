package by.it_academy.jd2.Mk_JD2_103_23.database_app.dao.factory;

import by.it_academy.jd2.Mk_JD2_103_23.database_app.dao.AirportDao;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.dao.api.IAirportDao;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.dao.data_source.DBDataSource;

public class AirportDaoFactory {
    private static volatile IAirportDao instance;

    private AirportDaoFactory() {
    }

    public static IAirportDao getInstance() {
        if(instance == null){
            synchronized (AirportDaoFactory.class){
                if(instance == null){
                    instance = new AirportDao(DBDataSource.getInstance());
                }
            }
        }
        return instance;
    }
}

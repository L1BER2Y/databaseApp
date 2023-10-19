package by.it_academy.jd2.Mk_JD2_103_23.database_app.dao.factory;

import by.it_academy.jd2.Mk_JD2_103_23.database_app.dao.FlightDao;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.dao.api.IFlightDao;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.dao.data_source.DBDataSource;

public class FlightDaoFactory {
    private static volatile IFlightDao instance;

    private FlightDaoFactory() {
    }

    public static IFlightDao getInstance() {
        if(instance == null){
            synchronized (FlightDaoFactory.class){
                if(instance == null){
                    instance = new FlightDao(DBDataSource.getInstance());
                }
            }
        }
        return instance;
    }
}

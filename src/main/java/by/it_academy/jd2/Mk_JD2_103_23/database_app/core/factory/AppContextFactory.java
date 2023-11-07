package by.it_academy.jd2.Mk_JD2_103_23.database_app.core.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppContextFactory {
    private static final ApplicationContext context;

    static {
        context =
                new ClassPathXmlApplicationContext("context.xml");
    }

    public static  <T> T getBean(Class<T> type){
        return context.getBean(type);
    }
}

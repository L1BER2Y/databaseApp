package by.it_academy.jd2.Mk_JD2_103_23.database_app.dao;

import by.it_academy.jd2.Mk_JD2_103_23.database_app.dao.api.IAirportDao;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.dao.entity.AircraftEntity;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.dao.entity.AirportEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import java.util.List;

public class AirportDao implements IAirportDao {
    private final EntityManagerFactory emf;

    public AirportDao(EntityManagerFactory emf) {
        this.emf = emf;
    }
    @Override
    public List<AirportEntity> getAll() {
        EntityManager em = emf.createEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<AirportEntity> query = cb.createQuery(AirportEntity.class);
        return em.createQuery(query).getResultList();
    }
}

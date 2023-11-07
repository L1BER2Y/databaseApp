package by.it_academy.jd2.Mk_JD2_103_23.database_app.dao;

import by.it_academy.jd2.Mk_JD2_103_23.database_app.core.dto.Filter;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.core.dto.PageFormat;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.dao.api.IFlightDao;
import by.it_academy.jd2.Mk_JD2_103_23.database_app.dao.entity.FlightEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class FlightDao implements IFlightDao {
    private final EntityManagerFactory emf;

    public FlightDao(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public List<FlightEntity> getAll() {
        EntityManager em = emf.createEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<FlightEntity> query = cb.createQuery(FlightEntity.class);
        return em.createQuery(query).getResultList();
    }

    @Override
    public List<FlightEntity> getPage(PageFormat pageFormat) {
        return getPage(null, pageFormat);
    }

    @Override
    public List<FlightEntity> getPage(Filter filter, PageFormat pageFormat) {
        EntityManager em = emf.createEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<FlightEntity> query = cb.createQuery(FlightEntity.class);
        Root<FlightEntity> root = query.from(FlightEntity.class);

        Predicate finalPredicate = createPredicate(filter, cb, root);

        query.where(finalPredicate);

        return em.createQuery(query)
                .setFirstResult(pageFormat.getPage())
                .setMaxResults(pageFormat.getSize())
                .getResultList();
        }
    private Predicate createPredicate(Filter filter, CriteriaBuilder cb, Root<FlightEntity> root) {

        List<Predicate> predicates = new ArrayList<>();

        if (filter != null) {
            if (filter.getArrivalAirport() != null) {
                predicates.add(cb.equal(root.get("arrivalAirport"), filter.getArrivalAirport()));
            }
            if (filter.getDepartureAirport() != null) {
                predicates.add(cb.equal(root.get("departureAirport"), filter.getDepartureAirport()));
            }
            if (filter.getStatus() != null) {
                predicates.add(cb.equal(root.get("status"), filter.getStatus()));
            }
            if (filter.getScheduledDeparture() != null) {
                predicates.add(cb.greaterThanOrEqualTo(root.get("scheduledDeparture"), filter.getScheduledDeparture()));
                predicates.add(cb.lessThan(root.get("scheduledDeparture"), filter.getScheduledDeparture().plusDays(1)));
            }
            if (filter.getScheduledArrival() != null) {
                predicates.add(cb.greaterThanOrEqualTo(root.get("scheduledArrival"), filter.getScheduledArrival()));
                predicates.add(cb.lessThan(root.get("scheduledArrival"), filter.getScheduledArrival().plusDays(1)));
            }
        }
        return cb.and(predicates.toArray(Predicate[]::new));
    }
}


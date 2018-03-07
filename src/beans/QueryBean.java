package beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
public class QueryBean {
    @PersistenceContext(name = "TimelinePU")
    EntityManager em;

    public List<EventEntity> getListOfYears() {
        List<EventEntity> theQuery =
                em.createQuery("select c.year from EventEntity c order by c.year", EventEntity.class)
                        .getResultList();
        List<EventEntity> result = theQuery;
        return result;
    }

    public List<EventEntity> getListOfEvents() {
        List<EventEntity> theQuery =
                em.createQuery("select c from EventEntity c order by c.year", EventEntity.class)
                        .getResultList();
        List<EventEntity> result = theQuery;
        return result;
    }

    public LoginEntity getUsers(String user, String password) {
        LoginEntity search = new LoginEntity();
        try {
            search = (LoginEntity)
                    em.createQuery("select c from LoginEntity c where c.user=:User AND c.password=:Password")
                            .setParameter("User", user)
                            .setParameter("Password", password)
                            .getSingleResult();
            return search;
        } catch (NoResultException ex) {
            return null;
        }
    }

    public void deleteEvent(int year) {
                    em.createQuery("delete from EventEntity c where c.year=:Year")
                            .setParameter("Year", year)
                            .executeUpdate();
    }

    public void updateEvent(int year, int newYear, String headline, String description) {
        em.createQuery("update EventEntity c set c.year=:NewYear, c.headline=:Headline, c.description=:Description where c.year=:Year")
                .setParameter("Year", year)
                .setParameter("NewYear", newYear)
                .setParameter("Headline", headline)
                .setParameter("Description", description)
                .executeUpdate();
    }


    public void addEvent(int year, String headline, String description) {
        EventEntity ee = new EventEntity();

        ee.setYear(year);
        ee.setHeadline(headline);
        ee.setDescription(description);
        em.persist(ee);
    }
}
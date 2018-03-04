package beans;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;
@Stateless
public class QueryBean {
    @PersistenceContext(name="TimelinePU")
    EntityManager em;

    public List<CompanyEntity> getListOfCompanies() {
        TypedQuery<CompanyEntity> theQuery =
                em.createQuery("select c.cname, c.id, e.date" + " from CompanyEntity c, EventEntity e where c.eventDate = e.date", CompanyEntity.class);
        List<CompanyEntity> result = theQuery.getResultList();
        return result;
    }

    public List<FounderEntity> getListOfFounders() {
        TypedQuery<FounderEntity> theQuery =
                em.createQuery("select c from FounderEntity c", FounderEntity.class);
        List<FounderEntity> result = theQuery.getResultList();
        return result;
    }
}
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

    public List<EventEntity> getListOfEvents() {
        List<EventEntity> theQuery =
                em.createQuery("select c from EventEntity c order by c.year", EventEntity.class)
                .getResultList();
        List<EventEntity> result = theQuery;
        return result;
    }
}
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
}
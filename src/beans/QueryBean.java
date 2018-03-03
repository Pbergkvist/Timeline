package beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless

public class QueryBean {
    @PersistenceContext(name = "TimelinePU")
    EntityManager em;

    public List<CompanyEntity> getQueryCompany() {
        TypedQuery<CompanyEntity> theQuery =
        em.createQuery("select c from CompanyEntity c", CompanyEntity.class);

        List<CompanyEntity> result = theQuery.getResultList();
        return result;
    }

//    public List<UsersEntity> getListOfUsers() {
//        TypedQuery<UsersEntity> theQuery =
//                em.createQuery("select c from UsersEntity c", UsersEntity.class);
//
//
//        List<UsersEntity> result = theQuery.getResultList();
//        return result;
//    }
//
//    public UsersEntity getUsers(String name, String password) {
//        UsersEntity search = new UsersEntity();
//        search = (UsersEntity)
//                em.createQuery("select c from UsersEntity c where c.name=:Name AND c.password=:Password")
//                        .setParameter("Name", name)
//                        .setParameter("Password", password)
//                        .getSingleResult();
//        return search;
//    }
}

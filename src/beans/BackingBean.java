package beans;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class BackingBean implements Serializable {
    @EJB

//    private QueryBean theQuery;

//    public QueryBean getTheQuery() {
//        return theQuery;
//    }

//    public void setTheQuery(QueryBean theQuery) {
//        this.theQuery = theQuery;
//    }

    public void getInfo (String id) {

    }


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    private String companyName;




}

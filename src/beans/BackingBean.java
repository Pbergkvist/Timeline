package beans;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Named
@SessionScoped
public class BackingBean implements Serializable {
    @EJB

    private QueryBean theQuery;
    private String companyName;
    private EventEntity resultEE;
    private List<String> eventlist = new ArrayList<>(Arrays.asList(
            "Spotify",
            "Klarna",
            "IKEA",
            "Visma"
    ));

    public QueryBean getTheQuery() {
        return theQuery;
    }

    public void setTheQuery(QueryBean theQuery) {
        this.theQuery = theQuery;
    }

    public String getEventlist() {
        StringBuilder result = new StringBuilder();

        for (String s: eventlist){
            result.append(s + " ");
        }

        return result.toString();
    }

    public List<CompanyEntity> showCompany() {
        return theQuery.getCompany();
    }

    public void setEventlist(List<String> eventlist) {
        this.eventlist = eventlist;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}

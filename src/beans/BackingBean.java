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
    private CompanyEntity resultCE;

    public QueryBean getTheQuery() {
        return theQuery;
    }

    public void setTheQuery(QueryBean theQuery) {
        this.theQuery = theQuery;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public CompanyEntity getResultCE() {
        return resultCE;
    }

    public void setResultCE(CompanyEntity resultCE) {
        this.resultCE = resultCE;
    }

    //
//    public QueryBean getTheQuery() {
//        return theQuery;
//    }
//
//    public void setTheQuery(QueryBean theQuery) {
//        this.theQuery = theQuery;
//    }
//
//    public CompanyEntity getResultCE() {
//        return resultCE;
//    }
//
//    public void setResultCE(CompanyEntity resultCE) {
//        this.resultCE = resultCE;
//    }
//
//    public String getEventlist() {
//        StringBuilder result = new StringBuilder();
//
//        for (String s: eventlist){
//            result.append(s + " ");
//        }
//
//
//        return result.toString();
//    }
//
//    public List<CompanyEntity> search() {
//        return theQuery.getQueryCompany();
//    }
//
//    public void setEventlist(List<String> eventlist) {
//        this.eventlist = eventlist;
//    }
//
//    public String getCompanyName() {
//        return companyName;
//    }
//
//    public void setCompanyName(String companyName) {
//        this.companyName = companyName;
//    }
}

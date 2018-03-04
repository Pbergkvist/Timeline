package beans;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class BackingBean implements Serializable {
    @EJB
    private QueryBean theQuery;
    private CompanyEntity resultCE;
    private List<CompanyEntity> companylist;
    private List<FounderEntity> founderlist;

    public List<FounderEntity> getFounderlist() {
        return theQuery.getListOfFounders();
    }

    public void setFounderlist(List<FounderEntity> founderlist) {
        this.founderlist = founderlist;
    }

    public List<CompanyEntity> getCompanylist() {
        return theQuery.getListOfCompanies();
    }

    public void setCompanylist(List<CompanyEntity> companylist) {
        this.companylist = companylist;
    }
    public CompanyEntity getResultCE() {
        return resultCE;
    }

    public void setResultCE(CompanyEntity resultCE) {
        this.resultCE = resultCE;
    }

    public QueryBean getTheQuery() {
        return theQuery;
    }

    public void setTheQuery(QueryBean theQuery) {
        this.theQuery = theQuery;
    }

//    public List<CompanyEntity> hello() {
//        return theQuery.getListOfCompanies();
//    }
}
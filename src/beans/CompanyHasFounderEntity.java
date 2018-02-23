package beans;

import javax.persistence.*;

@Entity
@Table(name = "company_has_founder", schema = "timeline", catalog = "")
@IdClass(CompanyHasFounderEntityPK.class)
public class CompanyHasFounderEntity {
    private int companyId;
    private String companyEventDate;
    private String founderFname;

    @Id
    @Column(name = "company_id")
    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    @Id
    @Column(name = "company_event_date")
    public String getCompanyEventDate() {
        return companyEventDate;
    }

    public void setCompanyEventDate(String companyEventDate) {
        this.companyEventDate = companyEventDate;
    }

    @Id
    @Column(name = "founder_fname")
    public String getFounderFname() {
        return founderFname;
    }

    public void setFounderFname(String founderFname) {
        this.founderFname = founderFname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CompanyHasFounderEntity that = (CompanyHasFounderEntity) o;

        if (companyId != that.companyId) return false;
        if (companyEventDate != null ? !companyEventDate.equals(that.companyEventDate) : that.companyEventDate != null)
            return false;
        if (founderFname != null ? !founderFname.equals(that.founderFname) : that.founderFname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = companyId;
        result = 31 * result + (companyEventDate != null ? companyEventDate.hashCode() : 0);
        result = 31 * result + (founderFname != null ? founderFname.hashCode() : 0);
        return result;
    }
}

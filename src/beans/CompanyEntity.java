package beans;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "company", schema = "timeline", catalog = "")
@IdClass(CompanyEntityPK.class)
public class CompanyEntity {
    private int id;
    private String cname;
    private String description;
    private byte[] logo;
    private String type;
    private Integer employees;
    private Integer revenue;
    private String slogan;
    private String headquarters;
    private String eventDate;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "cname")
    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "logo")
    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "employees")
    public Integer getEmployees() {
        return employees;
    }

    public void setEmployees(Integer employees) {
        this.employees = employees;
    }

    @Basic
    @Column(name = "revenue")
    public Integer getRevenue() {
        return revenue;
    }

    public void setRevenue(Integer revenue) {
        this.revenue = revenue;
    }

    @Basic
    @Column(name = "slogan")
    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    @Basic
    @Column(name = "headquarters")
    public String getHeadquarters() {
        return headquarters;
    }

    public void setHeadquarters(String headquarters) {
        this.headquarters = headquarters;
    }

    @Id
    @Column(name = "event_date")
    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CompanyEntity that = (CompanyEntity) o;

        if (id != that.id) return false;
        if (cname != null ? !cname.equals(that.cname) : that.cname != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (!Arrays.equals(logo, that.logo)) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (employees != null ? !employees.equals(that.employees) : that.employees != null) return false;
        if (revenue != null ? !revenue.equals(that.revenue) : that.revenue != null) return false;
        if (slogan != null ? !slogan.equals(that.slogan) : that.slogan != null) return false;
        if (headquarters != null ? !headquarters.equals(that.headquarters) : that.headquarters != null) return false;
        if (eventDate != null ? !eventDate.equals(that.eventDate) : that.eventDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (cname != null ? cname.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(logo);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (employees != null ? employees.hashCode() : 0);
        result = 31 * result + (revenue != null ? revenue.hashCode() : 0);
        result = 31 * result + (slogan != null ? slogan.hashCode() : 0);
        result = 31 * result + (headquarters != null ? headquarters.hashCode() : 0);
        result = 31 * result + (eventDate != null ? eventDate.hashCode() : 0);
        return result;
    }
}

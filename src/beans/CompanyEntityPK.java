package beans;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class CompanyEntityPK implements Serializable {
    private int id;
    private String eventDate;

    @Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "event_date")
    @Id
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

        CompanyEntityPK that = (CompanyEntityPK) o;

        if (id != that.id) return false;
        if (eventDate != null ? !eventDate.equals(that.eventDate) : that.eventDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (eventDate != null ? eventDate.hashCode() : 0);
        return result;
    }
}

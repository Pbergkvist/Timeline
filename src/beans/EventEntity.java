package beans;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "event", schema = "timeline", catalog = "")
public class EventEntity {
    private String headline;
    private int id;
    private Integer year;
    private byte[] picture;
    private String description;

    @Basic
    @Column(name = "headline")
    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "year")
    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Basic
    @Column(name = "picture")
    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EventEntity that = (EventEntity) o;

        if (id != that.id) return false;
        if (headline != null ? !headline.equals(that.headline) : that.headline != null) return false;
        if (year != null ? !year.equals(that.year) : that.year != null) return false;
        if (!Arrays.equals(picture, that.picture)) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = headline != null ? headline.hashCode() : 0;
        result = 31 * result + id;
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(picture);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}

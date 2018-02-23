package beans;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "founder", schema = "timeline", catalog = "")
public class FounderEntity {
    private String fname;
    private Integer yearofbirth;
    private byte[] picture;
    private String birthplace;
    private String education;

    @Id
    @Column(name = "fname")
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    @Basic
    @Column(name = "yearofbirth")
    public Integer getYearofbirth() {
        return yearofbirth;
    }

    public void setYearofbirth(Integer yearofbirth) {
        this.yearofbirth = yearofbirth;
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
    @Column(name = "birthplace")
    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    @Basic
    @Column(name = "education")
    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FounderEntity that = (FounderEntity) o;

        if (fname != null ? !fname.equals(that.fname) : that.fname != null) return false;
        if (yearofbirth != null ? !yearofbirth.equals(that.yearofbirth) : that.yearofbirth != null) return false;
        if (!Arrays.equals(picture, that.picture)) return false;
        if (birthplace != null ? !birthplace.equals(that.birthplace) : that.birthplace != null) return false;
        if (education != null ? !education.equals(that.education) : that.education != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fname != null ? fname.hashCode() : 0;
        result = 31 * result + (yearofbirth != null ? yearofbirth.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(picture);
        result = 31 * result + (birthplace != null ? birthplace.hashCode() : 0);
        result = 31 * result + (education != null ? education.hashCode() : 0);
        return result;
    }
}

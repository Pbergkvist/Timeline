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
    private List<EventEntity> event;
    private String userName;
    private String password;
    private LoginEntity resultLE;
    private boolean visible;

    // Event
    private int year;
    private String headline;
    private String description;

    private int newYear;

    public int getNewYear() {
        return newYear;
    }

    public void setNewYear(int newYear) {
        this.newYear = newYear;
    }

    // update meny
    private List<EventEntity> theYears;

    public List<EventEntity> getTheYears() {
        return theQuery.getListOfYears();
    }

    public void setTheYears(List<EventEntity> theYears) {
        this.theYears = theYears;
    }

    private int selectedyear;

    public int getSelectedyear() {
        return selectedyear;
    }

    public void setSelectedyear(int selectedyear) {
        this.selectedyear = selectedyear;
    }

    public void addEvent() {
        theQuery.addEvent(year, headline, description);
        visible = false;
    }

    public void deleteEvent() {
        theQuery.deleteEvent(selectedyear);
        visible = false;
    }

    public void updateEvent() {
        theQuery.updateEvent(selectedyear, newYear, headline, description);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //

    public void show(){
        visible=true;
    }

    public void hide(){
        visible=false;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public LoginEntity getResultLE() {
        return resultLE;
    }

    public void setResultLE(LoginEntity resultLE) {
        this.resultLE = resultLE;
    }

    public String searchUser() {
        resultLE = theQuery.getUsers(userName, password);

        if (resultLE != null) {
            return "admin";
        } else {
            return "error";
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public QueryBean getTheQuery() {
        return theQuery;
    }

    public void setTheQuery(QueryBean theQuery) {
        this.theQuery = theQuery;
    }

    public List<EventEntity> getEvent() {
        return theQuery.getListOfEvents();
    }

    public void setEvent(List<EventEntity> event) {
        this.event = event;
    }
}
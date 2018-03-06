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
    private boolean hide;

    public boolean isHide() {
        return hide;
    }

    public void setHide(boolean hide) {
        this.hide = hide;
    }

    public void hideOrShow() {

        if (!hide) {
            hide = true;
        } else {
            hide = false;
        }
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
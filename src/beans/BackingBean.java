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
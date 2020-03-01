package taches;
import taches.Resolution;
import taches.Status;
import taches.Tache;

import java.util.Date;
public class Task {
    private String creator;
    private String description;
    private Date executionDate;
    private Status status;
    private Resolution resolution;

    public Task(String creator, String description, Date executionDate, Status status, Resolution resolution) {
        this.creator = creator;
        this.description = description;
        this.executionDate = executionDate;
        this.status = status;
        this.resolution = resolution;
    }
    public String getCreator() {
        return creator;
    }

    public String getDescription() {
        return description;
    }

    public Date getExecutionDate() {
        return executionDate;
    }

    public Status getStatus() {
        return status;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setExecutionDate(Date executionDate) {
        this.executionDate = executionDate;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }
}

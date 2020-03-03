package ch.hesge.cours634.tp2;

import java.util.Date;
import java.util.Objects;

public class Task {
    private User user;
    private String description;
    private Date dateExe;
    private Status status;
    private Resolution resolution;

    public Task(User user, String description, Date dateExe) {
        this.user = user;
        this.description = description;
        this.dateExe = dateExe;
        this.status = Status.open;
        this.resolution = Resolution.inProgress;
    }

    public User getUser() {
        return user;
    }

    public String getDescription() {
        return description;
    }

    public Date getDateExe() {
        return dateExe;
    }

    public Status getStatus() {
        return status;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void modifyDate(Date date){this.dateExe=date;}
    public void changeResolution(Resolution res){this.resolution = res;}
    public void changeStatus(Status stat){this.status = stat;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return user.equals(task.user) &&
                description.equals(task.description) &&
                dateExe.equals(task.dateExe) &&
                status == task.status &&
                resolution == task.resolution;
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, description, dateExe, status, resolution);
    }
}

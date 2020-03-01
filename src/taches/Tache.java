package taches;
import java.util.Date;
public interface Tache {
    void setTask(String creator, String description, Date executionDate, Status status, Resolution resolution);
    void deletTask(String descrption);
    void modifyTask(String description, String champ, String modification);
}

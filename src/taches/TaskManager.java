package taches;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskManager implements Tache{
    private List<Task> tasks;
    private TaskManager(){tasks = new ArrayList<>();
    }

    @Override
    public void setTask(String creator, String description, Date executionDate, Status status, Resolution resolution) {
        Task task = new Task(creator, description, executionDate, status, resolution);
        tasks.add(task);
    }

    @Override
    public void deletTask(String descrption) {
        for (Task task: tasks){
            if (task.getDescription().equals(descrption)){tasks.remove(task);}
        }
    }

    @Override
    public void modifyTask(String description, String champ, String modification) {
        for(Task task: tasks){

        }
    }
}

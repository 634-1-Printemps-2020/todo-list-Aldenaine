package ch.hesge.cours634.tp2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskManager implements TaskManagerInterface {
    private Map<User, List<Task>> mapUserTasks = new HashMap<>();

    @Override
    public void addTask(User user, Task task) {
        if (mapUserTasks.containsKey(user)){
            List<Task> lstTasks = mapUserTasks.get(user);
            lstTasks.add(task);
        } else{
            List<Task> lstTasks = new ArrayList<>();
            lstTasks.add(task);
            mapUserTasks.put(user, lstTasks);
        }
    }

    @Override
    public void cancelTask(User user, Task task) {
        if(mapUserTasks.containsKey(user)){
            List<Task> lstTasks = mapUserTasks.get(user);
            lstTasks.remove(task);
        }
    }

    @Override
    public void updateTaskExecutionDate() {

    }

    @Override
    public List<Task> getTaskByCriteria() {
        return null;
    }
}

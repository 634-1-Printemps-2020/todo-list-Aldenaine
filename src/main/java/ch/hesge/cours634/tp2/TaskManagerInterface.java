package ch.hesge.cours634.tp2;

import java.util.List;

public interface TaskManagerInterface {
    public void addTask(User user, Task task);
    public void cancelTask(User user, Task task);
    public void updateTaskExecutionDate();
    public List<Task> getTaskByCriteria();
}

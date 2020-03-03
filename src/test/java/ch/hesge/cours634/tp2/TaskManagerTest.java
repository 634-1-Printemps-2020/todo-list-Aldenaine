package ch.hesge.cours634.tp2;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class TaskManagerTest {

    @Test
    public void addTask() {
        TaskManager taskManage = new TaskManager();
        User u = new User("bernard", "bernard@hotmail.com");
        Task t = new Task(u, "manger un grec", new Date());
        User u2 = new User("didier", "didier@hotmail.com");
        Task t2 = new Task(u, "manger un tacos", new Date());
        User u3 = new User("josianne", "josianne@hotmail.com");
        Task t3 = new Task(u, "manger un bédo", new Date());
        taskManage.addTask(u, t);
        taskManage.addTask(u2, t2);
        taskManage.addTask(u2, t3);
        taskManage.addTask(u3, t2);
        taskManage.addTask(u3, t3);
        taskManage.addTask(u, t3);
        Assert.assertTrue(taskManage.check(u, t));

    }

    @Test
    public void cancelTask() {
        TaskManager taskManage = new TaskManager();
        User u = new User("bernard", "bernard@hotmail.com");
        Task t = new Task(u, "manger un grec", new Date());
        taskManage.addTask(u, t);
        System.out.println(taskManage.getMapUserTasks().toString());
        taskManage.cancelTask(u, t);
        System.out.println(taskManage.getMapUserTasks().toString());
        Assert.assertTrue(t.getStatus()==Status.canceled);
    }

    @Test
    public void updateTaskExecutionDate() {
    }

    @Test
    public void getTaskByCriteria() {
    }
}
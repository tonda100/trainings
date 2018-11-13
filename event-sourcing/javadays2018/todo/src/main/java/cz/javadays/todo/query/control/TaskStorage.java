package cz.javadays.todo.query.control;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import cz.javadays.todo.query.entity.Task;


/**
 * TODO write JavaDoc
 *
 * @author Antonin Stoklasek
 */
@ApplicationScoped
public class TaskStorage {

    private List<Task> tasks = new ArrayList<>();


    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getTasks() {
        return tasks;
    }
}

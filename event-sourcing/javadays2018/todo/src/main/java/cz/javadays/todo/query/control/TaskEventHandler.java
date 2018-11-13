package cz.javadays.todo.query.control;

import javax.ejb.Stateless;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

import cz.javadays.todo.cmd.entity.TaskCreatedEvent;
import cz.javadays.todo.query.entity.Task;


/**
 * TODO write JavaDoc
 *
 * @author Antonin Stoklasek
 */
@Stateless
public class TaskEventHandler {


    @Inject
    private TaskStorage storage;

    public void handleTaskCreated(@Observes TaskCreatedEvent event) {
        Task task = new Task();
        task.setId(event.getId());
        task.setName(event.getName());
        task.setWhen(event.getWhen());
        storage.addTask(task);
    }

}

package cz.javadays.todo.cmd.boudary;

import java.util.UUID;

import javax.ejb.Stateless;
import javax.inject.Inject;

import cz.javadays.todo.cmd.entity.TaskCreatedEvent;
import cz.javadays.todo.cmd.entity.TaskInfo;
import net.osomahe.esk.eventstore.boundary.EventStorePublisher;


/**
 * TODO write JavaDoc
 *
 * @author Antonin Stoklasek
 */
@Stateless
public class TaskCmdService {

    @Inject
    private EventStorePublisher publisher;


    public void createTask(TaskInfo taskInfo) {
        TaskCreatedEvent event = new TaskCreatedEvent();
        event.setId(UUID.randomUUID().toString());
        event.setName(taskInfo.getName());
        event.setWhen(taskInfo.getWhen());

        this.publisher.publish(event);
    }
}

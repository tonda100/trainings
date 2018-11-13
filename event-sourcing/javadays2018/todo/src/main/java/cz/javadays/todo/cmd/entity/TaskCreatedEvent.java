package cz.javadays.todo.cmd.entity;

import net.osomahe.esk.eventstore.entity.EventGroupKey;
import net.osomahe.esk.eventstore.entity.EventStoreEvent;
import net.osomahe.esk.eventstore.entity.TopicName;


/**
 * TODO write JavaDoc
 *
 * @author Antonin Stoklasek
 */
@TopicName("todo")
public class TaskCreatedEvent implements EventStoreEvent {

    @EventGroupKey
    private String id;

    private String name;

    private String when;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWhen() {
        return when;
    }

    public void setWhen(String when) {
        this.when = when;
    }

    @Override
    public String toString() {
        return "TaskCreatedEvent{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", when='" + when + '\'' +
                '}';
    }
}

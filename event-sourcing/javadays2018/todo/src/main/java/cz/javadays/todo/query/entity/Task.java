package cz.javadays.todo.query.entity;

/**
 * TODO write JavaDoc
 *
 * @author Antonin Stoklasek
 */
public class Task {

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
        return "Task{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", when='" + when + '\'' +
                '}';
    }
}

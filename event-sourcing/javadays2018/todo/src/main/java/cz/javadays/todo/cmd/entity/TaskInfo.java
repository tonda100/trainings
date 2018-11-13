package cz.javadays.todo.cmd.entity;

/**
 * TODO write JavaDoc
 *
 * @author Antonin Stoklasek
 */
public class TaskInfo {

    private String name;

    private String when;

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
        return "TaskInfo{" +
                "name='" + name + '\'' +
                ", when='" + when + '\'' +
                '}';
    }
}

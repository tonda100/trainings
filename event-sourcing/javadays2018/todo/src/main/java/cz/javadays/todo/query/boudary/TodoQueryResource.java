package cz.javadays.todo.query.boudary;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import cz.javadays.todo.query.control.TaskStorage;
import cz.javadays.todo.query.entity.Task;


/**
 * TODO write JavaDoc
 *
 * @author Antonin Stoklasek
 */
@Path("todos")
public class TodoQueryResource {

    @Inject
    private TaskStorage storage;

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Task> getTaks() {
        return storage.getTasks();

    }

}

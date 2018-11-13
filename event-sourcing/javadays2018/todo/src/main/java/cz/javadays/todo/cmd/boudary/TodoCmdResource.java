package cz.javadays.todo.cmd.boudary;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import cz.javadays.todo.cmd.entity.TaskInfo;


/**
 * TODO write JavaDoc
 *
 * @author Antonin Stoklasek
 */
@Path("todos")
public class TodoCmdResource {

    @Inject
    private TaskCmdService service;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createTask(TaskInfo info){
        service.createTask(info);
        return Response.status(Response.Status.CREATED).build();
    }

}

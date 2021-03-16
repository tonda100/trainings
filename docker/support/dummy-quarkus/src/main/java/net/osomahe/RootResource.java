package net.osomahe;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Map;

@Path("/")
public class RootResource {

    @Inject
    @ConfigProperty(name = "username", defaultValue = "admin")
    String username;
    @Inject
    @ConfigProperty(name = "password", defaultValue = "password")
    String password;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, String> hello() {
        return Map.of("username", username, "password", password);
    }
}
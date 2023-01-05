package pt.cmg.test.eclipse.api.v1.resources.users;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/test")
@Stateless
public class TestResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response get() {

        int number = NumericUtils.generateRandomNumber(5, 20);
        return Response.ok(number).build();
    }

}

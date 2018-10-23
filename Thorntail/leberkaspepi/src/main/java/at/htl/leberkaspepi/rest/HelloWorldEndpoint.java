package at.htl.leberkaspepi.rest;

import at.htl.leberkaspepi.rest.entities.Leberkas;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

@ApplicationScoped
@Path("/leberkas")
public class HelloWorldEndpoint {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response doGet(){
		Leberkas lbk = new Leberkas("Chili", 17.99);
		return Response.ok(lbk).build();
	}

}

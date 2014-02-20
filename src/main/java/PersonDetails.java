package my.jersey.demo;

import my.jersey.demo.pojos.Person;
import my.jersey.demo.services.PersonDetailsService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by meet on 20/2/14.
 */

@Path("/person")
public class PersonDetails {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/details")
    public Person getPersonDetails(){
        return new PersonDetailsService().getPersonDetails();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/insert")
    public Response insertPersonDetails(Person person){
        int status = new PersonDetailsService().insertPersonDetails(person);
        if(status == 0){
            return Response.ok("Person inserted successfully").build();
        } else {
            return Response.ok("Insertion failed.").build();
        }
    }

}

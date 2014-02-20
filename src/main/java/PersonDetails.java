package my.jersey.demo;

import my.jersey.demo.pojos.Person;

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
        Person p = new Person();
        p.setName("ABC");
        p.setSex('F');
        p.setSalary(2);
        return p;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/insert")
    public Response insertPersonDetails(Person person){
        return Response.ok("Person inserted successfully").build();
    }

}

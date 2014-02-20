package my.jersey.demo;

import my.jersey.demo.pojos.Person;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
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

}

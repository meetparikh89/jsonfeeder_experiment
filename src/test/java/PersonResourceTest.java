package my.jersey.demo.tests;

import my.jersey.demo.pojos.Person;
import my.jersey.demo.resources.PersonDetailResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static org.junit.Assert.*;

/**
 * Created by meet on 21/2/14.
 */
public class PersonResourceTest extends JerseyTest{

    @Override
    protected Application configure() {
        return new ResourceConfig(PersonDetailResource.class);
    }

    @Test
    public void getPersonDetailsTest(){
        Response response = target("person/details").request().get();
        Person personArrived = response.readEntity(Person.class);
        assertEquals('F',personArrived.getSex());
    }

    @Test
    public void insertPersonDetailsTest(){
        Person person = new Person();
        person.setName("ABC");
        person.setSex('F');
        person.setSalary(2);

        Entity<Person> personEntity = Entity.entity(person, MediaType.APPLICATION_JSON);
        Response response = target("person/insert").request().post(personEntity);
        assertEquals("Person inserted successfully",response.readEntity(String.class));
    }


}

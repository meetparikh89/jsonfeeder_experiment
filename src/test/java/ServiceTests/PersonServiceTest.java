package my.jersey.demo.tests.ServiceTests;

import my.jersey.demo.otherresources.MsgConstants;
import my.jersey.demo.pojos.Person;
import my.jersey.demo.services.PersonDetailsService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by meet on 4/3/14.
 */
public class PersonServiceTest {

    private PersonDetailsService personDetailsService;

    @Before
    public void setup(){
        personDetailsService = new PersonDetailsService();
    }

    @Test
    public void getPersonDetailsTest(){
        Person p = new Person();
        p.setName("ABC");
        p.setSex('F');
        p.setSalary(2);
        assertEquals(p.getSex(),personDetailsService.getPersonDetails().getSex());
    }

    @Test
    public void insertPersonDetailsTest(){
        Person p = new Person();
        p.setName("ABC");
        p.setSex('F');
        p.setSalary(2);
        assertEquals(MsgConstants.person_insertion_succeeded,personDetailsService.insertPersonDetails(p));
    }

}

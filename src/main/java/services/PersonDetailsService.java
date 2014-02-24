package my.jersey.demo.services;

import my.jersey.demo.otherresources.MsgConstants;
import my.jersey.demo.pojos.Person;

/**
 * Created by meet on 20/2/14.
 */
public class PersonDetailsService {

    public Person getPersonDetails(){
        Person p = new Person();
        p.setName("ABC");
        p.setSex('F');
        p.setSalary(2);
        return p;
    }

    public String insertPersonDetails(Person person){
        return MsgConstants.person_insertion_succeeded;
    }


}

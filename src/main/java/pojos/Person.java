package my.jersey.demo.pojos;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by meet on 20/2/14.
 */

@XmlRootElement
public class Person {

    private String name;
    private char sex;
    private float salary;

    public Person(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}

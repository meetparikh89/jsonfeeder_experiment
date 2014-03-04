package my.jersey.demo.tests.RestResourceTests;

import my.jersey.demo.restresources.CalculatorResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;

import static org.junit.Assert.*;

/**
 * Created by meet on 21/2/14.
 */
public class CalculatorResourceTest extends JerseyTest {

    @Override
    protected Application configure(){
        return new ResourceConfig(CalculatorResource.class);
    }

    @Test
    public void addNumbersTest(){
        float num1 = 4;
        float num2 = 2;
        Response response = target("calc/add/" + num1 + "/" + num2).request().get();
        assertEquals(new Double(6),response.readEntity(Double.class));
    }

    @Test
    public void subtractNumbersTest(){
        float num1 = 4;
        float num2 = 2;
        Response response = target("calc/subtract/" + num1 + "/" + num2).request().get();
        assertEquals(new Double(2),response.readEntity(Double.class));
    }

    @Test
    public void multiplyNumbersTest(){
        float num1 = 4;
        float num2 = 2;
        Response response = target("calc/multiply/" + num1 + "/" + num2).request().get();
        assertEquals(new Double(8),response.readEntity(Double.class));
    }

    @Test
    public void divideNumbersTest(){
        float num1 = 4;
        float num2 = 2;
        Response response = target("calc/div/" + num1 + "/" + num2).request().get();
        assertEquals(new Double(2),response.readEntity(Double.class));
    }

}

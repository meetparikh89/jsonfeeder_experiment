package my.jersey.demo.tests.ServiceTests;

import my.jersey.demo.services.CalculatorService;
import org.junit.Before;
import org.junit.Test;
import static  org.junit.Assert.*;

/**
 * Created by meet on 4/3/14.
 */
public class CalculatorServiceTest {

    private CalculatorService calculatorService;

    @Before
    public void setup(){
        calculatorService = new CalculatorService();
    }

    @Test
    public void addNumberTest(){
        int num1 = 2;
        int num2 = 4;
        assertEquals(new Double(6), new Double(calculatorService.addNumbers(num1,num2)));
    }

    @Test
    public void subtractNumberTest(){
        int num1 = 4;
        int num2 = 2;
        assertEquals(new Double(2), new Double(calculatorService.subtractNumbers(num1,num2)));
    }

    @Test
    public void multiplyNumberTest(){
        int num1 = 2;
        int num2 = 4;
        assertEquals(new Double(8), new Double(calculatorService.multiplyNumbers(num1,num2)));
    }

    @Test
    public void divideNumberTest(){
        int num1 = 4;
        int num2 = 2;
        assertEquals(new Double(2), new Double(calculatorService.divideNumbers(num1,num2)));
    }
}

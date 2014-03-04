package my.jersey.demo.services;

/**
 * Created by meet on 20/2/14.
 */
public class CalculatorService {

    public double addNumbers(double num1, double num2){
        return num1 + num2;
    }

    public double subtractNumbers(double num1, double num2){
        return num1 - num2;
    }

    public double multiplyNumbers(double num1, double num2){
        return num1 * num2;
    }

    public double divideNumbers(double num1, double num2){
        try{
            double result = num1 / num2;
            return result;
        } catch (Exception e){
            return 0;
        }
    }


}

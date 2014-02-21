package my.jersey.demo.restresources;

/**
 * Created by meet on 19/2/14.
 */
import my.jersey.demo.services.CalculatorService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/calc")
public class CalculatorResource {

    @GET
    @Path("/help")
    @Produces(MediaType.TEXT_HTML)
    public Response help(){
        StringBuffer sb = new StringBuffer();
        sb.append("<p>");
        sb.append("/add/{num1}/{num2}");
        sb.append("<br />");
        sb.append("/subtract/{num1}/{num2}");
        sb.append("<br />");
        sb.append("/multiply/{num1}/{num2}");
        sb.append("<br />");
        sb.append("/div/{num1}/{num2}");
        sb.append("</p>");
        return Response.ok(sb.toString()).build();
    }

    @GET
    @Path("/add/{num1}/{num2}")
    @Produces(MediaType.TEXT_PLAIN)
    public Double addNumbers_plain(@PathParam("num1") double num1, @PathParam("num2") double num2){
        CalculatorService calculatorService = new CalculatorService();
        return calculatorService.addNumbers(num1,num2);
    }

    @GET
    @Path("/subtract/{num1}/{num2}")
    @Produces(MediaType.TEXT_PLAIN)
    public Double subtractNumbers_plain(@PathParam("num1") double num1, @PathParam("num2") double num2){
        CalculatorService calculatorService = new CalculatorService();
        return calculatorService.substractNumbers(num1, num2);
    }

    @GET
    @Path("/multiply/{num1}/{num2}")
    @Produces(MediaType.TEXT_PLAIN)
    public Double multiplyNumbers_plain(@PathParam("num1") double num1, @PathParam("num2") double num2){
        CalculatorService calculatorService = new CalculatorService();
        return calculatorService.multiplyNumbers(num1, num2);
    }

    @GET
    @Path("/div/{num1}/{num2}")
    @Produces(MediaType.TEXT_PLAIN)
    public Double divideNumbers_plain(@PathParam("num1") double num1, @PathParam("num2") double num2){
        CalculatorService calculatorService = new CalculatorService();
        return calculatorService.divideNumbers(num1,num2);
    }

}

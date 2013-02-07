package com.rest.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import com.rest.input.Person;
import com.rest.input.PersonRequest;
import com.rest.output.Result;
import com.sun.jersey.core.spi.factory.ResponseBuilderImpl;


@Path("/earth")
public class LoveCalculation {

	@Path("loveme")
	@POST
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response loveme(PersonRequest person){
		
		Result result = new Result();
		result.setLoveme("bhool jao");
		result.setPerson1(person.getPerson1());
		result.setPerson2(person.getPerson2());
		
		Response.ResponseBuilder response = Response.status(200); 
		response.entity(result);
		//return result;
		return response.build();
	}

	
	@Path("lovemepathparam/{name1}/{name2}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response testLovePath(@PathParam("name1") String name1,@PathParam("name2") String name2){
		
		
		Result result = new Result();
		result.setLoveme(name1 + "  loves  " + name2);
		
		Response.ResponseBuilder response = Response.status(200); 
		response.entity(result);
		//return result;
		return response.build();
	}
	
	@Path("lovemepathparam1/{name1}/{name2}/{name31}|{name32}|{name33}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response testLovePath(@PathParam("name1") String name1,@PathParam("name2") String name2,@PathParam("name31") String name31, @PathParam("name32") String name32, @PathParam("name33") String name33){
		
		
		Result result = new Result();
		result.setLoveme(name1 + "  loves  " + name2 + " and kabab mein haddi " + name31+"-"+name32+"-"+name33);
		
		Response.ResponseBuilder response = Response.status(200); 
		response.entity(result);
		//return result;
		return response.build();
	}
	
}

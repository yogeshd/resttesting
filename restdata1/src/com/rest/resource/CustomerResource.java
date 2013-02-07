package com.rest.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



import com.sun.jersey.api.core.InjectParam;
import com.yogi.data.model.Customer;
import com.yogi.data.service.CustomerService;

@Component
@Path("/customers")

public class CustomerResource {

	public  static final Logger LOGGER = LoggerFactory.getLogger(CustomerResource.class);
	
	@InjectParam
	CustomerService customerService;
	
	
	@GET	
	@Produces(MediaType.APPLICATION_JSON)
	public List<Customer> getCustomers() {
		LOGGER.debug("Yogi");
		List<Customer> custlist= new ArrayList<Customer>();
		Customer cust= new Customer();
		cust.setEmailaddress("emailaddress");
		custlist.add(cust);
		
		LOGGER.debug(""+customerService);
		
		
		return customerService.getCustomers();
	}
	
	
	@GET
	@Path("{customerId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Customer getCustomer(@PathParam("customerId")String customerId) {
		
		Customer cust=new Customer();
		cust.setEmailaddress("emailaddress");
		
		return cust;
	}	

	@PUT	
	@Path("/update")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Customer updateCustomer(Customer cust) {
		
		//Customer cust=new Customer();
		cust.setEmailaddress("emailaddress");
		
		return cust;
	}	

	@POST
	@Path("/create")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Customer createCustomer(Customer cust) {
		
		//Customer cust=new Customer();
		cust.setEmailaddress("emailaddress");
		
		return cust;
	}	

	@DELETE
	@Path("{customerId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteCustomer(@PathParam("customerId")String customerId) {
		
		Response.ResponseBuilder response = Response.status(Response.Status.OK);
		response.entity("done");
		return response.build();
	}	

}

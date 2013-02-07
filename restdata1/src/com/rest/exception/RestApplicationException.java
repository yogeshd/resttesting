package com.rest.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;





@Provider
public class RestApplicationException implements ExceptionMapper<Throwable> {
	 
	public  static final Logger LOGGER = LoggerFactory.getLogger(RestApplicationException.class);
	@Override
	public Response toResponse(Throwable arg0) {
		// TODO Auto-generated method stub
		arg0.printStackTrace();
		LOGGER.error(arg0.getMessage());
		Response.ResponseBuilder response = Response.status(Response.Status.NOT_FOUND);
		response.entity(arg0);
		return response.build();
	}

}

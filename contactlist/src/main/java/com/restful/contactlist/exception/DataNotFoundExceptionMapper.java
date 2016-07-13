package com.restful.contactlist.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.restful.contactlist.model.CustomErrorMessage;

@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException> {

	@Override
	public Response toResponse(DataNotFoundException ex) {
		CustomErrorMessage message = new CustomErrorMessage(ex.getMessage(), 404);
		return Response.status(Status.NOT_FOUND)
			   .entity(message)
			   .build();
	}

}

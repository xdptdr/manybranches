package com.github.xdptdr.mbjaxrs.a.ubi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

@Provider
@Path("/ubi")
@UBI()
public class UbiEndpoint {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response get() {
		return Response.ok("Hello from UBI").build();
	}

}

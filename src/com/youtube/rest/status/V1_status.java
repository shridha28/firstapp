package com.youtube.rest.status;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/welcome/")
public class V1_status
{
				@GET
				@Produces(MediaType.TEXT_HTML)
				public String returnTitle()
				{
					System.out.println("whts d hell");
				return "<p>Restful webservices</p>";	
				}
				
}

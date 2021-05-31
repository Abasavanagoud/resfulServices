package com.patyam.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
//make class accessible over the network by annotated with @path("specify the direct accessible uri")
@Path("/paytamwallet")
public class PaytamResources {
	//made method as Web Resource method by annotating with http method designator (@GET,@POST...
	@GET
	//set response format 
	@Produces("text/plain")
	public double getWalletBal(@QueryParam("mobileno") String mobileno) {
		//perform bussiness logic
		return 48245.25;
	}
	
}

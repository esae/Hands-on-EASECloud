package ch.fhnw.ease.easecloud.service;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import ch.fhnw.ease.easecloud.business.MyBean;

@RequestScoped
@Path("MyService")
public class MyService {
	
	@Inject 
	private MyBean myBean;
	
	@GET
	public String getName()
	{
		//return runner.myRunner(); 
		return "Hallo I am \"My Service\". Well, and the current ID is: " + myBean.getID();
	}

}

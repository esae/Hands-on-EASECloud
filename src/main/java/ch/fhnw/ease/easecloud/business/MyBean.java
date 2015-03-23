package ch.fhnw.ease.easecloud.business;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ch.fhnw.ease.easecloud.domain.MyData;

/**
 * Session Bean implementation class MyBean
 */
@Stateless
@LocalBean
public class MyBean {
	
	@PersistenceContext(unitName="primary")
	private EntityManager entityManager;

    public String getID()
    {
    	MyData myData = new MyData();
    	myData.setName("Test Name");
    	entityManager.persist(myData);
    	return myData.getId().toString();
    }

}

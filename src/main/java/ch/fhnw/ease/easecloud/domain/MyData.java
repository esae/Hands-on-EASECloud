package ch.fhnw.ease.easecloud.domain;

import java.lang.Long;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: MyData
 *
 */
@Entity
public class MyData {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
  
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
   
}

package hibernate.hibernate.mapping.manytoone.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Dept {
	@Id
	private int id;
	private String name;
	private String Building;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBuilding() {
		return Building;
	}
	public void setBuilding(String building) {
		Building = building;
	}
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}

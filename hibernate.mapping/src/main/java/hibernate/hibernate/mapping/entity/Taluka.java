package hibernate.hibernate.mapping.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Taluka {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public Taluka() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Taluka [id=" + id + ", name=" + name + ", towns=" + towns + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Town> getTowns() {
		return towns;
	}

	public void setTowns(List<Town> towns) {
		this.towns = towns;
	}

	private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "taluka_town_fk")
    private List<Town> towns;

}
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
public class District {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "district_taluka_fk")
    private List<Taluka> talukas;

	public District() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "District [id=" + id + ", name=" + name + ", talukas=" + talukas + "]";
	}

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

	public List<Taluka> getTalukas() {
		return talukas;
	}

	public void setTalukas(List<Taluka> talukas) {
		this.talukas = talukas;
	}

}

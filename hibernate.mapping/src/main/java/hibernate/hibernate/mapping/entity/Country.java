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
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public Country() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + ", region=" + region + ", states=" + states + "]";
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

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public List<State> getStates() {
		return states;
	}

	public void setStates(List<State> states) {
		this.states = states;
	}

	private String name;
    private String region;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "country_state_fk")
    private List<State> states;

}
package geoghraphy.location.entity;

public class taluka {
	private int tid;
	private String name;
	private int did;
	private String state;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getName() {
		return name;
	}
	public taluka() {
		super();
		// TODO Auto-generated constructor stub
	}
	public taluka(int tid, String name, int did, String state, String country, String conti) {
		super();
		this.tid = tid;
		this.name = name;
		this.did = did;
		this.state = state;
		this.country = country;
		this.conti = conti;
	}
	@Override
	public String toString() {
		return "taluka [tid=" + tid + ", name=" + name + ", did=" + did + ", state=" + state + ", country=" + country
				+ ", conti=" + conti + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getConti() {
		return conti;
	}
	public void setConti(String conti) {
		this.conti = conti;
	}
	private String country;
	private String conti;
}

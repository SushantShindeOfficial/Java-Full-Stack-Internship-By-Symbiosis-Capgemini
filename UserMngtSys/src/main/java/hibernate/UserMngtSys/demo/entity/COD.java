package hibernate.UserMngtSys.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class COD {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codId;
	private double amount;
	@ManyToOne
	private User user;
	public COD() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "COD [codId=" + codId + ", amount=" + amount + ", user=" + user + "]";
	}
	public int getCodId() {
		return codId;
	}
	public void setCodId(int codId) {
		this.codId = codId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
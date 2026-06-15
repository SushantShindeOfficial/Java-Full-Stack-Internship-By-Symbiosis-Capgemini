package project.finalproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class CustomerQuery {
	@Id
	private int id;
	@OneToOne
	private ShippingDetails shippingdetails;
	@OneToOne
	private Invoice invoice;
	public CustomerQuery() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ShippingDetails getShippingdetails() {
		return shippingdetails;
	}
	public void setShippingdetails(ShippingDetails shippingdetails) {
		this.shippingdetails = shippingdetails;
	}
	public Invoice getInvoice() {
		return invoice;
	}
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	@Override
	public String toString() {
		return "CustomerQuery [id=" + id + ", shippingdetails=" + shippingdetails + ", invoice=" + invoice + "]";
	}
	
	

}

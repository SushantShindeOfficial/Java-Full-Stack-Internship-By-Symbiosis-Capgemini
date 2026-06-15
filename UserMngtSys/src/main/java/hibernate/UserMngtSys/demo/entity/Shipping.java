package hibernate.UserMngtSys.demo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Shipping {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int shippingId;
	private String shippingStatus;
	private Date expectedDeliveryDate;
	@ManyToOne
	private Address deliveryAddress;
	public int getShippingId() {
		return shippingId;
	}
	public void setShippingId(int shippingId) {
		this.shippingId = shippingId;
	}
	public String getShippingStatus() {
		return shippingStatus;
	}
	public void setShippingStatus(String shippingStatus) {
		this.shippingStatus = shippingStatus;
	}
	public Date getExpectedDeliveryDate() {
		return expectedDeliveryDate;
	}
	public void setExpectedDeliveryDate(Date expectedDeliveryDate) {
		this.expectedDeliveryDate = expectedDeliveryDate;
	}
	public Address getDeliveryAddress() {
		return deliveryAddress;
	}
	public void setDeliveryAddress(Address deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	@Override
	public String toString() {
		return "Shipping [shippingId=" + shippingId + ", shippingStatus=" + shippingStatus + ", expectedDeliveryDate="
				+ expectedDeliveryDate + ", deliveryAddress=" + deliveryAddress + "]";
	}
	public Shipping() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
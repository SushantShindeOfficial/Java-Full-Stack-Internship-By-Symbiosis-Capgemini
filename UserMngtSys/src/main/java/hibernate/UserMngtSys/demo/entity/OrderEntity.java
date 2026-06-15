package hibernate.UserMngtSys.demo.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class OrderEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	private Date orderDate;
	private double totalAmount;
	private String orderStatus;
	@ManyToOne
	private User user;
	@ManyToMany
	private List<Product> products;
	@OneToOne(cascade = CascadeType.ALL)
	private PaymentMode paymentMode;
	@OneToOne(cascade = CascadeType.ALL)
	private Shipping shipping;
	@OneToOne(cascade = CascadeType.ALL)
	private Invoice invoice;
	@OneToOne(cascade = CascadeType.ALL)
	private Tracking tracking;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public PaymentMode getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(PaymentMode paymentMode) {
		this.paymentMode = paymentMode;
	}
	public Shipping getShipping() {
		return shipping;
	}
	public void setShipping(Shipping shipping) {
		this.shipping = shipping;
	}
	public Invoice getInvoice() {
		return invoice;
	}
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	public Tracking getTracking() {
		return tracking;
	}
	public void setTracking(Tracking tracking) {
		this.tracking = tracking;
	}
	@Override
	public String toString() {
		return "OrderEntity [orderId=" + orderId + ", orderDate=" + orderDate + ", totalAmount=" + totalAmount
				+ ", orderStatus=" + orderStatus + ", user=" + user + ", products=" + products + ", paymentMode="
				+ paymentMode + ", shipping=" + shipping + ", invoice=" + invoice + ", tracking=" + tracking + "]";
	}
	public OrderEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
package project.finalproject.entity;

import java.util.List;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Orders {
		@Id
		private int oId;
		private String name;
		@OneToMany
		private List<Product> products;
		@ManyToOne
		private PaymentMode paymentmode;
		@ManyToMany(targetEntity=ShippingDetails.class)
		private Set<ShippingDetails> shippingDetails;
		@ManyToMany(targetEntity = Invoice.class)
		private Set<Invoice> invoice;
		@ManyToMany(targetEntity = Tracking.class)
		private Set<Tracking> tracking;
		public Orders() {
			super();
			// TODO Auto-generated constructor stub
		}
		public int getoId() {
			return oId;
		}
		public void setoId(int oId) {
			this.oId = oId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public List<Product> getProducts() {
			return products;
		}
		public void setProducts(List<Product> products) {
			this.products = products;
		}
		public PaymentMode getPaymentmode() {
			return paymentmode;
		}
		public void setPaymentmode(PaymentMode paymentmode) {
			this.paymentmode = paymentmode;
		}
		
		public Set<ShippingDetails> getShippingDetails() {
			return shippingDetails;
		}
		public void setShippingDetails(Set<ShippingDetails> shippingDetails) {
			this.shippingDetails = shippingDetails;
		}
		public Set<Invoice> getInvoice() {
			return invoice;
		}
		public void setInvoice(Set<Invoice> invoice) {
			this.invoice = invoice;
		}
		public Set<Tracking> getTracking() {
			return tracking;
		}
		public void setTracking(Set<Tracking> tracking) {
			this.tracking = tracking;
		}
		@Override
		public String toString() {
			return "Orders [oId=" + oId + ", name=" + name + ", products=" + products + ", paymentmode=" + paymentmode
					+ ", shippingDetails=" + shippingDetails + ", invoice=" + invoice + ", tracking=" + tracking + "]";
		}
		
		
}

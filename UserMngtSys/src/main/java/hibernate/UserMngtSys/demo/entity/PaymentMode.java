package hibernate.UserMngtSys.demo.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PaymentMode {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int paymentModeId;
	private Date paymentDate;
	private boolean paymentStatus;
	@OneToOne(cascade = CascadeType.ALL)
	private COD cod;
	@OneToOne(cascade = CascadeType.ALL)
	private UPI upi;
	@OneToOne(cascade = CascadeType.ALL)
	private Card card;
	public int getPaymentModeId() {
		return paymentModeId;
	}
	public void setPaymentModeId(int paymentModeId) {
		this.paymentModeId = paymentModeId;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public boolean isPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(boolean paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public COD getCod() {
		return cod;
	}
	public void setCod(COD cod) {
		this.cod = cod;
	}
	public UPI getUpi() {
		return upi;
	}
	public void setUpi(UPI upi) {
		this.upi = upi;
	}
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	@Override
	public String toString() {
		return "PaymentMode [paymentModeId=" + paymentModeId + ", paymentDate=" + paymentDate + ", paymentStatus="
				+ paymentStatus + ", cod=" + cod + ", upi=" + upi + ", card=" + card + "]";
	}
	public PaymentMode() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
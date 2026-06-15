package project.finalproject.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class PaymentMode {
	@Id
	private int pmid;
	@OneToOne
	private Cod cod;
	@OneToOne
	private Upi upi;
	@OneToOne
	private Card card;
	private Date dateofpayment;
	private boolean status;
	public PaymentMode() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPmid() {
		return pmid;
	}
	public void setPmid(int pmid) {
		this.pmid = pmid;
	}
	public Cod getCod() {
		return cod;
	}
	public void setCod(Cod cod) {
		this.cod = cod;
	}
	public Upi getUpi() {
		return upi;
	}
	public void setUpi(Upi upi) {
		this.upi = upi;
	}
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	public Date getDateofpayment() {
		return dateofpayment;
	}
	public void setDateofpayment(Date dateofpayment) {
		this.dateofpayment = dateofpayment;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "PaymentMode [pmid=" + pmid + ", cod=" + cod + ", upi=" + upi + ", card=" + card + ", dateofpayment="
				+ dateofpayment + ", status=" + status + "]";
	}
	
	
}

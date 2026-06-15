package hibernate.UserMngtSys.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Feedback {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int feedbackId;
	private String customerQuery;
	private String companyResponse;
	@ManyToOne
	private User user;
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Feedback [feedbackId=" + feedbackId + ", customerQuery=" + customerQuery + ", companyResponse="
				+ companyResponse + ", user=" + user + "]";
	}
	public int getFeedbackId() {
		return feedbackId;
	}
	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}
	public String getCustomerQuery() {
		return customerQuery;
	}
	public void setCustomerQuery(String customerQuery) {
		this.customerQuery = customerQuery;
	}
	public String getCompanyResponse() {
		return companyResponse;
	}
	public void setCompanyResponse(String companyResponse) {
		this.companyResponse = companyResponse;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}

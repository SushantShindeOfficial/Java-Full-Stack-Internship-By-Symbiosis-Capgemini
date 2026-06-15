package project.finalproject.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class CompanyResponse {
		@Id
		private int id;
		@ManyToMany(targetEntity = CustomerQuery.class)
		private Set<CustomerQuery> customerQueries;
		private String message;
		public CompanyResponse() {
			super();
			// TODO Auto-generated constructor stub
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public Set<CustomerQuery> getCustomerQueries() {
			return customerQueries;
		}
		public void setCustomerQueries(Set<CustomerQuery> customerQueries) {
			this.customerQueries = customerQueries;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		@Override
		public String toString() {
			return "CompanyResponse [id=" + id + ", customerQueries=" + customerQueries + ", message=" + message + "]";
		}
		
		

}

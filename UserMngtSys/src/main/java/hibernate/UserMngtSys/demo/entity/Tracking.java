package hibernate.UserMngtSys.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tracking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int trackingId;
	private String trackingNumber;
	private String currentLocation;
	private String deliveryStatus;
	@Override
	public String toString() {
		return "Tracking [trackingId=" + trackingId + ", trackingNumber=" + trackingNumber + ", currentLocation="
				+ currentLocation + ", deliveryStatus=" + deliveryStatus + "]";
	}
	public Tracking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getTrackingId() {
		return trackingId;
	}
	public void setTrackingId(int trackingId) {
		this.trackingId = trackingId;
	}
	public String getTrackingNumber() {
		return trackingNumber;
	}
	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}
	public String getCurrentLocation() {
		return currentLocation;
	}
	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}
	public String getDeliveryStatus() {
		return deliveryStatus;
	}
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
}
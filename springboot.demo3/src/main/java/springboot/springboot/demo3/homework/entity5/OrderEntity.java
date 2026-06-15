package springboot.springboot.demo3.homework.entity5;

import java.util.List;

public class OrderEntity {
	private int orderId;
	private String orderDate;
	private double totalAmount;
	private String orderStatus;
	private User user;
	private List<Product> products;
	private PaymentMode paymentMode;
	private Shipping shipping;
	private Invoice invoice;
	private Tracking tracking;
}

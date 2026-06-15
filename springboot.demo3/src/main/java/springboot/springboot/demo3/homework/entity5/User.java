package springboot.springboot.demo3.homework.entity5;

import java.util.Date;
import java.util.List;

public class User {
	private int userId;
	private String fullName;
	private String aadharNumber;
	private String panNumber;
	private String email;
	private String mobileNumber;
	private Date dateOfBirth;
	private List<OrderEntity> orders;
	private List<ProductReview> reviews;
}

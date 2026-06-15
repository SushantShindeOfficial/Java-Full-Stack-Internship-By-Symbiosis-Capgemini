package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Orders;
import project.finalproject.repository.OrderRepository;
import project.finalproject.service.OrdersSaveService;

@Service
public class OrdersSaveServiceImple implements OrdersSaveService{
	@Autowired
	private OrderRepository orderRepository;

	public OrdersSaveServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Orders saveOrdersData(Orders orders) {
		// TODO Auto-generated method stub
		return orderRepository.save(orders);
	}

}

package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.repository.OrderRepository;
import project.finalproject.service.OrdersDeleteService;

@Service
public class OrdersDeleteServiceImple implements OrdersDeleteService{
	@Autowired
	private OrderRepository orderRepository;

	public OrdersDeleteServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deleteOrdersData(int oId) {
		// TODO Auto-generated method stub
		orderRepository.deleteById(oId);
	}

}

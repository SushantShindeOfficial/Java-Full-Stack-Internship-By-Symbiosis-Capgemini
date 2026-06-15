package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Orders;
import project.finalproject.repository.OrderRepository;
import project.finalproject.service.OrdersFetchService;

@Service
public class OrdersFetchServiceImple implements OrdersFetchService{
	@Autowired
	private OrderRepository orderRepository;

	public OrdersFetchServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Orders fetchOrdersData(int oId) {
		// TODO Auto-generated method stub
		return orderRepository.findById(oId).get();
	}

}

package project.finalproject.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Orders;
import project.finalproject.repository.OrderRepository;
import project.finalproject.service.OrdersFetchAllService;

@Service
public class OrdersFetchAllServiceImple implements OrdersFetchAllService{
	@Autowired
	private OrderRepository orderRepository;

	public OrdersFetchAllServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Orders> fetchAllOrdersData() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}

}

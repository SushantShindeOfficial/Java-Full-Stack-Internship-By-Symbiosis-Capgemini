package project.finalproject.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.finalproject.entity.Orders;
import project.finalproject.repository.OrderRepository;
import project.finalproject.service.OrdersUpdateService;

@Service
public class OrdersUpdateServiceImple implements OrdersUpdateService{
	@Autowired
	private OrderRepository orderRepository;

	public OrdersUpdateServiceImple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Orders updateOrdersData(Orders orders, int oId) {
		// TODO Auto-generated method stub
		Orders existingEntity = orderRepository.findById(oId).get();
		Orders o1 = project.finalproject.factory.OrdersFactory.createOrders();
		org.springframework.beans.BeanUtils.copyProperties(existingEntity, o1);
		o1.setName(orders.getName());
		o1.setProducts(orders.getProducts());
		o1.setPaymentmode(orders.getPaymentmode());
		o1.setShippingDetails(orders.getShippingDetails());
		o1.setInvoice(orders.getInvoice());
		o1.setTracking(orders.getTracking());
		return orderRepository.save(o1);
	}

}

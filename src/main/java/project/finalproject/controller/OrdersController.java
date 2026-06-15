package project.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import project.finalproject.entity.Orders;
import project.finalproject.serviceimple.OrdersSaveServiceImple;
import project.finalproject.serviceimple.OrdersFetchServiceImple;
import project.finalproject.serviceimple.OrdersFetchAllServiceImple;
import project.finalproject.serviceimple.OrdersUpdateServiceImple;
import project.finalproject.serviceimple.OrdersDeleteServiceImple;

@CrossOrigin
@RestController
@RequestMapping("/orders")
public class OrdersController {
	@Autowired
	private OrdersSaveServiceImple ordersSaveServiceImple;

	@Autowired
	private OrdersUpdateServiceImple ordersUpdateServiceImple;

	@Autowired
	private OrdersDeleteServiceImple ordersDeleteServiceImple;

	@Autowired
	private OrdersFetchServiceImple ordersFetchServiceImple;

	@Autowired
	private OrdersFetchAllServiceImple ordersFetchAllServiceImple;

	@PostMapping("/saveOrders")
	public ResponseEntity<Orders> saveOrders(@RequestBody Orders orders) {
		Orders e1 = ordersSaveServiceImple.saveOrdersData(orders);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.CREATED);
	}

	@PutMapping("/updateOrders/{oId}")
	public ResponseEntity<Orders> updateOrders(@RequestBody Orders orders, @PathVariable int oId) {
		Orders e1 = ordersUpdateServiceImple.updateOrdersData(orders, oId);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.CREATED);
	}

	@DeleteMapping("/deleteOrders/{oId}")
	public ResponseEntity<String> deleteOrders(@PathVariable int oId) {
		ordersDeleteServiceImple.deleteOrdersData(oId);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity("Orders deleted Successfully", HttpStatus.OK);
	}

	@GetMapping("/SingleOrders/{oId}")
	public ResponseEntity<Orders> singleOrdersData(@PathVariable int oId) {
		Orders e1 = ordersFetchServiceImple.fetchOrdersData(oId);
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(e1, HttpStatus.OK);
	}

	@GetMapping("/AllOrdersData")
	public ResponseEntity<List<Orders>> allOrdersData() {
		List<Orders> l1 = ordersFetchAllServiceImple.fetchAllOrdersData();
		return project.finalproject.factory.ResponseEntityFactory.createResponseEntity(l1, HttpStatus.OK);
	}
}

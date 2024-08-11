package edu.sabanciuniv.controller;

import edu.sabanciuniv.entity.Order;
import edu.sabanciuniv.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order")
public class OrderController {
    private final OrderService orderService;
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    @GetMapping("/all")
    public List<Order> getAllOrders(){
        return orderService.getAllOrders();
    }

    @GetMapping("/id/{id}")
    public Order getOrderById(@PathVariable Integer id){
        return orderService.getOrderById(id);
    }

    @PostMapping("/insert")
    public Order insertOrder(@RequestBody Order order){
        return orderService.insertOrder(order);
    }

    @PutMapping("/update/{id}")
    public Order updateOrder(@RequestBody Order order, @PathVariable Long id){
        return orderService.updateOrderById(order, id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteOrderById(@PathVariable Integer id){
        orderService.deleteOrderById(id);
    }

    @DeleteMapping("/delete-all")
    public void deleteAllOrders(){
        orderService.deleteAllOrders();
    }
}

package edu.sabanciuniv.service;

import edu.sabanciuniv.entity.Order;
import edu.sabanciuniv.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class OrderService {
    private final OrderRepository orderRepository;
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }

    public Order getOrderById(Integer id){
        return orderRepository.findById(id).orElseThrow(() -> new NoSuchElementException(String.format("Order with id %s not found", id)));
    }

    public Order insertOrder(Order order){
        return orderRepository.save(order);
    }

    public Order updateOrderById(Order order, Long id){
        return orderRepository.save(order);
    }

    public void deleteOrderById(Integer id){
        orderRepository.deleteById(id);
    }

    public void deleteAllOrders(){
        orderRepository.deleteAll();
    }
}


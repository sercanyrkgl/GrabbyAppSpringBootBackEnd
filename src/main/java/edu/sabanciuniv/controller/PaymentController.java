package edu.sabanciuniv.controller;

import edu.sabanciuniv.entity.Payment;
import edu.sabanciuniv.service.PaymentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {
    private final PaymentService paymentService;
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    @GetMapping("/all")
    public List<Payment> getAllPayments(){
        return paymentService.getAllPayments();
    }

    @GetMapping("/id/{id}")
    public Payment getPaymentById(@PathVariable Integer id){
        return paymentService.getPaymentById(id);
    }

    @PostMapping("/insert")
    public Payment insertPayment(@RequestBody Payment payment){
        return paymentService.insertPayment(payment);
    }

    @PutMapping("/update/{id}")
    public Payment updatePayment(@RequestBody Payment payment, @PathVariable Long id){
        return paymentService.updatePaymentById(payment, id);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePaymentById(@PathVariable Integer id){
        paymentService.deletePaymentById(id);
    }

    @DeleteMapping("/delete-all")
    public void deleteAllPayments(){
        paymentService.deleteAllPayments();
    }
}

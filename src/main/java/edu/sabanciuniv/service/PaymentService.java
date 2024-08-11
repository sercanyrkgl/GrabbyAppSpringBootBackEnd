package edu.sabanciuniv.service;

import edu.sabanciuniv.entity.Payment;
import edu.sabanciuniv.repository.PaymentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class PaymentService {
    private final PaymentRepository paymentRepository;
    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }
    public List<Payment> getAllPayments(){
        return paymentRepository.findAll();
    }

    public Payment getPaymentById(Integer id){
        return paymentRepository.findById(id).orElseThrow(() -> new NoSuchElementException(String.format("Payment with id %s not found", id)));
    }

    public Payment insertPayment(Payment payment){
        return paymentRepository.save(payment);
    }

    public Payment updatePaymentById(Payment payment, Long id){
        return paymentRepository.save(payment);
    }

    public void deletePaymentById(Integer id){
        paymentRepository.deleteById(id);
    }

    public void deleteAllPayments(){
        paymentRepository.deleteAll();
    }
}


package com.idat.remiseriamvc.demo.app.contracts;


import com.idat.remiseriamvc.demo.domain.entitys.Payment;

import java.util.List;
import java.util.Optional;

public interface IPaymentRepository {
    List<Payment> getAll();

    Optional<Payment> findById(int idPayment);

    Payment save(Payment payment);

    void delete(int idPayment);
}

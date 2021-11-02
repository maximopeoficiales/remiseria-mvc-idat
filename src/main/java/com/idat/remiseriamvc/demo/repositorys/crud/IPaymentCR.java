package com.idat.remiseriamvc.demo.repositorys.crud;

import com.idat.remiseriamvc.demo.models.Payment;
import org.springframework.data.repository.CrudRepository;

public interface IPaymentCR extends CrudRepository<Payment, Integer> {

}

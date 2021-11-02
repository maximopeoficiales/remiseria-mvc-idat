package com.idat.remiseriamvc.demo.infrastructure.web.persistence.crud;

import com.idat.remiseriamvc.demo.domain.entitys.Payment;
import org.springframework.data.repository.CrudRepository;

public interface IPaymentCR extends CrudRepository<Payment, Integer> {

}

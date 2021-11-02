package com.idat.remiseriamvc.demo.infrastructure.web.persistence.crud;

import com.idat.remiseriamvc.demo.domain.entitys.Tariff;
import org.springframework.data.repository.CrudRepository;

public interface ITariffCR extends CrudRepository<Tariff, Integer> {

}

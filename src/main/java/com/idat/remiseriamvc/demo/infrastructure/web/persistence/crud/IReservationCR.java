package com.idat.remiseriamvc.demo.infrastructure.web.persistence.crud;

import com.idat.remiseriamvc.demo.domain.entitys.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface IReservationCR extends CrudRepository<Reservation, Integer> {

}

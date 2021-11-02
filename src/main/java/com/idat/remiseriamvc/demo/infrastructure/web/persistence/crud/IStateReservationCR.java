package com.idat.remiseriamvc.demo.infrastructure.web.persistence.crud;

import com.idat.remiseriamvc.demo.domain.entitys.StateReservation;
import org.springframework.data.repository.CrudRepository;

public interface IStateReservationCR extends CrudRepository<StateReservation, Integer> {

}

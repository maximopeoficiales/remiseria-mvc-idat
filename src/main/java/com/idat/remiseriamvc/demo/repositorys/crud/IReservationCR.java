package com.idat.remiseriamvc.demo.repositorys.crud;

import com.idat.remiseriamvc.demo.models.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface IReservationCR extends CrudRepository<Reservation, Integer> {

}

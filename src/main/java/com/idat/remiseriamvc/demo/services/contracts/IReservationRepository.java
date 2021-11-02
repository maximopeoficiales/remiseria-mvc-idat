package com.idat.remiseriamvc.demo.services.contracts;


import com.idat.remiseriamvc.demo.models.Reservation;

import java.util.List;
import java.util.Optional;

public interface IReservationRepository {
    List<Reservation> getAll();

    Optional<Reservation> findById(int idReservation);

    Reservation save(Reservation reservation);

    void delete(int idReservation);
}

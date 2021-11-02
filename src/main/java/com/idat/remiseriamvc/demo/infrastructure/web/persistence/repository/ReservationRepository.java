package com.idat.remiseriamvc.demo.infrastructure.web.persistence.repository;

import com.idat.remiseriamvc.demo.app.contracts.IReservationRepository;
import com.idat.remiseriamvc.demo.domain.entitys.Reservation;
import com.idat.remiseriamvc.demo.infrastructure.web.persistence.crud.IReservationCR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ReservationRepository implements IReservationRepository {
    @Autowired
    private IReservationCR crud;

    @Override
    public List<Reservation> getAll() {
        return (List<Reservation>) crud.findAll();
    }

    @Override
    public Optional<Reservation> findById(int idReservation) {
        return crud.findById(idReservation);
    }

    @Override
    public Reservation save(Reservation reservation) {
        return crud.save(reservation);
    }

    @Override
    public void delete(int idReservation) {
        crud.deleteById(idReservation);
    }
}

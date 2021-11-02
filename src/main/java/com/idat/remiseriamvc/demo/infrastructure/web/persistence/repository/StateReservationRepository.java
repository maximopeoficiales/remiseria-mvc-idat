package com.idat.remiseriamvc.demo.infrastructure.web.persistence.repository;

import com.idat.remiseriamvc.demo.app.contracts.IStateReservationRepository;
import com.idat.remiseriamvc.demo.domain.entitys.StateReservation;
import com.idat.remiseriamvc.demo.infrastructure.web.persistence.crud.IStateReservationCR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class StateReservationRepository implements IStateReservationRepository {
    @Autowired
    private IStateReservationCR crud;

    @Override
    public List<StateReservation> getAll() {
        return (List<StateReservation>) crud.findAll();
    }

    @Override
    public Optional<StateReservation> findById(int idStateReservation) {
        return crud.findById(idStateReservation);
    }

    @Override
    public StateReservation save(StateReservation stateReservation) {
        return crud.save(stateReservation);
    }

    @Override
    public void delete(int idStateReservation) {
        crud.deleteById(idStateReservation);
    }
}

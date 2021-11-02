package com.idat.remiseriamvc.demo.app.contracts;


import com.idat.remiseriamvc.demo.domain.entitys.StateReservation;

import java.util.List;
import java.util.Optional;

public interface IStateReservationRepository {
    List<StateReservation> getAll();

    Optional<StateReservation> findById(int idStateReservation);

    StateReservation save(StateReservation stateReservation);

    void delete(int idStateReservation);
}

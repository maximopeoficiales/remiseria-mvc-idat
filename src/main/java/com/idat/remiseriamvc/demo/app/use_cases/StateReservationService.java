package com.idat.remiseriamvc.demo.app.use_cases;

import com.idat.remiseriamvc.demo.domain.entitys.StateReservation;
import com.idat.remiseriamvc.demo.infrastructure.web.persistence.repository.StateReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StateReservationService {

    @Autowired
    private StateReservationRepository repository;

    public List<StateReservation> getAll() {
        return repository.getAll();
    }

    public Optional<StateReservation> findById(int idStateReservation) {
        return repository.findById(idStateReservation);
    }

    public StateReservation save(StateReservation stateReservation) {
        return repository.save(stateReservation);
    }

    public boolean delete(int idStateReservation) {
        return this.findById(idStateReservation).map(driver -> {
            repository.delete(idStateReservation);
            return true;
        }).orElse(false);
    }
}

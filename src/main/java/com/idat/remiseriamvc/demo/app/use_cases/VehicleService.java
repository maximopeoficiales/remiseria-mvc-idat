package com.idat.remiseriamvc.demo.app.use_cases;

import com.idat.remiseriamvc.demo.domain.entitys.Vehicle;
import com.idat.remiseriamvc.demo.infrastructure.web.persistence.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository repository;

    public List<Vehicle> getAll() {
        return repository.getAll();
    }

    public Optional<Vehicle> findById(int idVehicle) {
        return repository.findById(idVehicle);
    }

    public Vehicle save(Vehicle vehicle) {
        return repository.save(vehicle);
    }

    public boolean delete(int idVehicle) {
        return this.findById(idVehicle).map(driver -> {
            repository.delete(idVehicle);
            return true;
        }).orElse(false);
    }
}
